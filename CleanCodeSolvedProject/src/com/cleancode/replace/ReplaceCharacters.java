package com.cleancode.replace;

import java.util.Objects;

/**
 * Write a Java program to replace all occurrences of a particular character with another one, avoiding doing loops directly.
 * */
public class ReplaceCharacters {

    /**
     * This method allows to replace a particular character in a text to another character. None parameters should be null
     * @param text parameter that contains the full paragraph
     * @param oldCharacter character to be replaced
     * @param newCharacter the new character requested
     * @return and String with the new paragraph
     * @throws UnsupportedOperationException when some parameter is null
     */
    public static String replaceCharacters(String text, String oldCharacter, String newCharacter) throws UnsupportedOperationException {
        if(Objects.isNull(text)) throw new UnsupportedOperationException("The parameter 'text' can not be null");
        if(Objects.isNull(oldCharacter)) throw new UnsupportedOperationException("The parameter 'oldCharacter' can not be null");
        if(Objects.isNull(newCharacter)) throw new UnsupportedOperationException("The parameter 'newCharacter' can not be null");
        return text.replaceAll(oldCharacter,newCharacter);
    }

    /**
     * Method to validate common scenarios replacing characters
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Test1: Happy path");
        String input = "This is # chain with # character";
        System.out.println(String.format("The input is '%s' and the output is '%s'",input, replaceCharacters(input,"#","@")));

        System.out.println("Test2: text parameter null");
        try{
            replaceCharacters(null,"#","@");
        }catch (UnsupportedOperationException exception){
            System.out.println(String.format("The exception is '%s'",exception.getMessage()));
        }

        System.out.println("Test3: oldCharacter parameter null");
        try{
            replaceCharacters(input,null,"@");
        }catch (UnsupportedOperationException exception){
            System.out.println(String.format("The exception is '%s'",exception.getMessage()));
        }

        System.out.println("Test4: newCharacter parameter null");
        try{
            replaceCharacters(input,"#",null);
        }catch (UnsupportedOperationException exception){
            System.out.println(String.format("The exception is '%s'",exception.getMessage()));
        }
    }

}
