/**
 * La clase Articulo representa un artículo con un título y un año de publicación.
 *  @author Fuentes Esquivel Elian Andrea 
 * @author Campos Mendoza Edgar Felipe       
 * @version 1.0                 
 * @date 21 oct
 *  2024. 
 */
public class Caballo extends Pieza {

    /**
     * Constructor para la clase Caballo.
     *
     * @param color Color de la pieza (blanco o negro).
     * @param x     Posición en el eje X (columna) del tablero.
     * @param y     Posición en el eje Y (fila) del tablero.
     */
    public Caballo(String color, int x, int y) {
        super(color, x, y);
    }

    /**
     * Devuelve una cadena con los posibles movimientos del Caballo 
     * según su posición actual en el tablero.
     * El Caballo se mueve en forma de "L", dos casillas en una dirección 
     * y una en dirección perpendicular.
     *
     * @return Una cadena con las coordenadas de los posibles movimientos.
     */
    @Override
    public String posiblesMovimientos() {
        StringBuilder movimientos = new StringBuilder();

        // Movimientos posibles del caballo en L
        int[][] posiblesMovimientos = {
            {x + 2, y + 1}, {x + 2, y - 1}, {x - 2, y + 1}, {x - 2, y - 1},
            {x + 1, y + 2}, {x + 1, y - 2}, {x - 1, y + 2}, {x - 1, y - 2}
        };

        for (int[] movimiento : posiblesMovimientos) {
            if (dentroDelTablero(movimiento[0], movimiento[1])) {
                movimientos.append("(").append(movimiento[0]).append(",").append(movimiento[1]).append(") ");
            }
        }

        return movimientos.toString();
    }

    /**
     * Verifica si una coordenada está dentro de los límites del tablero.
     *
     * @param x Coordenada en el eje X.
     * @param y Coordenada en el eje Y.
     * @return true si está dentro del tablero, false en caso contrario.
     */
    private boolean dentroDelTablero(int x, int y) {
        return x >= 1 && x <= 8 && y >= 1 && y <= 8;
    }
}
