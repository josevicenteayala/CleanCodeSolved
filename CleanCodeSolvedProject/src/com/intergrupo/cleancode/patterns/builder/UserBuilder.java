package com.intergrupo.cleancode.patterns.builder;

public interface UserBuilder {
    User.Builder setName(String name);
    User.Builder setIdentification(int identification);
    User.Builder setLastName(String lastName);
    User.Builder setDirection(String direction);

}
