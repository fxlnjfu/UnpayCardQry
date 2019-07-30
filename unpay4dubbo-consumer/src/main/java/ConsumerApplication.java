import api.IUnpayGetCardInfo;
import api.IUnpayGetToken;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import request.GetCardInfoRequest;
import request.GetTokenRequest;
import result.GetTokenResult;


/**
 * @author xiaoliang.fan
 * @Title: ConsumerApplication
 * @Description: TODO
 * @date 2019/7/15 11:06
 */
@EnableAutoConfiguration
public class ConsumerApplication {

    private final Logger logger = LoggerFactory.getLogger(ConsumerApplication.class);

    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private IUnpayGetToken iUnpayGetToken;

    @Reference(version = "1.0.0", url = "dubbo://127.0.0.1:12345")
    private IUnpayGetCardInfo iUnpayGetCardInfo;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class).close();
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            //先获取token
            GetTokenRequest getTokenRequest = new GetTokenRequest();
            getTokenRequest.setAppId("up_fc8kz34nzv31_6on4");
            getTokenRequest.setAppSecret("20d3d3a4b4ea2ed71a3c2d1aeb92f52c");

            GetTokenResult getTokenResult = iUnpayGetToken.getToken(getTokenRequest);
            logger.info(getTokenResult.toString());

            //再获取银行卡信息
            GetCardInfoRequest getCardInfoRequest = new GetCardInfoRequest();
            getCardInfoRequest.setCardNo("6214830215395277");
            getCardInfoRequest.setToken(getTokenResult.getToken());

            logger.info(iUnpayGetCardInfo.getCardInfo(getCardInfoRequest).toString());

        };
    }
}
