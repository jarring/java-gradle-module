package privacy.hbltsl.module.moduleA;

import privacy.hbltsl.module.moduleA.impl.User;

public interface UserIf {

    String userName();

    static UserIf create(String s) {
        return new User(s);
    }

}
