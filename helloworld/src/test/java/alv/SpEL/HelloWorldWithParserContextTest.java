package alv.SpEL;

import org.junit.Before;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HelloWorldWithParserContextTest {

    ExpressionParser parser;

    @Before
    public void setup() {
        parser = new SpelExpressionParser();
    }

    @Test
    public void helloWorldParsedWithDifferentPrefixAndSuffixOK() {
        Expression exp = parser.parseExpression("_'Hello World!'_", new TemplateParserContext("_", "_"));
        String value = exp.getValue(String.class);
        assertThat(value, is("Hello World!"));
    }
}