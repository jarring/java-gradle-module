package privacy.hbltsl.module.moduleA.impl;

import privacy.hbltsl.module.moduleA.UserIf;

public class User implements UserIf {

    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public String userName() {
        return null;
    }

}
