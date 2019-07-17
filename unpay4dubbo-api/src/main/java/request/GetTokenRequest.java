package request;

import java.io.Serializable;

/**
 * @author xiaoliang.fan
 * @Title: GetTokenRequest
 * @Description: TODO
 * @date 2019/7/15 10:18
 */
public class GetTokenRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String appId;

    private String appSecret;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    @Override
    public String toString() {
        return "GetTokenRequest{" +
                "appId='" + appId + '\'' +
                ", appSecret='" + appSecret + '\'' +
                '}';
    }
}
