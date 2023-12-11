package MethodsExercise;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        printMatrix(n);
    }

    public static void printMatrix(int n){


        for (int rows = 1; rows <= n; rows++) {
            int count = 0;
            for (int cols = 1; cols <= n; cols++) {

                count++;
                System.out.print(n + " ");
                if (count == n){
                    System.out.println();
                }
            }

        }
    }
}
