package test;

import java.util.Scanner;

class CheckDate {
    CheckDate() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Year: ");
        int year = sc.nextInt();
        System.out.println("Input Month: ");
        int month = sc.nextInt();
        System.out.println("Input Day: ");
        int date = sc.nextInt();
        System.out.println("Your input date: " + year + "-" + month + "-" + date);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (date >= 1 && date <= 31) {
                    System.out.println("Valid Date");
                } else {
                    System.out.println("Invalid Date");
                }
                break;
            case 2:
                if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                    if (date >= 1 && date <= 29) {
                        System.out.println("Valid Date");
                    } else {
                        System.out.println("Invalid Date");
                    }
                } else if (date >= 1 && date <= 28) {
                    System.out.println("Valid Date");
                } else {
                    System.out.println("Invalid Date");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (date >= 1 && date <= 30) {
                    System.out.println("Valid Date");
                } else {
                    System.out.println("Invalid Date");
                }
                break;
            default:
                System.out.println("Invalid Date");
        }

    }
}