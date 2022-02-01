package com.intergrupo.cleancode.patterns.builder;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

    private volatile User user;

    @BeforeEach
    void setUp() {
        user = User.Builder.newInstance().build();
    }

    @Test
    void setName() {
    }

    @Test
    void setIdentification() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void setDirection() {
    }

    @Test
    void build() {
        String direction = "Direction";
        String name = "Vincent";
        String lastName = "Ayala";
        int identification = 10;
        user = User.Builder.newInstance()
                .setDirection(direction)
                .setName(name)
                .setLastName(lastName)
                .setIdentification(identification)
                .build();
        assertTrue(user.toString().equals("User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", direction='" + direction + '\'' +
                ", identification=" + identification +
                '}'));
    }
}