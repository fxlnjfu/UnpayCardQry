package request;

import java.io.Serializable;

/**
 * @author xiaoliang.fan
 * @Title: GetCardInfoRequest
 * @Description: TODO
 * @date 2019/7/29 15:07
 */
public class GetCardInfoRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cardNo;

    private String token;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "GetCardInfoRequest{" +
                "cardNo='" + cardNo + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
