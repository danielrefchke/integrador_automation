package base;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Define una anotacion para indicar de
 * que manera va a buscar un elemento DynamicElement
 * 
 * @author Daniel Refchke
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface DynBy {
    String id() default "";

    String name() default "";

    String className() default "";

    String xpath() default "";

}
