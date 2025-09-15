import java.util.Scanner;
public class CondicionalCasos {
    public static void main(String[] args){
        // Declarar una constante
        String MSG_OK_dia = "Valido: Opción válida como dia";
        String MSG_ERROR_dia = "Error: Opción no válida como dia";

        Scanner sc = new Scanner(System.in);

        // Ejercicio 4.13
        System.out.println("Introduzca un mes del 1 al 12 ");
        int mes = sc.nextInt();  
        // Usar la estructura switch para cada caso / Según sea en pseudocódigo  
        switch (mes) {
            case 1:
                System.out.println("Mes de Enero");
                System.out.println("Introduzca el dia del mes ");
                int dia = sc.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println(MSG_OK_dia);
                } else {
                    System.out.println(MSG_ERROR_dia);
                }
                break;
            case 2:
                System.out.println("Mes de Febrero");
                System.out.println("Introduzca el dia del mes ");
                dia = sc.nextInt();
                if (dia >= 1 && dia <= 28 || dia == 29) {
                    System.out.println(MSG_OK_dia);
                } else {
                    System.out.println(MSG_ERROR_dia);
                }
                break;
            case 3:
                System.out.println("Mes de Marzo");
                System.out.println("Introduzca el dia del mes ");
                dia = sc.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println(MSG_OK_dia);
                } else {
                    System.out.println(MSG_ERROR_dia);
                }
                break;
            case 4:
                System.out.println("Mes de Abril");
                System.out.println("Introduzca el dia del mes ");
                dia = sc.nextInt();
                if (dia >= 1 && dia <= 30) {
                    System.out.println(MSG_OK_dia);
                } else {
                    System.out.println(MSG_ERROR_dia);
                }
                break;
            case 5:
                System.out.println("Mes de Mayo");
                System.out.println("Introduzca el dia del mes ");
                dia = sc.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println(MSG_OK_dia);
                } else {
                    System.out.println(MSG_ERROR_dia);
                }
                break;
            case 6:
                System.out.println("Mes de Junio");
                System.out.println("Introduzca el dia del mes ");
                dia = sc.nextInt();
                if (dia >= 1 && dia <= 30) {
                    System.out.println(MSG_OK_dia);
                } else {
                    System.out.println(MSG_ERROR_dia);
                }
                break;
            case 7:
                System.out.println("Mes de Julio");
                System.out.println("Introduzca el dia del mes ");
                dia = sc.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println(MSG_OK_dia);
                } else {
                    System.out.println(MSG_ERROR_dia);
                }
                break;
            case 8:
                System.out.println("Mes de Agosto");
                System.out.println("Introduzca el dia del mes ");
                dia = sc.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println(MSG_OK_dia);
                } else {
                    System.out.println(MSG_ERROR_dia);
                }
                break;
            case 9:
                System.out.println("Mes de Septiembre");
                System.out.println("Introduzca el dia del mes ");
                dia = sc.nextInt();
                if (dia >= 1 && dia <= 30) {
                    System.out.println(MSG_OK_dia);
                } else {
                    System.out.println(MSG_ERROR_dia);
                }
                break;
            case 10:
                System.out.println("Mes de Octubre");
                System.out.println("Introduzca el dia del mes ");
                dia = sc.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println(MSG_OK_dia);
                } else {
                    System.out.println(MSG_ERROR_dia);
                }
                break;
            case 11:
                System.out.println("Mes de Noviembre");
                System.out.println("Introduzca el dia del mes ");
                dia = sc.nextInt();
                if (dia >= 1 && dia <= 30) {
                    System.out.println(MSG_OK_dia);
                } else {
                    System.out.println(MSG_ERROR_dia);
                }
                break;
            case 12:
                System.out.println("Mes de Diciembre");
                System.out.println("Introduzca el dia del mes ");
                dia = sc.nextInt();
                if (dia >= 1 && dia <= 31) {
                    System.out.println(MSG_OK_dia);
                } else {
                    System.out.println(MSG_ERROR_dia);
                }
                break;    
            default:
                System.out.println("Opción no válida como mes del año");
                break;
        }
    }
}