package com.proftelran.Homework.userRequestStorageSystem;

import java.util.Objects;

public class User {
    private String name;
    private boolean ability = true;

    public boolean isAbility() {
        return ability;
    }

    public void setAbility(boolean ability) {
        this.ability = ability;
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return this.name;
    }

}
