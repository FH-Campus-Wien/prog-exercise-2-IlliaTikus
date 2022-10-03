package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        double num, numMax;

        System.out.print("Number " + i + ": ");
        num = scanner.nextDouble();
        numMax = num;

        if (num <= 0)
            System.out.println("No number entered.");
        else {
            while(i > 0) {
                i++;
                System.out.print("Number " + i + ": ");
                num = scanner.nextDouble();

                if (num > numMax)
                    numMax = num;

                if(num <= 0)
                    break;
            }
            System.out.printf("The largest number is %.2f\n", numMax);
        }
    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        int a = 1;

        System.out.print("n: ");
        int num = scanner.nextInt();

        if (num <= 0)
            System.out.println("Invalid number!");
        else for(int i = 0; i < num; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}