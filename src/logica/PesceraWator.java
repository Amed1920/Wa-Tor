
package logica;

/**
 *
 * @author Amed
 */
public class PesceraWator {
     private final int pes = 20;
     
      private int matriz[][] = new int[pes][pes];

    public PesceraWator() {
        
        //llena la matriz con los valores
        for (int b = 0; b < 10; b++) {
            for (int c = 0; c < 10; c++) {
                matriz[b][c] = 0;
            }
        }
    }
    //Obtiene un valor especifico  de la matriz
    public int getValor(int fila, int columna) {
        return matriz[fila][columna];
    }
    //Establece un valor en una celda especifica
    public void setValor(int fila, int columna, int valor) {
        matriz[fila][columna] = valor;
    }
    public void llenarPescera() {
        int fila = 0, columna = 0;
        //metodo que coloca los peces 50 hembras y 50 machos
        for (int i = 0; i < 50; i++) {
            //Coloca un pez macho
            do {
                fila = (int) (Math.random() * 20);
                columna = (int) (Math.random() * 20);
            } while (matriz[fila][columna] != 0);
            setValor(fila, columna, 1);
            //Coloca un pez hembra
            do {
                fila = (int) (Math.random() * 20);
                columna = (int) (Math.random() * 20);
            } while (matriz[fila][columna] != 0);
            setValor(fila, columna, 2);
        }
        //Metodo que coloca tiburones 5 hembras y 5 machos
        for (int i = 0; i < 10; i++) {
            //Coloca un tiburon macho
            do {
                fila = (int) (Math.random() * 20);
                columna = (int) (Math.random() * 20);
            } while (matriz[fila][columna] != 0);
            setValor(fila, columna, 3);
            //Coloca un tiburon hembra
            do {
                fila = (int) (Math.random() * 20);
                columna = (int) (Math.random() * 20);
            } while (matriz[fila][columna] != 0);
            setValor(fila, columna, 4);
        }
    }
    
    }
      

