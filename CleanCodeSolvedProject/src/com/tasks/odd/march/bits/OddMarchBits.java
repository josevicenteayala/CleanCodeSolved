package com.tasks.odd.march.bits;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Odd bits are getting ready for Bits Battles.
 *
 * Therefore the n bits march from right to left along an 8 bits path. Once the most-significant bit reaches the left their march is done. Each step will be saved as an array of 8 integers.
 *
 * Return an array of all the steps.
 *
 * 1 <= n <= 8
 *
 * NOTE: n != 0, because n represents the number of 1s.
 *
 * Examples
 * This resembles a simple 8 LED chaser:
 *
 * n = 3
 *
 * 00000111
 * 00001110
 * 00011100
 * 00111000
 * 01110000
 * 11100000
 * n = 7
 *
 * 01111111
 * 11111110
 */
public class OddMarchBits {

    public static final int MAX_BIT_NUMBER = 8;
    public static final int INCLUDE_THE_FIRST_COMBINATION = 1;
    public static final int BIT_ONE = 1;

    public static void main(String[] args) {
        /*
        Potential values in decimal notation: 1,3,7,15,
        * 00000001 = 1   << 7 -> 10000000 = 128
        * 00000011 = 3   << 6 -> 11000000 = 192
        * 00000111 = 7   << 5 -> 11100000 = 224
        * 00001111 = 15  << 4 -> 11110000 = 240
        * 00011111 = 31  << 3 -> 11111000 = 248
        * 00111111 = 63  << 2 -> 11111100 = 252
        * 01111111 = 127 << 1 -> 11111110 = 254
        * */
    }

    public static int[] convertDecimalToBinary(int number){
        if(0 > number || number > 254) return new int[]{0,0,0,0,0,0,0,0};
        int[] binary = new int[MAX_BIT_NUMBER];
        int i = 0;
        while( number > 0){
            binary[i] = number % 2;
            number = number / 2;
            i ++;
        }
        return IntStream.range(0, binary.length).map(n -> binary[binary.length - n - 1]).toArray();
    }

    public static int convertBinaryToDecimal(int[] binary){
        int decimalNumber = 0;
        for (int i = 0; i < binary.length;i++){
            if(binary[binary.length - i - 1] == 1) {
                decimalNumber += Math.pow(2, i);
            }
        }
        return decimalNumber;
    }

    public static int[] createBinary(int quantityOfOnes){
        int[] binaryNumber = new int[MAX_BIT_NUMBER];
        Arrays.fill(binaryNumber, MAX_BIT_NUMBER-quantityOfOnes,MAX_BIT_NUMBER, BIT_ONE);
        return binaryNumber;
    }

    public static final int[][] moveBits(int decimalNumber){
        int[][] response = new int[MAX_BIT_NUMBER][1];
        int[] convertDecimalToBinary = convertDecimalToBinary(decimalNumber);
        response[0] = convertDecimalToBinary;
        int numbersOfOnes = Arrays.stream(convertDecimalToBinary).sum();
        int timesToShiftLeft = MAX_BIT_NUMBER - numbersOfOnes;
        for (int i = 1; i <= timesToShiftLeft; i++){
            response[i] = convertDecimalToBinary(decimalNumber << i);
        }
        return response;
    }

    public static final int[][] moveBitsUsingNumberOfBits(int numberOfBits){
        int[] binaryNumber = createBinary(numberOfBits);

        int decimalNumber = convertBinaryToDecimal(binaryNumber);

        int[][] response = new int[MAX_BIT_NUMBER - numberOfBits + 1][1];

        response[0] = binaryNumber;

        for(int i = 1; i<= MAX_BIT_NUMBER - numberOfBits; i++){
            int number = decimalNumber << i;
            int[] binaryNumberShifted = convertDecimalToBinary(number);
            response[i] = binaryNumberShifted;
        }

        return response;
    }

    public static final int [][] moveBitsUsingNumberOfBitsImproved(int numberOfOnes){
        final int rows = MAX_BIT_NUMBER - numberOfOnes + INCLUDE_THE_FIRST_COMBINATION;
        int[][] response = new int[rows][1];
        for(int i = 0; i < rows; i++){
            Arrays.stream(response[i]).forEach(System.out::print);
            Arrays.fill(response, MAX_BIT_NUMBER - numberOfOnes - i, MAX_BIT_NUMBER - i, BIT_ONE);
        }
        return response;
    }
}
