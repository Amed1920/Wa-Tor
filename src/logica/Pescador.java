
package logica;

import gui.frmPesceraWator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amed
 */
public class Pescador extends Thread {
    int puntos = 0;
    frmPesceraWator frm;
    PesceraWator pescera;
    
public Pescador(){   
}
public Pescador(frmPesceraWator frm, String nombre, PesceraWator pescera) {
        this.frm = frm;
        setName(nombre);
        this.pescera = pescera;
    }

   

    @Override
    public void run() {
        int fila = 0;
        int columna = 0;
        int pez = 0;
        do {
            fila = (int) (Math.random() * 20);
            columna = (int) (Math.random() * 20);
            pez = pescera.getValor(fila, columna);
            switch (pez) {
                case 1:
                    puntos += 5;
                    break;
                case 2:
                    puntos += 10;
                    break;
                case 3:
                    puntos += 15;
                    break;
                case 4:
                    puntos += 20;
                    break;
            }//Aniquilamos el pez encontrado
            pescera.setValor(fila, columna, 0);
            frm.imprimirTabla();
            frm.imprimirPuntos(getName(), puntos);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Pescador.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (puntos < 100);
    }

}
