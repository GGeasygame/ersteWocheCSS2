package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Wähl deinen Rechenmodus (+, -, *, /, Flächenrechner, Volumenrechner, Umfangrechner)");
        Scanner scanner = new Scanner(System.in);
        String mode = scanner.next();

        if (mode.equals("+")) {
            System.out.println("Erste Zahl eingeben...");
            int number1 = scanner.nextInt();
            System.out.println("Zweite Zahl eingeben...");
            int number2 = scanner.nextInt();
            plus(number1, number2);

        }   else if (mode.equals("-")) {
            System.out.println("Erste Zahl eingeben...");
            int number1 = scanner.nextInt();
            System.out.println("Zweite Zahl eingeben...");
            int number2 = scanner.nextInt();
            minus(number1, number2);

        } else if (mode.equals("*")) {
            System.out.println("Erste Zahl eingeben...");
            int number1 = scanner.nextInt();
            System.out.println("Zweite Zahl eingeben...");
            int number2 = scanner.nextInt();
            times(number1, number2);

        } else if (mode.equals("/")) {
            System.out.println("Erste Zahl eingeben...");
            Double number1 = scanner.nextDouble();
            System.out.println("Zweite Zahl eingeben...");
            Double number2 = scanner.nextDouble();
            devision(number1, number2);

        } else if (mode.equals("Flächenrechner")) {
            areaCalculator();
        } else if (mode.equals("Volumenrechner")) {
            volumeCalculator();
        } else if (mode.equals("Umfangrechner")) {
            circumferenceCalculator();
        }
    }

    public static void plus(int number1, int number2) {
        int result = number1 + number2;
        System.out.println("Das Resultat ist: " + result);
    }
    public static void minus(int number1, int number2) {
        int result = number1 - number2;
        System.out.println("Das Resultat ist: " + result);
    }
    public static void times(int number1, int number2) {
        int result = number1 * number2;
        System.out.println("Das Resultat ist: " + result);
    }
    public static void devision(Double number1, Double number2) {
        Double result = number1 / number2;
        System.out.println("Das Resultat ist: " + result);
    }


    public static  void areaCalculator() {
        System.out.println("Wählen Sie die Art von Fläche die Sie berechnen möchten... (Kreis, Rechteck, Dreieck, Würfel, Zylinder)");
        Scanner scanner = new Scanner(System.in);
        String area = scanner.next();

        if (area.equals("Kreis")) {
            System.out.print("Geben Sie den Radius des Kreises ein [cm]...");
            Double radius = scanner.nextDouble();
            circle(radius);

        } else if (area.equals("Rechteck")) {
            System.out.println("Geben Sie die Länge der ersten Seite ein [cm]...");
            int sideLength1 = scanner.nextInt();
            System.out.println("Geben Sie die Länge der zweiten Seite ein [cm]...");
            int sideLength2 = scanner.nextInt();
            rectangle(sideLength1, sideLength2);

        } else if (area.equals("Dreieck")) {
            System.out.println("Geben Sie die erste kurze Seite an [cm]... (Annahme, dass Dreieck ist rechtwinklig)");
            int sideLength1 = scanner.nextInt();
            System.out.println("Geben sie die zweite kurze Seite an [cm]...");
            int sideLength2 = scanner.nextInt();
            triangle(sideLength1, sideLength2);

        } else if (area.equals("Würfel")) {
            System.out.println("Geben Sie die Seitenlänge an [cm]...");
            int sideLength1 = scanner.nextInt();
            cube(sideLength1);

        } else if (area.equals("Zylinder")) {
            System.out.println("Geben Sie den Radius ein [cm]...");
            Double radius = scanner.nextDouble();
            System.out.println("Geben Sie die Höhe ein [cm]...");
            Double height = scanner.nextDouble();
            cylinder(radius, height);
        }
    }
    public static void circle(Double radius) {
        Double result = radius * radius * 3.14159;
        System.out.print("Das Resultat ist: " + result + "cm\u00B2");
    }
    public static void rectangle(int sideLength1, int sideLength2) {
        int result = sideLength1 * sideLength2;
        System.out.println("Das Resultat ist: " + result + "cm\u00B2");
    }
    public static void triangle(int sideLength1, int sideLength2) {
        int result = (sideLength1 * sideLength2) / 2;
        System.out.println("Das Resultat ist: " + result + "cm\u00B2");
    }
    public static void cube(int sideLength1) {
        int result = sideLength1 * 6;
        System.out.println("Das Resultat ist: " + result + "cm\u00B2");
    }
    public static void cylinder(Double radius, Double height) {
        Double result = 2 * 3.14159 * radius * height;
        System.out.println("Das Resultat ist: " + result + "cm\u00B2");
    }


    public static void volumeCalculator() {
        System.out.println("Wählen Sie die Art von Volumen die Sie berechnen möchten... (Würfel, Zylinder)");
        Scanner scanner = new Scanner(System.in);
        String modeVolume = scanner.next();

        if (modeVolume.equals("Würfel")) {
            System.out.println("Geben Sie die Seitenlänge des Würfels an [cm]...");
            int sideLength = scanner.nextInt();
            cubeVolume(sideLength);

        } else if (modeVolume.equals("Zylinder")) {
            System.out.println("Geben Sie den Radius an [cm]...");
            Double radius = scanner.nextDouble();
            System.out.println("Geben Sie die Höhe an [cm]...");
            Double height = scanner.nextDouble();
            cylinderVolume(radius, height);
        }
    }
    public static void cubeVolume(int sideLength) {
        int result = sideLength * sideLength * sideLength;
        System.out.println("Das Resultat ist: " + result + "cm\u00B3" );
    }
    public static void cylinderVolume(Double radius, Double height) {
        Double result = 3.14159 * radius * radius * height;
        System.out.println("Das Resultat ist: " + result + "cm\u00B3");
    }


    public static void circumferenceCalculator() {
        System.out.println("Wählen Sie die Art von Umfang die Sie berechnen möchten... (Kreis, Rechteck, Dreieck)");
        Scanner scanner = new Scanner(System.in);
        String modeCircumference = scanner.next();

        if (modeCircumference.equals("Kreis")) {
            System.out.println("Geben Sie den Radius ein [cm]...");
            Double radius = scanner.nextDouble();
            circleCircumference(radius);

        } else if (modeCircumference.equals("Rechteck")) {
            System.out.println("Geben Sie die erste Seitenlänge ein [cm]...");
            int sideLength1 = scanner.nextInt();
            System.out.println("Geben Sie die zweite Seitenlänge ein [cm]...");
            int sideLength2 = scanner.nextInt();
            rectangleCircumference(sideLength2, sideLength1);

        } else if (modeCircumference.equals("Dreieck")) {
            System.out.println("Geben Sie die erste Seitenlänge ein [cm]...");
            int sideLength1 = scanner.nextInt();
            System.out.println("Geben Sie die zweite Seitenlänge ein [cm]...");
            int sideLength2 = scanner.nextInt();
            System.out.println("Geben Sie die dritte Seitenlänge ein [cm]...");
            int sideLength3 = scanner.nextInt();
            triangleCircumference(sideLength1, sideLength2, sideLength3);
        }
    }
    public static void circleCircumference(Double radius) {
        Double result = 2 * 3.14159 * radius;
        System.out.println("Das Resultat ist: " + result + "cm");
    }
    public static void rectangleCircumference(int sideLength1, int sideLength2) {
        int result = sideLength1 * 2 + sideLength2 * 2;
        System.out.println("Das Resultat ist: " + result + "cm");
    }
    public static void triangleCircumference(int sideLength1, int sideLength2, int sideLength3) {
        int result = sideLength1 + sideLength2 + sideLength3;
        System.out.println("Das Resultat ist: " + result + "cm");
    }
}
