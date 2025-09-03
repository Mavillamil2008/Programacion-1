import java.util.Scanner;

public class ProblemasVariables44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        if (num >= 0) {
            double raiz = Math.sqrt(num);
            System.out.println("La raiz de " + num + "es: " + raiz );
        } else {
            System.out.println("No se puede sacar la raiz de un número negativo.");
        }
    }
}
