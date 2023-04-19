package dz72;

import java.util.Arrays;

public class mainArr {
    public static void main(String[] args) {
       int [] srcArray=new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(MassPosition.addElement(srcArray, 6)));
        System.out.println(Arrays.toString(MassPosition.addElement(srcArray, 6, 2)));
    }
}
