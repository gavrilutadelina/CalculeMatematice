package com.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dati numerele x si y");
        System.out.print("x = ");
        double x = in.nextDouble();
        System.out.print("y = ");
        double y = in.nextDouble();

        OperatiiMatematice operatii = new OperatiiMatematice();
        System.out.println("Rezultatul sumei este: " + operatii.adunare(x, y));
        System.out.println("Rezultatul scaderii este: " + operatii.scadere(x, y));
        System.out.println("Rezultatul inmultirii este: " + operatii.inmultire(x, y));
        System.out.println("Rezultatul impartirii este: " + operatii.impartire(x, y));
    }
}
