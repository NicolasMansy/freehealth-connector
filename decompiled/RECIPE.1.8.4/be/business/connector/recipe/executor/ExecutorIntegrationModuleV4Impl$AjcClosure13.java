package be.business.connector.recipe.executor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.AroundClosure;

public class ExecutorIntegrationModuleV4Impl$AjcClosure13 extends AroundClosure {
   public ExecutorIntegrationModuleV4Impl$AjcClosure13(Object[] var1) {
      super(var1);
   }

   public Object run(Object[] var1) {
      Object[] var2 = super.state;
      ExecutorIntegrationModuleV4Impl.markAsUndelivered_aroundBody12((ExecutorIntegrationModuleV4Impl)var2[0], (String)var2[1], (JoinPoint)var2[2]);
      return null;
   }
}
