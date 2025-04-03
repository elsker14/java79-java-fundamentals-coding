package task16;

/*
    Write an application that takes 10 numbers from the user (type int) and write the length
    of the longest such subsequence of these numbers, which is increasing.
    For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7" the program should write "5"
    as the length of the longest increasing subsequence (underlined in the example).

    Input:
        - hardcodam dimensiunea array-ului => dim = 10
        - 1 3 8 4 2 5 6 11 13 7
        - 0 1 2 3 4 5 6  7  8 9

        -- 2 contoare:
            - un contor care se incrementeaza cand se face verificarea instructiunii conditionale (=true)

    Algoritm:
        - vom parcurge lista element cu element, astfel incat sa verificam elementele vecine
        - for(i = [1, dim))
            if(arr[i] > arr[i-1])
            - true:
                -- incrementam contorul curent
                -- verificam daca contorul curent a devenit mai mare decat contorul
                maxim al intregii iteratii
            - false:
                -- resetam contorul curent la valoarea 1
                -- deci cu contorul maxim, nu se intampla absolut nimic
    Output:
        contorul maxim = 5
 */

import java.util.Scanner;

public class LongestSubSeqDebugging {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dim = 10;   // sau inlocuiti acest rand cu citirea unui numar reprezentan dimensiunea array-ului
        int[] arr = new int[dim];   // int[] arr = {a, b, c, d...} - indexul, este valoarea pozitiei in colectie

        /*
        1
        a = 1
        2
        b = 2
        3
        c = 3
        4
        d = 4
         */
//        int a = scanner.nextInt();  // i = 0
//        int b = scanner.nextInt();  // i = 1
//        int c = scanner.nextInt();  // i = 2
//        int d = scanner.nextInt();
//        int e = scanner.nextInt();
//        int f = scanner.nextInt();
//        int g = scanner.nextInt();
//        int h = scanner.nextInt();  // i = 7
//        int x = scanner.nextInt();  // i = 8
//        int z = scanner.nextInt();  // i = 9    => dim

        System.out.print("Introduceti 10 numere intregi: ");
        for (int i = 0; i < dim; i++) { // i < dim <=> i < 10 <=> i <= 9
            arr[i] = scanner.nextInt();
        }

        int contorulCurent = 1; // scopul contorului curent este de a incrementa valoarea sa in
        // momentul in care identificam o pereche de numere in ordine crescatoare si de a se reseta in momentul in care
        // ordinea numerelor este descrescatoare
        int contorulMaxim = 1;  // scopul contorului maxim este de a salva pe tot parcursul iteratiei valoarea cea mai mare
        // a contorului curent

        for (int i = 1; i <= dim - 1; i++) {    // acelasi lucru cu i < dim
            if (arr[i] > arr[i - 1]) {
                contorulCurent++;
                // contorulMaxim = Math.max(contorulMaxim, contorulCurent);
                if (contorulMaxim < contorulCurent) {
                    contorulMaxim = contorulCurent;
                }
            } else {
                contorulCurent = 1; // se intampla cand arr[i] < arr[i-1]
            }
        }

        System.out.println("Lungimea maxima a unei sub secvente crescatoare este: " + contorulMaxim);
    }
}
