import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dragon on 2018/1/30.
 */
@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class NTConfigServerGitApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(NTConfigServerGitApplication.class).web(true).run(args);
    }
}
