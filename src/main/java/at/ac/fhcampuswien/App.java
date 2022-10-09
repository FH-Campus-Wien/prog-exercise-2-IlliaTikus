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
        for(int i = 0; i < 6; i++) {
            for (int k = 4; k >= i; k--)
                System.out.print(" ");
            for (int j = 0; j < i*2 + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);

        if (h % 2 == 0)
            System.out.println("Invalid number!");
        else {
            for (int i = 0; i < h/2 + 1; i++) {
                for (int k = h/2-1; k >= i; k--)
                    System.out.print(" ");
                for (int j = i; j > 0; j--)
                    System.out.print((char) (c - j));
                System.out.print(c);
                for (int l = 0; l < i; l++)
                    System.out.print((char) (c - 1 - l));
                System.out.println();
            }

            for (int i = h/2 ; i > 0; i--) {
                for (int k = h/2; k >= i; k--)
                    System.out.print(" ");
                for (int j = i-1; j > 0; j--)
                    System.out.print((char) (c - j));
                System.out.print(c);
                for (int l = 0; l < i-1; l++)
                    System.out.print((char) (c - 1 - l));
                System.out.println();
            }
        }
    }

    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);

        int mark, i;
        int sum = 0, count = 0;

        for(i = 1; i > 0; i++){
            System.out.print("Mark " + i + ": ");
            mark = scanner.nextInt();

            if (mark < 0 || mark > 5) {
                System.out.println("Invalid mark!");
                i -= 1;
                continue;
            }

            sum += mark;
            if(mark == 5)
                count += 1;
            if (mark == 0)
                break;
        }

        double average = (double) sum / (i-1);

        System.out.printf("Average: %.2f\n", average);
        System.out.println("Negative marks: " + count);
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();
        int a , b, newn;

        for(int i = 0; i >= 0; i++) {
            newn = 0;
            a = n % 10;
            b = n / 10;

            for(int j = 0; j >= 0; j++) {
                newn += Math.pow(a, 2);

                if(b == 0)
                    break;

                a = b % 10;
                b = b / 10;
            }

            if(newn == 1) {
                System.out.println("Happy number!");
                break;
            }

            if(newn == 4) {
                System.out.println("Sad number!");
                break;
            }

            n = newn;
        }
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