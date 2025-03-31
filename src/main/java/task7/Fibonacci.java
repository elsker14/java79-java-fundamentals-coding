package task7;

/*
    Write an application that will take a positive number from the user (type int) and
    calculate the Fibonacci number at the indicated index. For example, if the number equals
    5, your program should print the fifth Fibonacci number. In Fibonacci sequence, each
    number is the sum of the two preceding ones. For example, the first few Fibonacci
    numbers are:
    1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377…

    Obs: mare atentie cum indexati seria!!!
    - al 5lea numar fibonacci este 5, daca indexarea seriei porneste de la 1
    - al 5lea numar fibonacci este 8, daca indexarea seriei porneste de la 0
 */

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un numar pozitiv: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Numarul este negativ!");
            return;
        } else {
            System.out.println("Al " + n + "-lea numar fibonacci este " + fibonacci(n));
        }
    }

    // todo: recreati metoda fibonacci in mod recursiv
    /*
        recursivitatea e o tehnica prin care metoda se reapeleaza pe ea insasi pt a inlocui procesul
        repetitiv
     */
    private static int fibonacci(int n) {
        /*
            a = primul predecesor
            b = al doilea predecesor
         */
        // a - indexul 0, b - indexul 1
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b; // se calculeaza elementul de pe pozitia i

            // se actualizeaza predecesorii
            // a, b, next, ...
            // a, a, b, next...
            // a, a, a, b, next...
            // ...
            a = b;
            b = next; // de ce? 1. pt a avansa in serie, 2. next e o variabila locala in for
        }

        return b; // b, ajunge sa fie elementul final actualizat
    }
}

// 5! = 1*2*3*4*5 = 300
// for i = 1, 5 -> result *= i; (rezolvare iterativa)
/*
    (rezolvare recursiva)
    int fact(int n)
    {
        if (n < = 1) // base case
            return 1;
        else
            return n*fact(n-1);
    }

    5 * fact(4)
        = 5 * 4 * fact(3)
        = 5 * 4 * 3 * fact(2)
        = 5 * 4 * 3 * 2 * fact(1)
        = 5 * 4 * 3 * 2 * 1
 */
