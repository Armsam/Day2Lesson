package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter count");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int hour = count / 60;
        int minutes = count % 60;
        System.out.println("hour = " + hour);
        System.out.println("minutes = " + minutes);

    }

    public static void SumofNumbers(String[] args) {


        int oddNumber = 0;
        int sumOddNumber = oddNumber + 2 + oddNumber + 4 + oddNumber + 6;
        int eveNnumber = 1;
        int sumevennumber = eveNnumber + (eveNnumber += 2) + (eveNnumber += 2) + (eveNnumber += 2);
        System.out.println("sumOfOddNumber = " + sumevennumber);
        System.out.println("sumOfEvenNumber = " + sumOddNumber);
    }

    public static void ProductOfNumber(String[] args) {
        // Product of number
        System.out.println("Please enter numbers");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        int c = a * b;
        System.out.println(c);

    }

    public static void ModuleOperator(String[] args) {

        Scanner scanner3 = new Scanner(System.in);
        int number = scanner3.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        int number1 = scanner4.nextInt();
        int module = number % number1;
        System.out.println();
    }

    public static void Arguments(String[] args) {

        System.out.printf("Please enter numbers");
        Scanner scanner6 = new Scanner(System.in);
        Scanner scanner7 = new Scanner(System.in);
        Scanner scanner8 = new Scanner(System.in);
        int x = scanner6.nextInt();
        int y = scanner7.nextInt();
        int z = scanner8.nextInt();
        int sum = x + y + z;
        int diference = x - y - z;
        int average = sum / 3;
        System.out.println(" sum = " + sum + " diference = " + diference + " average = " + average);
    }

    public static void Square(String[] args) {

        Scanner scanner6 = new Scanner(System.in);
        Scanner scanner7 = new Scanner(System.in);
        Scanner scanner8 = new Scanner(System.in);
        int a = scanner6.nextInt();
        int b = scanner7.nextInt();
        int SquareOfRightAnlgedTriangle = a * b / 2;
        int SquareOfSquare = a * a;
        int SquareOfRectangle = a * b;
        System.out.println("Square Of Right-Angled Triangle" + SquareOfRectangle);
        System.out.println("Square Of Square" + SquareOfSquare);
        System.out.println("Square Of Rectangle " + SquareOfRectangle);
    }

    public static void AverageOfTypes(String[] args) {

        Scanner scanner6 = new Scanner(System.in);
        Scanner scanner7 = new Scanner(System.in);
        Scanner scanner8 = new Scanner(System.in);
        int a = scanner6.nextInt();
        byte b = scanner7.nextByte();
        short c = scanner8.nextShort();

        double sum = a + b + c;
        double average = sum / 3;
        System.out.println(sum);
        System.out.println(average);
    }

    public static void Arithmeteic(String[] args) {
        Scanner scanner8 = new Scanner(System.in);
        int a = scanner8.nextInt();
        //Sn=3n*n-12  >>>>>> n==a;
        int sum = 3 * (a * a) - 12 * a;

    }

    public static void DigitNumber(String[] args) {
        Scanner scanner8 = new Scanner(System.in);
        int a = scanner8.nextInt();
        int digit = a % 10;
        System.out.println(digit);
    }

    public static void DetermineAndReminde(String[] args) {
        Scanner scanner8 = new Scanner(System.in);
        Scanner scanner9 = new Scanner(System.in);
        int a = scanner8.nextInt();
        int b = scanner9.nextInt();
        int reminder = a - b;
        int deleting = a % b;
        System.out.println("Reminder =  " + reminder + "deleting = " + deleting);

    }

    public static void RandomInteger(String[] args) {
        Random rnd = new Random();
        int a = rnd.nextInt();
        System.out.println(a);


    }

    public static void RandomIntegerBound(String[] args) {
        Random rnd = new Random();
        int a = rnd.nextInt(15);
        System.out.println(a);
    }

    public static void RandomIntegerBound30(String[] args) {
        Random rnd = new Random();
        int a = rnd.nextInt(15) + 15;
        System.out.println(a);
    }

    public static void BooleanType(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean determine = a % 2 == 1;
        System.out.println(determine);

    }

    public static void SelectMiddleNumber(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select 3 digit number");
        int a = scanner.nextInt();
        int middlie = (a % 100) / 10;
        System.out.println(middlie);

    }

    public static void SelectFirtsNumber(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select 3 digit number");
        int a = scanner.nextInt();
        int firts = a / 100;
        System.out.println(firts);

    }

    public static void SumOfNumber(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select 3 digit number");
        int a = scanner.nextInt();
        int firts = a / 100;

        int middlie = (a % 100) / 10;
        int last = a % 10;
        int sum = firts + middlie + last;
        System.out.println(sum);


    }

    public static void Swap(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner1.nextInt();
        int c;
        c = a;
        a = b;
        b = c;

    }
}
