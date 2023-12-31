package alv.SpEL;

import alv.SpEL.domain.Employee;
import org.junit.Before;
import org.junit.Test;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class SafeNavigationOperatorsTest {

    ExpressionParser p;

    @Before
    public void setup() {
        p = new SpelExpressionParser();
    }

    @Test
    public void safeNavigationOperatorsWorkOK() {
        Employee employee = new Employee("Mert");
        StandardEvaluationContext context = new StandardEvaluationContext(employee);

        assertThat(p.parseExpression("Address?.Name").getValue(context, String.class), is(nullValue()));
    }
}