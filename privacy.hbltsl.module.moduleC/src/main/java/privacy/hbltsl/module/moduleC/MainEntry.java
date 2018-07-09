package privacy.hbltsl.module.moduleC;

import privacy.hbltsl.module.moduleA.UserIf;
import privacy.hbltsl.module.moduleB.HelloIf;

public class MainEntry {

    public static void main(String [] args) {
        UserIf fromUser = UserIf.create("1");
        UserIf toUser = UserIf.create("2");
        HelloIf.create().sayHello(fromUser, toUser);
    }

}
