package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap canh hinh vuong:");
        double side= Double.parseDouble(scanner.nextLine());
        System.out.println("nhap chieu dai: ");
        double  length = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap chieu rong: ");
        double  width = Double.parseDouble(scanner.nextLine());
        Square square = new Square(side);
        Rectangle rectangle= new Rectangle(width, length);
        System.out.println("DT hinh v: "+square.clacDt(side, side));
        System.out.println("DT hinh cn: "+ rectangle.clacDt(width, length));
        System.out.println("CV hinh v: "+square.calcCv(side, side));
        System.out.println("CV hinh cn: "+rectangle.calcCv(width, length));


    }
}
