package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by lenovo on 2016/10/01.
 */
public class UserAdvice implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("环绕前置增强");
        Object result = invocation.proceed();
        System.out.println("环绕后置增强");
        return result;
    }
}
