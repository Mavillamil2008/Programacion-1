import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        
        // Ejercicio 1 Area del cuadrado
        int lado, areaCuadrado;
        lado = 9;
        areaCuadrado = lado * lado;
        System.out.println("El area del cuadrado es: " + areaCuadrado);

        //Ejercicio 2 Area del Circulo
        double r, areaCirculo, pi = 3.1416;
        r = 5;
        areaCirculo = (pi * (r * r));
        System.out.println("El area del ciruclo es: " + areaCirculo);

        //Ejercicio 3 conversion Fahrenheit a Celsius y de Celsius a Fahrenheit
        double c = 30.0, f = 102.0, FahrenheitCelsius, CelsiusFahrenheit;
        FahrenheitCelsius = (f - 32) * 5/9;
        CelsiusFahrenheit = (c * 9/5) + 32;
        System.out.println("La conversión de Fahrenheit a Celsius: " + FahrenheitCelsius);
        System.out.println("La conversión de Celsius a Fahrenheit: " + CelsiusFahrenheit);
        
        //Cobro de parqueadero con Iva
        double iva, valor;
        int paq = 2000;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la cantidad de horas que dejaras tu vehiculo: ");
        int horas = leer.nextInt();
        iva = ((paq * horas) * 0.2);
        valor = (paq * horas) + iva;
        //System.out.println("El valor total es de: " + valor, "ya que el iva cuenta con costo adicional de: " + iva);
        System.out.println("El valor total es de: " + valor + ", ya que el IVA cuenta con costo adadicional de: " + iva);
        leer.close();

        //salario
        double sb = 1432500, dedu = 56940, comi = 50000, salario_neto;
        System.out.println("Las comisiones fueron de: " + comi);
        salario_neto = ((sb-dedu) + comi);
        System.out.println("tu salario fue de: " + salario_neto + "tu salario en bruto es de: " + sb);
       
        // pesos euros
        double d = 0.00025, e = 0.00021, totale, totald;
        Scanner pesos = new Scanner(System.in);
        System.out.println("Digite la cantidad de Pesos que deseas convertir: ");
        int p = pesos.nextInt();
        totale = p * e;
        totald = p * d;
        System.out.println("Los pesos en Dolares es de: " + totald + ", Los pesos en Euros es de: " + totale);
        pesos.close();

        
    }
}
