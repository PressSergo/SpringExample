package Advisors;

import mixin.IsModifiMixin;
import org.springframework.aop.support.DefaultIntroductionAdvisor;

public class IsModifiAdvisor extends DefaultIntroductionAdvisor {
    public IsModifiAdvisor(){
        super(new IsModifiMixin());
    }
}
