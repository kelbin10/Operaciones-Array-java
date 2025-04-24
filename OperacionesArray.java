import java.util.Scanner;

public class OperacionesArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        
        limpiarConsola();
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        limpiarConsola();
        
        int opcion;
        do {
            limpiarConsola();
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Mostrar el array original");
            System.out.println("2. Calcular la suma de los elementos");
            System.out.println("3. Buscar el número máximo y el número mínimo");
            System.out.println("4. Invertir el array");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    mostrarArray(array);
                    break;
                case 2:
                    calcularSuma(array);
                    break;
                case 3:
                    buscarMinMax(array);
                    break;
                case 4:
                    invertirArray(array);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            
            if (opcion != 5) {
                System.out.println("Presione Enter para continuar...");
                scanner.nextLine(); 
                scanner.nextLine(); 
            }
        } while (opcion != 5);
        
        scanner.close();
    }

    public static void limpiarConsola() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n"); 
        }
    }

    public static void mostrarArray(int[] array) {
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void calcularSuma(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        System.out.println("Suma de los elementos: " + suma);
    }

    public static void buscarMinMax(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Número máximo: " + max);
        System.out.println("Número mínimo: " + min);
    }

    public static void invertirArray(int[] array) {
        System.out.print("Array invertido: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
