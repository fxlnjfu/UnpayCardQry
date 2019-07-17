package api;

import request.GetTokenRequest;
import result.GetTokenResult;

/**
 * @author xiaoliang.fan
 * @Title: api.IUnpayGetToken
 * @Description: TODO
 * @date 2019/7/15 10:14
 */
public interface IUnpayGetToken {

    GetTokenResult getToken(GetTokenRequest getTokenRequest);

}
