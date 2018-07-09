package privacy.hbltsl.module.moduleB;

import privacy.hbltsl.module.moduleA.UserIf;
import privacy.hbltsl.module.moduleB.impl.Hello;

public interface HelloIf {

    void sayHello(UserIf fromUser, UserIf toUser);

    static HelloIf create() {
        return new Hello();
    }

}
