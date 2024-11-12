package homework;

import java.util.ArrayList;

/**
 *  11. Declare following two arrylist and compare it.
 *  ArrayList<String> c1= new ArrayList<String>();
 *  c1.add("Red");
 *  c1.add("Green");
 *  c1.add("Black");
 *  c1.add("White");
 *  c1.add("Pink");
 *  ArrayList<String> c2= new ArrayList<String>();
 *  c2.add("Red");
 *  c2.add("Green");
 *  c2.add("Black");
 *  c2.add("Pink")
 */

public class CompareTwoArrayList {

    public static void main(String[] args) {
        // Declare and initialize the first ArrayList
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Declare and initialize the second ArrayList
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Compare the two ArrayLists
        if (c1.equals(c2)) {
            System.out.println("Both ArrayLists are equal.");
        } else {
            System.out.println("Both ArrayLists are not equal.");
        }
    }
}
