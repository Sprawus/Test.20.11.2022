package pl.it.camp7.kucharz;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       int quanitityOfApple;
       int quantittyofOrgane;
       int quanitityOfCoins;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter quantity of Apples");
        quanitityOfApple = input.nextInt();

        System.out.println("Enter quantity of Oranges");

        quantittyofOrgane = input.nextInt();

        System.out.println("Enter quantity of Coins");

        quanitityOfCoins = input.nextInt();

                for ( int i = 0; i < quanitityOfCoins; i++ ) {
                     if (quanitityOfApple <= quantittyofOrgane) {
                        quanitityOfApple++;
                    } else quantittyofOrgane++;
                }

        int difference = quanitityOfApple - quantittyofOrgane;
        System.out.println(quanitityOfApple);
        System.out.println(quantittyofOrgane);
        System.out.println("Minimal difference " + Math.abs(difference));

    }
}
