import java.util.*;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a) Ángulo recto
        System.out.println("Digite el angulo: ");
        int n = sc.nextInt();
        if (n == 90) {
            System.out.println("El ángulo es un ángulo recto");
        } else {
            System.out.println("El ángulo no es un ángulo recto");
        }


        // b) Temperatura y punto de ebullición
        double temperatura = 105;
        if (temperatura > 100) {
            System.out.println("por encima del punto de ebullición del agua");
        } else {
            System.out.println("por debajo del punto de ebullición del agua");
        }

        // c) Sumar positivos y negativos
        int numero = -5;
        int totalPositivos = 0;
        int totalNegativos = 0;
        if (numero > 0) {
            totalPositivos += numero;
        } else {
            totalNegativos += numero;
        }
        System.out.println("Total positivos: " + totalPositivos);
        System.out.println("Total negativos: " + totalNegativos);

        // d) Leer p si x > y y z < 20
        int x, y, z, p;
        System.out.println("Digite un valor para x: ");
        x = sc.nextInt();
        System.out.println("Digite un valor para y: ");
        y = sc.nextInt();
        System.out.println("Digite un valor para z: ");
        z = sc.nextInt();

        if (x > y && z < 20) {
            System.out.println("Digite un valor para p: ");
            p = sc.nextInt();
            System.out.println("Valor para p es de: " + p);
        }

        // e) Leer tiempo si distancia > 20 y < 35
        System.out.println("Digite la distancia: ");
        int distancia = sc.nextInt();12
        if (distancia > 20 && distancia < 35) {
            System.out.print("Ingrese valor para tiempo: ");
            int tiempo = sc.nextInt();
            System.out.println("tiempo = " + tiempo);
        }
    }
}        

