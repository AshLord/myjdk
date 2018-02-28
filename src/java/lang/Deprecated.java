package java.lang;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @author yang.jin
 * date: 28/02/2018
 * desc:
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {CONSTRUCTOR,FIELD,LOCAL_VARIABLE,METHOD,PACKAGE,MODULE,TYPE})
public @interface Deprecated {

    String since() default "";

    boolean forRemoval() default false;
}
