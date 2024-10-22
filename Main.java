import java.util.Scanner;

/**
 * La clase Articulo representa un artículo con un título y un año de publicación.
 *  @author Fuentes Esquivel Elian Andrea 
 * @author Campos Mendoza Edgar Felipe       
 * @version 1.0                 
 * @date 21 oct
 *  2024. 
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pieza[] piezas = new Pieza[3];  // Cambiar a la cantidad de piezas que se desee probar

        for (int i = 0; i < piezas.length; i++) {
            System.out.println("Ingresa el tipo de pieza (caballo, peon, torre): ");
            String tipo = scanner.nextLine();
            System.out.println("Ingresa el color (blanco o negro): ");
            String color = scanner.nextLine();
            System.out.println("Ingresa la posición inicial (x y): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            // Creación de la pieza según el tipo ingresado por el usuario
            if (tipo.equalsIgnoreCase("caballo")) {
                piezas[i] = new Caballo(color, x, y);
            } else if (tipo.equalsIgnoreCase("peon")) {
                piezas[i] = new Peon(color, x, y);
            } else if (tipo.equalsIgnoreCase("torre")) {
                piezas[i] = new Torre(color, x, y);
            }
        }

        // Mostrar los movimientos posibles de cada pieza
        for (Pieza pieza : piezas) {
            System.out.println("Posibles movimientos para la pieza en (" + pieza.x + ", " + pieza.y + "): " + pieza.posiblesMovimientos());
        }

        scanner.close();
    }
}
