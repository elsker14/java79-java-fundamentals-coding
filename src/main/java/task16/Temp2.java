package task16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temp2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arr.add(scanner.nextInt());
        }

        System.out.println(arr);

        arr.add(10);
        System.out.println(arr);

        // Array - e la nivel de obiect => Array obj = new Array(); => obj.method()
        // Arrays - e la nivel independent de obiect, contine doar metode statice
        // Arrays.asList(), Arrays.compare();....
    }
}
