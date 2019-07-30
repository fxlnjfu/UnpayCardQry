package api;

import request.GetCardInfoRequest;
import result.GetCardInfoResult;

/**
 * @author xiaoliang.fan
 * @Title: IUnpayGetCardInfo
 * @Description: TODO
 * @date 2019/7/29 14:59
 */
public interface IUnpayGetCardInfo {
    GetCardInfoResult getCardInfo(GetCardInfoRequest getCardInfoRequest);
}
