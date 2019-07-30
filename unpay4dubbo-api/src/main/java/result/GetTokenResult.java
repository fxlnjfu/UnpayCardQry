package result;

import java.io.Serializable;

/**
 * @author xiaoliang.fan
 * @Title: GetTokenResult
 * @Description: TODO
 * @date 2019/7/15 10:22
 */
public class GetTokenResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private String respCd;

    private String respMsg;

    private String token;

    private int expire_in;

    public String getRespCd() {
        return respCd;
    }

    public void setRespCd(String respCd) {
        this.respCd = respCd;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getExpire_in() {
        return expire_in;
    }

    public void setExpire_in(int expire_in) {
        this.expire_in = expire_in;
    }

    @Override
    public String toString() {
        return "GetTokenResult{" +
                "respCd='" + respCd + '\'' +
                ", respMsg='" + respMsg + '\'' +
                ", token='" + token + '\'' +
                ", expire_in=" + expire_in +
                '}';
    }
}
