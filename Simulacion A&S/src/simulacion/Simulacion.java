package simulacion;

import static java.lang.Thread.sleep;
import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.*;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author ALEJO
 */
public class Simulacion {
    
    //Vector de Strings que generará la matriz del laberinto
    private static String[] data = {
            "1111111111111111111111111111111",
            "1010100010001000100010001000101",
            "1010101110111011101110111011101",
            "1000001000100000100000000000101",
            "1011111011111011101010101011101",
            "1000000000000000001010101010001",
            "1011101010101011111111111110101",
            "1000101010101000000000001000101",
            "1011101011111010101010111011111",
            "1010001000100010101010000000001",
            "1110111011101011111110111110111",
            "1000100010001000001000000010001",
            "1111111111111111111111111111111"
            };
    
    //Inicializar el laberinto
    private static Laberinto lab = new Laberinto(data);

    //Bolsa de Fantasmas
    private static Bag<Fantasma> ghostsBag = new Bag<>();
            
         
    public static void main(String[] args) {
        
        try
        {
            //Pregunta al usuario
            int cant_ghost = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos fantasmas quiere para el laberinto?\n"
                                                                        + "Presione cualquier tecla para finalizar"));
            //Agregar todos los fantasmas a la bolsa
            for(int i = 0; i < cant_ghost; i++){
                ghostsBag.add(new Fantasma(lab));
            }
            run();
        }
        catch (Exception e){
            StdOut.println(e);
        }
    }
    
    public static void run() throws Exception{
        
        do
        {
            for(Fantasma fantasma: ghostsBag){
                fantasma.mover();
                Thread.sleep(10);
            }
        }
        while(!StdDraw.hasNextKeyTyped());
        System.exit(0);
        
    }
    
}
