import java.util.Scanner;
public class arreglomaximominimo {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el tamaño del arreglo
        System.out.print("\nIngrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        // Declarar y construir el arreglo de enteros del tamaño leido
        int[] arreglo = new int[tamano];

        // Solicitar al usuario que ingrese los valores del arreglo
        for (int i = 0; i < tamano; i++) {
            System.out.print("Ingrese el valor #" + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Encontrar el valor máximo y mínimo del arreglo
        int maximo = arreglo[0];
        int minimo = arreglo[0];

        for (int i = 1; i < tamano; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }

        // Contar la cantidad de valores impares y pares en el arreglo
        int impares = 0;
        int pares = 0;

        for (int i = 0; i < tamano; i++) {
            if (arreglo[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Muestra los resultados
        System.out.println("\nRESULTADOS: " + tamano+ " valores introducidos");
        System.out.println("Valor máximo del arreglo: " + maximo);
        System.out.println("Valor mínimo del arreglo: " + minimo);
        System.out.println("Cantidad de valores impares: " + impares);
        System.out.println("Cantidad de valores pares: " + pares);

        // Cerrar el scanner
        scanner.close();
    }
}
    


 