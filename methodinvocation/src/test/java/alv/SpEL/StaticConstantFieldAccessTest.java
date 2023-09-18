package alv.SpEL;

import org.junit.Before;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class StaticConstantFieldAccessTest {

    ExpressionParser parser;

    @Before
    public void setup() {
        parser = new SpelExpressionParser();
    }

    @Test
    public void staticConstantFieldAccessWorksOK() {
        Expression exp = parser.parseExpression("T(java.lang.Math).PI");
        Double value = exp.getValue(Double.class);
        assertThat(value, is(3.141592653589793));
    }
}