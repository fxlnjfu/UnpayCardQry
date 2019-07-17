import api.IUnpayGetToken;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import request.GetTokenRequest;


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

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class).close();
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            GetTokenRequest getTokenRequest = new GetTokenRequest();
            getTokenRequest.setAppId("up_fc8kz34nzv31_6on4");
            getTokenRequest.setAppSecret("20d3d3a4b4ea2ed71a3c2d1aeb92f52c");

            logger.info(iUnpayGetToken.getToken(getTokenRequest).toString());
        };
    }
}
