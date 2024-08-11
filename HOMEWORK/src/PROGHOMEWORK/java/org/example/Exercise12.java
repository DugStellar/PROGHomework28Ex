package org.example;

public class Exercise12 {
    public static int getRandom(int... numbers) {
        int num;	// Random number
        boolean isExcluded; // Is the number excluded
        do {
            isExcluded = false;
            num = 1 + (int)(Math.random() * 5);
            for (int e: numbers) {
                if (num == e)
                    isExcluded = true;
            }
        } while (isExcluded); // Test if number is Excluded
        return num;
    }
}
