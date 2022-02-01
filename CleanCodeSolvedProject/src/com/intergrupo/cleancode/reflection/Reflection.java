package com.intergrupo.cleancode.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) {
        Reflection reflection = new Reflection();
        try {
            Method method = reflection.getClass().getMethod("printSomething", null);
            method.invoke(reflection,null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void printSomething(){
        System.out.println("Print something");
    }
}
