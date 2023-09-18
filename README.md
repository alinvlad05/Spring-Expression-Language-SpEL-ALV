# Spring-Expression-Language-SpEL-ALV
 
Spring Expression Language, or SpEL, is also an expression language that provides an extensive set of features to interact with objects within the run time of a Spring‐based application.
It provides functionalities similar to UEL and OGNL, and it’s based on a technology‐agnostic API; thus, other EL implementations can also be integrated. 
For all the subprojects in the Spring portfolio, SpEL offers the use of expression languages for features such as accessing the nested beans, system properties, and so on, with its dynamic expression syntax. 
Because of this, it can be seen as a cross‐cutting subproject that provides utility features.

Every expression defined within the context of SpEL gets parsed and then evaluated. The parsing process is handled by the parsers, which implement the ExpressionParser interface. 
SpelExpressionParser is an implementation of ExpressionParser provided by the SpEL, and it parses the string expressions into compiled Expression objects. 
The instance of a parser becomes thread‐safe when created so it can be reused in many places without a problem.
You can easily create a parser for yourself as shown here:

ExpressionParser parser = new SpelExpressionParser();

After creating the parser, an expression can be parsed with the parseExpression method provided by the ExpressionParser interface. 
The expression that will be parsed is treated as an expression template, and the template is used to define an evaluation block. 
An evaluation block is determined when a literal is delimited by a prefix and a suffix. 
By default in SpEL, the prefix is '#{' and the suffix is '}'. If no prefix and suffix are provided, the expression string is treated as a plaintext literal. 
(This is valid only for an XML configuration. Programmatic parsing does not require a prefix and suffix unless the default values have been overridden.) 
As shown in the XML configuration part of the “Configuring Applications with SpEL” section, the evaluation block definition should be done carefully. 
After creating the parser, the expression can be parsed as in the following:

Expression expression = parser.parseExpression("'Hello World!'");

With the expression instance created, you can invoke the getValue() method to evaluate the expression in the standard evaluation context. 
(You find out about the purpose of the context in a bit.) 
The getValue() method contains numerous overloaded versions, and one of them is the getValue(Class<T> desiredResultType), which takes a java.lang.Class argument in order to set the return type. 
For the string that you parsed you can set the return type to String like this:

String value = expression.getValue(String.class);

The Expression class also contains the setValue() method, so it’s also possible to set the property of an object that exists in the evaluation context.
