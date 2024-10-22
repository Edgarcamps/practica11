/**
 * La clase Articulo representa un artículo con un título y un año de publicación.
 *  @author Fuentes Esquivel Elian Andrea 
 * @author Campos Mendoza Edgar Felipe       
 * @version 1.0                 
 * @date 21 oct
 *  2024. 
 */
public class Torre extends Pieza {

    /**
     * Constructor para la clase Torre.
     *
     * @param color Color de la pieza (blanco o negro).
     * @param x     Posición en el eje X (columna) del tablero.
     * @param y     Posición en el eje Y (fila) del tablero.
     */
    public Torre(String color, int x, int y) {
        super(color, x, y);
    }

    /**
     * Devuelve una cadena con los posibles movimientos de la Torre 
     * según su posición actual en el tablero.
     * La Torre se mueve horizontal o verticalmente cualquier cantidad de casillas.
     *
     * @return Una cadena con las coordenadas de los posibles movimientos.
     */
    @Override
    public String posiblesMovimientos() {
        StringBuilder movimientos = new StringBuilder();

        // Movimiento en la misma fila (horizontal)
        for (int i = 1; i <= 8; i++) {
            if (i != x) {
                movimientos.append("(").append(i).append(",").append(y).append(") ");
            }
        }

        // Movimiento en la misma columna (vertical)
        for (int j = 1; j <= 8; j++) {
            if (j != y) {
                movimientos.append("(").append(x).append(",").append(j).append(") ");
            }
        }

        return movimientos.toString();
    }
}
