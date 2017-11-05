package com.kitcenter.app.homework.lesson10_11FileException;


import java.io.*;
import java.util.Arrays;

public class SortArrayFromToFile {
    private String readFrom;
    private String writeTo;
    public String line;

    public SortArrayFromToFile(String readFrom, String writeTo) {
        this.readFrom = readFrom;
        this.writeTo = writeTo;
    }

    private static int[] arraySortIncrease(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("i: " + i + " Array: " + Arrays.toString(arr));
        }
        return arr;
    }

    private static int[] stringToIntArray(String str) {
        char[] charArray = str.toCharArray();
        int counter = 0;
        for (int m = 0; m < charArray.length; m++) {
            if (charArray[m] == ',') {
                counter++;
            }
        }
        int[] intArray = new int[counter + 1];
        int j = 0;
        boolean isNegative = false;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9': {
                    //  System.out.println("stringToIntArray: (int) charArray[i]: " + (int) charArray[i]);
                    System.out.println("stringToIntArray: (int) charArray[i]: " + charArray[i]);
                    intArray[j] = intArray[j] * 10 + (int) charArray[i] - 48;
                    break;
                }
                case '-': {
                    isNegative = true;
                    break;
                }
                case ',': {
                    if (isNegative == true) {
                        intArray[j] = intArray[j] * (-1);
                        isNegative = false;
                    }
                    System.out.println("stringToIntArray: " + intArray[j]);
                    j++;
                    break;
                }
                default: {
                    System.out.println("stringToIntArray: Illegal character skipped");
                    break;
                }
            }
        }

        if (isNegative == true) {
            intArray[j] = intArray[j] * (-1);
        }
        return intArray;
    }

    public void processFile() {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(readFrom));
            BufferedWriter writer = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(writeTo, false)));

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                int[] tempArr = arraySortIncrease(stringToIntArray(line));
                line = Arrays.toString(tempArr);
                writer.append(line);
                writer.newLine();
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

