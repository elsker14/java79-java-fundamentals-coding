package task16;

import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
        // 1 3 8 4 2 5 6 11 13 7
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line + "\n");

        String[] arr = line.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // e nevoie de conversie de la array de tipul String, la array de tipul int
    }
}
