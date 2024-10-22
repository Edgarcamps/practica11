/**
 * La clase Articulo representa un artículo con un título y un año de publicación.
 *  @author Fuentes Esquivel Elian Andrea 
 * @author Campos Mendoza Edgar Felipe       
 * @version 1.0                 
 * @date 21 oct
 *  2024. 
 */
public class Peon extends Pieza {

    /**
     * Constructor para la clase Peon.
     *
     * @param color Color de la pieza (blanco o negro).
     * @param x     Posición en el eje X (columna) del tablero.
     * @param y     Posición en el eje Y (fila) del tablero.
     */
    public Peon(String color, int x, int y) {
        super(color, x, y);
    }

    /**
     * Devuelve una cadena con los posibles movimientos del Peón 
     * según su posición actual en el tablero.
     * En su primer movimiento, el Peón puede avanzar dos casillas hacia adelante;
     * después, solo una casilla.
     *
     * @return Una cadena con las coordenadas de los posibles movimientos.
     */
    @Override
    public String posiblesMovimientos() {
        StringBuilder movimientos = new StringBuilder();

        int direccion = color.equals("blanco") ? 1 : -1;

        // Primer movimiento (puede avanzar 2 casillas)
        if ((color.equals("blanco") && y == 2) || (color.equals("negro") && y == 7)) {
            if (dentroDelTablero(x, y + 2 * direccion)) {
                movimientos.append("(").append(x).append(",").append(y + 2 * direccion).append(") ");
            }
        }

        // Movimiento normal de 1 casilla hacia adelante
        if (dentroDelTablero(x, y + direccion)) {
            movimientos.append("(").append(x).append(",").append(y + direccion).append(") ");
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
