package alv.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class MyBean {

    @Value("#{systemProperties['user.language']}")
    private String message;

    public String getMessage() {
        return message;
    }
}
