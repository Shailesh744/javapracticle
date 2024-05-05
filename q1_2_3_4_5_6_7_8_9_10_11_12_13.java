class Main {
    public static void main(String[] args) {
        // Question 1: Displaying hollow world
        System.out.println("Hollow World");

        // Question 2: Variable declarations
        int a = 10;
        double b = 20.5;
        char c = 'A';
        boolean d = true;
        String e = "Hello";

        // Question 3: String declaration and methods
        String str = "Java";
        System.out.println("Length of string: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Concatenation: " + str.concat(" is fun"));

        // Question 4: StringBuffer declaration and methods
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Append: " + sb.append(" World"));
        System.out.println("Insert: " + sb.insert(5, " Java"));

        // Question 5: One-dimensional array
        int[] arr1D = {1, 2, 3, 4, 5};
        System.out.println("Accessing element at index 2: " + arr1D[2]);

        // Question 6: Two-dimensional array
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Accessing element at row 1, column 2: " + arr2D[1][2]);

        // Question 7: if statement
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        // Question 8: if-else statement
        if (x % 2 == 0) {
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

        // Question 9: else-if ladder statement
        int y = 20;
        if (y < 10) {
            System.out.println("y is less than 10");
        } else if (y < 20) {
            System.out.println("y is less than 20");
        } else {
            System.out.println("y is 20 or greater");
        }

        // Question 10: switch-case statement
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Question 11: for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("i is: " + i);
        }

        // Question 12: while loop
        int j = 0;
        while (j < 5) {
            System.out.println("j is: " + j);
            j++;
        }

        // Question 13: do-while loop
        int k = 0;
        do {
            System.out.println("k is: " + k);
            k++;
        } while (k < 5);
    }
}