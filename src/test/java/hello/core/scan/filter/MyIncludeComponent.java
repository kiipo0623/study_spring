package hello.core.scan.filter;

import org.springframework.stereotype.Indexed;

import javax.lang.model.element.Element;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented

public @interface MyIncludeComponent {
}
