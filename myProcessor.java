import org.apache.camel.BindToRegistry;
import org.apache.camel.Configuration;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

@Configuration
@BindToRegistry("myProcessor")
public class myProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
       // exchange.getIn().setBody("Hello World");

        System.out.println("in");
        System.out.println(exchange.getIn().getBody(String.class));
    }
}