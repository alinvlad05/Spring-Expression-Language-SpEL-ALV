package alv.SpEL;

import org.junit.Before;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class StaticConstantFieldAccessInNestedClassTest {

    ExpressionParser parser;

    @Before
    public void setup() {
        parser = new SpelExpressionParser();
    }

    @Test
    public void staticConstantFieldAccessInNestedClassWorksOK() {
        Expression exp = parser.parseExpression("T(domain.alv.SpEL.MyClass$MyNestedClass).VALUE");
        Integer value = exp.getValue(Integer.class);
        assertThat(value, is(10));
    }
}
