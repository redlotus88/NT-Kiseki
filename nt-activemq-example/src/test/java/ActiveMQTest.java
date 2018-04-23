import com.newtouch.activemq.ActiveMQExampleApplication;
import com.newtouch.activemq.producer.ActiveMQProducer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.Destination;

/**
 * Created by dragon on 2018/4/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ActiveMQExampleApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
@ActiveProfiles("test")
public class ActiveMQTest {

    @Autowired
    private ActiveMQProducer producer;

    @Value("${queue.test}")
    private String testQueue;

    @Test
    public void test() {
    }

    @Test
    public void testMQ() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Send Message " + i);
            producer.sendMessage("myname is index" + i + " !!!");
        }
    }
}
