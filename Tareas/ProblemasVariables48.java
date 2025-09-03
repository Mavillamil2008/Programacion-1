import java.util.Scanner;

public class ProblemasVariables48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primero Número");
        int num1 = sc.nextInt();
        System.out.println("Ingresa el segundo Número");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " es divisible por " + num2);
            double dividir = num1 / num2;
            System.out.println("EL total es de: " + dividir);
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " es divisible por " + num1);
            double dividir = num2 / num1;
            System.out.println("EL total es de: " + dividir);
        } else {
            System.out.println("Ninguno de los números es divisible por el otro.");
        }
    }   
}
