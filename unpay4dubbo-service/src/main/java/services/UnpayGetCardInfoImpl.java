package services;

import api.IUnpayGetCardInfo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.dubbo.config.annotation.Service;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import request.GetCardInfoRequest;
import result.GetCardInfoResult;
import util.HttpUtil;
import util.SignUtil;

import java.io.IOException;

/**
 * @author xiaoliang.fan
 * @Title: UnpayGetCardInfoImpl
 * @Description: TODO
 * @date 2019/7/29 15:28
 */
@Service(version = "1.0.0")
public class UnpayGetCardInfoImpl implements IUnpayGetCardInfo {
    public GetCardInfoResult getCardInfo(GetCardInfoRequest getCardInfoRequest) {

        String url = "https://openapi.unionpay.com/upapi/cardbintest/cardinfo?"
                        + "token=" + getCardInfoRequest.getToken();

        String body = "{\"cardNo\":\"" + getCardInfoRequest.getCardNo()+ "\"}";   //6214830215395277

        String secret = "fxl080071";

        // 时间戳
        long ts = System.currentTimeMillis();
        // 计算签名
        String sign = SignUtil.sign(JSONObject.parseObject(body).toString(), String.valueOf(ts), secret);

        // 发送请求
        CloseableHttpResponse httpResponse = null;
        String result = null;
        try {
            httpResponse = HttpUtil.httpPost(url + "&ts=" + ts + "&sign=" + sign,
                    JSONObject.parseObject(body));

            result = EntityUtils.toString(httpResponse.getEntity(),"utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 打印请求结果
        System.out.println(result);

        JSONObject jsonObject = JSON.parseObject(result);

        GetCardInfoResult getCardInfoResult = JSON.parseObject(jsonObject.getJSONObject("data").toJSONString(), GetCardInfoResult.class);

        return getCardInfoResult;
    }
}
