import java.util.Scanner;

public class ProblemasVariables45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número: ");
        int numero = sc.nextInt(); 

        // Método 1: Usando el operador módulo
        if (numero % 2 == 0) {
            System.out.println(numero + " es par (usando %).");
        } else {
            System.out.println(numero + " es impar (usando %).");
        }

        // Método 2: Usando el último dígito
        int ultimoDigito = Math.abs(numero) % 10;
        if (ultimoDigito == 0 || ultimoDigito == 2 || ultimoDigito == 4 || ultimoDigito == 6 || ultimoDigito == 8) {
            System.out.println(numero + " es par (usando último dígito).");
        } else {
            System.out.println(numero + " es impar (usando último dígito).");
        }

        // Método 3: Usando el operador bit a bit AND
        if ((numero & 1) == 0) {
            System.out.println(numero + " es par (usando bitwise AND).");
        } else {
            System.out.println(numero + " es impar (usando bitwise AND).");
        }
    }
}    