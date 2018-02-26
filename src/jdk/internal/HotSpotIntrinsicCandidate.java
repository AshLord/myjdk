package jdk.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author yang.jin
 * date: 26/02/2018
 * desc:
 */
@Target(value = {ElementType.CONSTRUCTOR,ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface HotSpotIntrinsicCandidate {


}
