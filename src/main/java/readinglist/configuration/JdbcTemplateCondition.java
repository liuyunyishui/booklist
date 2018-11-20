package readinglist.configuration;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by ly on 2018/11/7.
 */
public class JdbcTemplateCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext,
            AnnotatedTypeMetadata annotatedTypeMetadata) {
        try {
            conditionContext.getClassLoader()
                    .loadClass("org.springframework.jdbc.core.JdbcTemplate");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }

    }

}
