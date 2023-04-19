package dz72;

import java.util.Random;

public class MassPosition {

    public static int[] addElement(int[] srcArray, int newElement) {
        int[] finalArray = new int[srcArray.length + 1];
        for (int i = 0; i < srcArray.length; i++) {
            finalArray[i + 1] = srcArray[i];
        }
        finalArray[0] = newElement;
        return finalArray;
    }

    public static int[] addElement(int[] srcArray, int newElement, int index) {
        int[] finalArray = new int[srcArray.length+1];
        int j = 0;
        for (int i = 0; i <= finalArray.length-1; i++) {
            if (i == index) {
                finalArray[i] = newElement;
            } else {
                finalArray[i] = srcArray[j];
                j++;
            }
        }
        return finalArray;
    }
}

