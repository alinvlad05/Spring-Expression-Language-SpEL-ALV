package alv.SpEL;

import org.junit.Before;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HelloWorldTest {

    ExpressionParser parser;

    @Before
    public void setup() {
        parser = new SpelExpressionParser();
    }

    @Test
    public void helloWorldParsedOK() {
        Expression expression = parser.parseExpression("'Hello World!'");
        String value = expression.getValue(String.class);
        assertThat(value, is("Hello World!"));
    }
}