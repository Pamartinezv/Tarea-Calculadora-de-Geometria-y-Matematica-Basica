import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        System.out.println("Calculadora de Geometria y Matematica Basica.\r\n" + //
                        "Menu:\r\n" + //
                        "1. Calcular el area de un circulo.\r\n" + //
                        "2. Calcular el area de un cuadrado.\r\n" + //
                        "3. Calcular el area de un triangulo.\r\n" + //
                        "4. Calcular el factorial de un numero.\r\n" + //
                        "5. Determinar si un numero es par o impar.\r\n" + //
                        "6. Determinar si un numero es positivo, negativo o cero.\r\n" + //
                        "7. Calcular la suma de todos los numeros desde 1 hasta un numero dado.\r\n" + //
                        "8. Salir.");

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        int suma = 0;
        double area = 0;
       
        do {
            try {
                System.out.print("Ingrese un numero del menu: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el valor del radio: ");
                        double radio = scanner.nextDouble();
    
                        area = (double) Math.PI * Math.pow(radio, 2);
    
                        System.out.println("El area del circulo es: " + area);
    
                        break;
                    case 2:
                        System.out.println("Ingrese el valor del lado: ");
                        int lado = scanner.nextInt();
    
                        area = lado * lado;
    
                        System.out.println("El area del cuadro es: " + area);
    
                        break;
                    case 3:
                        System.out.println("Ingrese el valor de la base: ");
                        int base = scanner.nextInt();
    
                        System.out.println("Ingrese el valor de la altura: ");
                        int altura = scanner.nextInt();
    
                        area = (double) (base * altura) / 2;
    
                        System.out.println("El area del triangulo es: " + area);
    
                        break;
                    case 4:
                        System.out.println("Ingrese un numero entero positivo: ");
                        int enteroPositivo = scanner.nextInt();
    
                        long factorial = 1;
                        for (int i = 1; i <= enteroPositivo; i++) {
                            factorial *= i;
                        }
    
                        System.out.println("El falctorial del numero es: " + factorial);
    
                        break;
                    case 5:
                        System.out.println("Ingrese un numero entero : ");
                        int entero = scanner.nextInt();
    
                        if (entero % 2 == 0) {
                            System.out.println("El numero es par.");
                        } else {
                            System.out.println("El numero es impar.");
                        }
    
                        break;
                    case 6:
                        System.out.println("Ingrese un numero entero : ");
                        int entero2 = scanner.nextInt();
    
                        if (entero2 < 0) {
                            System.out.println("El numero es negativo.");    
                        } else if (entero2 > 0) {
                            System.out.println("El numero es positivo.");
                        } else {
                            System.out.println("El numero es cero.");
                        }
    
                        break;
                    case 7:
                        System.out.println("Ingrese un numero entero positivo: ");
                        int enteroPositivo2 = scanner.nextInt();
    
                        for (int j = 1; j <= enteroPositivo2; j++) {
                            suma += j;
                        }

                        System.out.println("La suma de todos los numeros hasta " + enteroPositivo2 + " es: " + suma);
    
                        break;
                    case 8:
                        System.out.println("Fin del Programa.");
                        break;
                }
                

            } catch (InputMismatchException e) {
                System.out.println("Error! Por favor, ingrese un numero del menu.");
                scanner.next();
            }

        } while (opcion < 1 || opcion > 8 );

        scanner.close();

    }

}