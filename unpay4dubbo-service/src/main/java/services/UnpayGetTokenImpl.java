package services;

import api.IUnpayGetToken;
import com.alibaba.fastjson.JSON;
import org.apache.dubbo.config.annotation.Service;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import request.GetTokenRequest;
import result.GetTokenResult;
import util.HttpUtil;

import java.io.IOException;

/**
 * @author xiaoliang.fan
 * @Title: UnpayGetTokenImpl
 * @Description: TODO
 * @date 2019/7/15 10:29
 */
@Service(version = "1.0.0")
public class UnpayGetTokenImpl implements IUnpayGetToken {
    public GetTokenResult getToken(GetTokenRequest getTokenRequest) {

        String url = "https://openapi.unionpay.com/upapi/cardbintest/token?"
                        + "app_id=" + getTokenRequest.getAppId()
                        + "&app_secret=" + getTokenRequest.getAppSecret();

        CloseableHttpResponse httpResponse = null;
        String resultStr = "";
        try {

            httpResponse = HttpUtil.httpGet(url);

            resultStr = EntityUtils.toString(httpResponse.getEntity(), "utf-8");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(resultStr);

        GetTokenResult getTokenResult = JSON.parseObject(resultStr, GetTokenResult.class);

        System.out.println(getTokenResult.toString());

        return getTokenResult;
    }
}
