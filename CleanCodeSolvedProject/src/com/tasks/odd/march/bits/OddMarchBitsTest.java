package com.tasks.odd.march.bits;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddMarchBitsTest {

    @Test
    void convertDecimalToBinaryNumber1() {
        int[] decimalToBinary = OddMarchBits.convertDecimalToBinary(1);
        assertEquals(1, decimalToBinary[7]);
    }

    @Test
    void convertDecimalToBinaryNumber2() {
        int[] decimalToBinary = OddMarchBits.convertDecimalToBinary(2);
        assertAll(
                () -> assertEquals(1, decimalToBinary[6]),
                () -> assertEquals(0, decimalToBinary[7])
        );
    }

    @Test
    void convertDecimalToBinaryNumber3() {
        int[] decimalToBinary = OddMarchBits.convertDecimalToBinary(3);
        assertAll(
                () -> assertEquals(1, decimalToBinary[7]),
                () -> assertEquals(1, decimalToBinary[6])
        );
    }

    @Test
    void convertDecimalToBinaryNumber7() {
        int[] decimalToBinary = OddMarchBits.convertDecimalToBinary(7);
        assertAll(
                () -> assertEquals(1, decimalToBinary[7]),
                () -> assertEquals(1, decimalToBinary[6]),
                () -> assertEquals(1, decimalToBinary[5])
        );
    }

    @Test
    void convertDecimalToBinaryNumber15() {
        int[] decimalToBinary = OddMarchBits.convertDecimalToBinary(15);
        assertAll(
                () -> assertEquals(1, decimalToBinary[7]),
                () -> assertEquals(1, decimalToBinary[6]),
                () -> assertEquals(1, decimalToBinary[5]),
                () -> assertEquals(1, decimalToBinary[4])
        );
    }

    @Test
    void convertDecimalToBinaryNumber31() {
        int[] decimalToBinary = OddMarchBits.convertDecimalToBinary(31);
        assertAll(
                () -> assertEquals(1, decimalToBinary[7]),
                () -> assertEquals(1, decimalToBinary[6]),
                () -> assertEquals(1, decimalToBinary[5]),
                () -> assertEquals(1, decimalToBinary[4]),
                () -> assertEquals(1, decimalToBinary[3])
        );
    }

    @Test
    void convertDecimalToBinaryNumber63() {
        int[] decimalToBinary = OddMarchBits.convertDecimalToBinary(63);
        assertAll(
                () -> assertEquals(1, decimalToBinary[7]),
                () -> assertEquals(1, decimalToBinary[6]),
                () -> assertEquals(1, decimalToBinary[5]),
                () -> assertEquals(1, decimalToBinary[4]),
                () -> assertEquals(1, decimalToBinary[3]),
                () -> assertEquals(1, decimalToBinary[2])
        );
    }

    @Test
    void convertDecimalToBinaryNumber127() {
        int[] decimalToBinary = OddMarchBits.convertDecimalToBinary(127);
        assertAll(
                () -> assertEquals(1, decimalToBinary[7]),
                () -> assertEquals(1, decimalToBinary[6]),
                () -> assertEquals(1, decimalToBinary[5]),
                () -> assertEquals(1, decimalToBinary[4]),
                () -> assertEquals(1, decimalToBinary[3]),
                () -> assertEquals(1, decimalToBinary[2]),
                () -> assertEquals(1, decimalToBinary[1])
        );
    }

    @Test
    void moveBitsNumber3() {
        int[][] bits = OddMarchBits.moveBits(3);
        for (int i = 0; i < bits.length;i++){
            Arrays.stream(bits[i]).forEach(System.out::print);
        }
    }

    @Test
    void moveBitsUsingNumberOfBits1() {
        int[][] moveBitsUsingNumberOfBits = OddMarchBits.moveBitsUsingNumberOfBits(1);
        long numberOfOnes = 0;
        for (int i = 0; i < moveBitsUsingNumberOfBits.length;i++){
            numberOfOnes += Arrays.stream(moveBitsUsingNumberOfBits[i]).count();
        }
        assertEquals(64, numberOfOnes);
    }

    @Test
    void moveBitsUsingNumberOfBits2() {
        int[][] moveBitsUsingNumberOfBits = OddMarchBits.moveBitsUsingNumberOfBits(2);
        long numberOfOnes = 0;
        for (int i = 0; i < moveBitsUsingNumberOfBits.length;i++){
            numberOfOnes += Arrays.stream(moveBitsUsingNumberOfBits[i]).count();
        }
        assertEquals(56, numberOfOnes);
    }

    @Test
    void moveBitsUsingNumberOfBits3() {
        int[][] moveBitsUsingNumberOfBits = OddMarchBits.moveBitsUsingNumberOfBits(3);
        long numberOfOnes = 0;
        for (int i = 0; i < moveBitsUsingNumberOfBits.length;i++){
            numberOfOnes += Arrays.stream(moveBitsUsingNumberOfBits[i]).count();
        }
        assertEquals(48, numberOfOnes);
    }

    @Test
    void moveBitsUsingNumberOfBits4() {
        int[][] moveBitsUsingNumberOfBits = OddMarchBits.moveBitsUsingNumberOfBits(4);
        long numberOfOnes = 0;
        for (int i = 0; i < moveBitsUsingNumberOfBits.length;i++){
            numberOfOnes += Arrays.stream(moveBitsUsingNumberOfBits[i]).count();
        }
        assertEquals(40, numberOfOnes);
    }

    @Test
    void moveBitsUsingNumberOfBits5() {
        int[][] moveBitsUsingNumberOfBits = OddMarchBits.moveBitsUsingNumberOfBits(5);
        long numberOfOnes = 0;
        for (int i = 0; i < moveBitsUsingNumberOfBits.length;i++){
            numberOfOnes += Arrays.stream(moveBitsUsingNumberOfBits[i]).count();
        }
        assertEquals(32, numberOfOnes);
    }

    @Test
    void moveBitsUsingNumberOfBits6() {
        int[][] moveBitsUsingNumberOfBits = OddMarchBits.moveBitsUsingNumberOfBits(6);
        long numberOfOnes = 0;
        for (int i = 0; i < moveBitsUsingNumberOfBits.length;i++){
            numberOfOnes += Arrays.stream(moveBitsUsingNumberOfBits[i]).count();
        }
        assertEquals(24, numberOfOnes);
    }

    @Test
    void moveBitsUsingNumberOfBits7() {
        int[][] moveBitsUsingNumberOfBits = OddMarchBits.moveBitsUsingNumberOfBits(7);
        long numberOfOnes = 0;
        for (int i = 0; i < moveBitsUsingNumberOfBits.length;i++){
            numberOfOnes += Arrays.stream(moveBitsUsingNumberOfBits[i]).count();
        }
        assertEquals(16, numberOfOnes);
    }

    @Test
    void convertBinaryToDecimal1() {
        int[] binary = new int[]{0,0,0,0,0,0,0,1};
        int decimal = OddMarchBits.convertBinaryToDecimal(binary);
        assertEquals(1,decimal);
    }

    @Test
    void convertBinaryToDecimal3() {
        int[] binary = new int[]{0,0,0,0,0,0,1,1};
        int decimal = OddMarchBits.convertBinaryToDecimal(binary);
        assertEquals(3,decimal);
    }

    @Test
    void convertBinaryToDecimal7() {
        int[] binary = new int[]{0,0,0,0,0,1,1,1};
        int decimal = OddMarchBits.convertBinaryToDecimal(binary);
        assertEquals(7,decimal);
    }

    @Test
    void convertBinaryToDecimal15() {
        int[] binary = new int[]{0,0,0,0,1,1,1,1};
        int decimal = OddMarchBits.convertBinaryToDecimal(binary);
        assertEquals(15,decimal);
    }

    @Test
    void convertBinaryToDecimal31() {
        int[] binary = new int[]{0,0,0,1,1,1,1,1};
        int decimal = OddMarchBits.convertBinaryToDecimal(binary);
        assertEquals(31,decimal);
    }

    @Test
    void convertBinaryToDecimal63() {
        int[] binary = new int[]{0,0,1,1,1,1,1,1};
        int decimal = OddMarchBits.convertBinaryToDecimal(binary);
        assertEquals(63,decimal);
    }

    @Test
    void convertBinaryToDecimal127() {
        int[] binary = new int[]{0,1,1,1,1,1,1,1};
        int decimal = OddMarchBits.convertBinaryToDecimal(binary);
        assertEquals(127,decimal);
    }

    @Test
    void createBinaryOf1() {
        int[] binary = OddMarchBits.createBinary(1);
        assertAll(
                () -> assertEquals(1, binary[7]),
                () -> assertEquals(0, binary[6]),
                () -> assertEquals(0, binary[5]),
                () -> assertEquals(0, binary[4]),
                () -> assertEquals(0, binary[3]),
                () -> assertEquals(0, binary[2]),
                () -> assertEquals(0, binary[1]),
                () -> assertEquals(0, binary[0])
        );
    }

    @Test
    void createBinaryOf3() {
        int[] binary = OddMarchBits.createBinary(2);
        assertAll(
                () -> assertEquals(1, binary[7]),
                () -> assertEquals(1, binary[6]),
                () -> assertEquals(0, binary[5]),
                () -> assertEquals(0, binary[4]),
                () -> assertEquals(0, binary[3]),
                () -> assertEquals(0, binary[2]),
                () -> assertEquals(0, binary[1]),
                () -> assertEquals(0, binary[0])
        );
    }

    @Test
    void createBinaryOf7() {
        int[] binary = OddMarchBits.createBinary(3);
        assertAll(
                () -> assertEquals(1, binary[7]),
                () -> assertEquals(1, binary[6]),
                () -> assertEquals(1, binary[5]),
                () -> assertEquals(0, binary[4]),
                () -> assertEquals(0, binary[3]),
                () -> assertEquals(0, binary[2]),
                () -> assertEquals(0, binary[1]),
                () -> assertEquals(0, binary[0])
        );
    }

    @Test
    void createBinaryOf15() {
        int[] binary = OddMarchBits.createBinary(4);
        assertAll(
                () -> assertEquals(1, binary[7]),
                () -> assertEquals(1, binary[6]),
                () -> assertEquals(1, binary[5]),
                () -> assertEquals(1, binary[4]),
                () -> assertEquals(0, binary[3]),
                () -> assertEquals(0, binary[2]),
                () -> assertEquals(0, binary[1]),
                () -> assertEquals(0, binary[0])
        );
    }

    @Test
    void createBinary31() {
        int[] binary = OddMarchBits.createBinary(5);
        assertAll(
                () -> assertEquals(1, binary[7]),
                () -> assertEquals(1, binary[6]),
                () -> assertEquals(1, binary[5]),
                () -> assertEquals(1, binary[4]),
                () -> assertEquals(1, binary[3]),
                () -> assertEquals(0, binary[2]),
                () -> assertEquals(0, binary[1]),
                () -> assertEquals(0, binary[0])
        );
    }

    @Test
    void createBinary63() {
        int[] binary = OddMarchBits.createBinary(6);
        assertAll(
                () -> assertEquals(1, binary[7]),
                () -> assertEquals(1, binary[6]),
                () -> assertEquals(1, binary[5]),
                () -> assertEquals(1, binary[4]),
                () -> assertEquals(1, binary[3]),
                () -> assertEquals(1, binary[2]),
                () -> assertEquals(0, binary[1]),
                () -> assertEquals(0, binary[0])
        );
    }

    @Test
    void createBinary127() {
        int[] binary = OddMarchBits.createBinary(7);
        assertAll(
                () -> assertEquals(1, binary[7]),
                () -> assertEquals(1, binary[6]),
                () -> assertEquals(1, binary[5]),
                () -> assertEquals(1, binary[4]),
                () -> assertEquals(1, binary[3]),
                () -> assertEquals(1, binary[2]),
                () -> assertEquals(1, binary[1]),
                () -> assertEquals(0, binary[0])
        );
    }

    @Test
    void moveBitsUsingNumberOfBitsImproved1() {
        int[][] numberOfBits = OddMarchBits.moveBitsUsingNumberOfBitsImproved(1);
        long numberOfOnes = 0;
        for (int i = 0; i < numberOfBits.length;i++){
            numberOfOnes += Arrays.stream(numberOfBits[i]).count();
        }
        assertEquals(64, numberOfOnes);
    }
}