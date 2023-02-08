package com.functional.programming.real.example;

import com.functional.programming.NoArgFunction;

public class DataLoader {

    public final NoArgFunction<Person> loadPerson;

    public DataLoader(Boolean isDevelopment) {
        this.loadPerson = isDevelopment ? this::loadPersonFake: this::loadPersonReal;
    }

    private Person loadPersonReal(){
        System.out.println("Loading real person");
        return new Person("Real person", 20);
    }

    private Person loadPersonFake(){
        System.out.println("Loading fake person");
        return new Person("Fake person", 200);
    }
}
