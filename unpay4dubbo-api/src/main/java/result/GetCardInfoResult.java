package result;

import java.io.Serializable;

/**
 * @author xiaoliang.fan
 * @Title: GetCardInfoResult
 * @Description: TODO
 * @date 2019/7/29 15:09
 */
public class GetCardInfoResult implements Serializable {
    private static final long serialVersionUID = 1L;

    private String issNm;  //发卡行中文名称

    private String issInsId;    //发卡行机构代码

    private String issAbbr;     //发卡行中文简称

    /**
     * 00-未知
     * 01-借记卡
     * 02-贷记卡
     * 03-准贷记卡
     * 04-借贷合一卡
     * 05-预付费卡
     * 06-半开放式预付费卡
     * 99-单用途预付费卡
     */
    private String cardAttr;    //卡性质

    /**
     * 0-未知 1-银行卡2-行业卡
     */
    private String cardCata;    //卡类别

    /**
     * 01-人民币卡（境内发的人民币银联卡）
     * 02-人民币境外卡（境外发的人民币银联标准卡）
     * 03-多币种卡（境内和境外发的多币种银联标准卡）
     * 04-国际卡（境内发的外币银联标准卡）
     * 05-境外卡（境外发的外币银联标准卡）
     * 06-外资卡（外资银行在境内发的银联标准卡）
     * 07-外卡（5大国际组织）
     * 99-其他
     */
    private String cardClass;   //卡种

    /**
     * 11-9字头银联卡
     * 12-62银联标准卡
     * 13-其他银联标准卡（视同）
     * 01-VISA卡（VIS）银联标识卡
     * 02-万事达卡（MCC）银联标识卡
     * 03-万事顺卡（MAE）银联标识卡
     * 04-JCB卡（JCB）银联标识卡
     * 05-大莱卡（DinnerClub）银联标识卡
     * 06-运通卡（AMX）银联标识卡
     * 07-其他银联标识卡99-其他
     */
    private String cardBrand;   //卡品牌

    /**
     * 00-未知01-公务卡
     * 02-公共缴费类卡03-航空卡
     * 04-学生卡05-社保卡
     * 06-交通卡07-积分卡
     * 08-军人卡09-市民卡
     * 10-商务卡11-旅游卡
     */
    private String cardProd;    //卡产品

    /**
     * 0-未知1-普卡2-银卡3-金卡
     * 4-白金卡5-钻石卡6-无限卡
     */
    private String cardLvl;     //卡等级

    /**
     * 1-磁条2-IC卡3-Fall Back卡
     * 4-虚拟卡5-纯字符卡
     * 6-生物特征卡7-无卡
     */
    private String cardMedia;   //卡介质

    private String hdqrsInsCnNm;    //所属总行机构中文名称

    private String hdqrsInsCnAbbr;  //所属总行机构中文简称

    public String getIssNm() {
        return issNm;
    }

    public void setIssNm(String issNm) {
        this.issNm = issNm;
    }

    public String getIssInsId() {
        return issInsId;
    }

    public void setIssInsId(String issInsId) {
        this.issInsId = issInsId;
    }

    public String getIssAbbr() {
        return issAbbr;
    }

    public void setIssAbbr(String issAbbr) {
        this.issAbbr = issAbbr;
    }

    public String getCardAttr() {
        return cardAttr;
    }

    public void setCardAttr(String cardAttr) {
        this.cardAttr = cardAttr;
    }

    public String getCardCata() {
        return cardCata;
    }

    public void setCardCata(String cardCata) {
        this.cardCata = cardCata;
    }

    public String getCardClass() {
        return cardClass;
    }

    public void setCardClass(String cardClass) {
        this.cardClass = cardClass;
    }

    public String getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    public String getCardProd() {
        return cardProd;
    }

    public void setCardProd(String cardProd) {
        this.cardProd = cardProd;
    }

    public String getCardLvl() {
        return cardLvl;
    }

    public void setCardLvl(String cardLvl) {
        this.cardLvl = cardLvl;
    }

    public String getCardMedia() {
        return cardMedia;
    }

    public void setCardMedia(String cardMedia) {
        this.cardMedia = cardMedia;
    }

    public String getHdqrsInsCnNm() {
        return hdqrsInsCnNm;
    }

    public void setHdqrsInsCnNm(String hdqrsInsCnNm) {
        this.hdqrsInsCnNm = hdqrsInsCnNm;
    }

    public String getHdqrsInsCnAbbr() {
        return hdqrsInsCnAbbr;
    }

    public void setHdqrsInsCnAbbr(String hdqrsInsCnAbbr) {
        this.hdqrsInsCnAbbr = hdqrsInsCnAbbr;
    }

    @Override
    public String toString() {
        return "GetCardInfoResult{" +
                "issNm='" + issNm + '\'' +
                ", issInsId='" + issInsId + '\'' +
                ", issAbbr='" + issAbbr + '\'' +
                ", cardAttr='" + cardAttr + '\'' +
                ", cardCata='" + cardCata + '\'' +
                ", cardClass='" + cardClass + '\'' +
                ", cardBrand='" + cardBrand + '\'' +
                ", cardProd='" + cardProd + '\'' +
                ", cardLvl='" + cardLvl + '\'' +
                ", cardMedia='" + cardMedia + '\'' +
                ", hdqrsInsCnNm='" + hdqrsInsCnNm + '\'' +
                ", hdqrsInsCnAbbr='" + hdqrsInsCnAbbr + '\'' +
                '}';
    }
}
