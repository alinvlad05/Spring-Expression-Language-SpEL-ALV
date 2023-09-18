package alv.SpEL;

import org.junit.Before;
import org.junit.Test;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class VariableRegistrationTests {

    ExpressionParser parser;

    @Before
    public void setup() {
        parser = new SpelExpressionParser();
    }

    @Test
    public void variableRegisteredOK() {
        StandardEvaluationContext context = new StandardEvaluationContext();
        context.setVariable("message", "Hello World!");
        String value = parser.parseExpression("#message").getValue(context, String.class);
        assertThat(value, is("Hello World!"));
    }
}