package com.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        double x = 20;
        double y = 10;

        OperatiiMatematice operatii = new OperatiiMatematice();
        System.out.println("Rezultatul sumei este: ");
        System.out.println(operatii.adunare(x, y));
        System.out.println("Rezultatul scaderii este: ");
        System.out.println(operatii.scadere(x, y));
        System.out.println("Rezultatul inmultirii este: ");
        System.out.println(operatii.inmultire(x, y));
        System.out.println("Rezultatul impartirii este: ");
        System.out.println(operatii.impartire(x, y));
    }
}
