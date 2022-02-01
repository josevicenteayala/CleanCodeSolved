package com.intergrupo.cleancode.patterns.builder;

public class User {
    private final String name;
    private final String lastName;
    private final String direction;
    private final int identification;

    private User(Builder userBuilder){
        this.name = userBuilder.name;
        this.lastName = userBuilder.lastName;
        this.direction = userBuilder.direction;
        this.identification = userBuilder.identification;
    }

    public static class Builder implements UserBuilder{
        private String name;
        private String lastName;
        private String direction;
        private int identification;

        public static Builder newInstance(){
            return new Builder();
        }

        private Builder(){

        }

        @Override
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        @Override
        public Builder setIdentification(int identification) {
            this.identification = identification;
            return this;
        }

        @Override
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        @Override
        public Builder setDirection(String direction) {
            this.direction = direction;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", direction='" + direction + '\'' +
                ", identification=" + identification +
                '}';
    }
}
