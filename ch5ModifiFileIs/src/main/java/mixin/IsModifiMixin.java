package mixin;

import Interface.IsModified;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class IsModifiMixin extends DelegatingIntroductionInterceptor implements IsModified {
    @Override
    public boolean isModified() {
        System.out.println("Is not modified");
        return false;
    }
}
