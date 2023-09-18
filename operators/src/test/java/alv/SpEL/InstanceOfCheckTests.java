package alv.SpEL;

import org.junit.Before;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class InstanceOfCheckTests {

    ExpressionParser parser;

    @Before
    public void setup() {
        parser = new SpelExpressionParser();
    }

    @Test
    public void instanceOfCheckWorksOK() {
        Expression exp = parser.parseExpression("'Hello' instanceof T(String)");
        Boolean value = exp.getValue(Boolean.class);
        assertThat(value, is(true));
    }
}