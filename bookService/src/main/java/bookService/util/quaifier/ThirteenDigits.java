package bookService.util.quaifier;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import javax.inject.Qualifier;

@Qualifier
@Retention(RUNTIME)
@Target({FIELD,TYPE,METHOD})
public @interface ThirteenDigits {}
