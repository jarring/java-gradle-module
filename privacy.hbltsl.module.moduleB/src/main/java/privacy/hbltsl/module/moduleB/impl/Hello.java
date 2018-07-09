package privacy.hbltsl.module.moduleB.impl;

import privacy.hbltsl.module.moduleA.UserIf;
import privacy.hbltsl.module.moduleB.HelloIf;

public class Hello implements HelloIf {

    @Override
    public void sayHello(UserIf fromUser, UserIf toUser) {
        System.out.printf("%s say hello to %s ...\n", fromUser, toUser);
    }

}
