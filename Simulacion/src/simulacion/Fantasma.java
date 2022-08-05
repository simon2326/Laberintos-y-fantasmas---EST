package simulacion;

import edu.princeton.cs.algs4.StdDraw;

/**
 *
 * @author simon
 */
public class Fantasma {
    
    private int x_pos;
    private int y_pos;
    
    public Fantasma(Laberinto laberinto){
        
        do{
            x_pos = (int)(laberinto.getMatriz()[0].length*Math.random());
            y_pos = (int)(laberinto.getMatriz().length*Math.random());
            
            System.out.println(laberinto.getPosicion(x_pos, y_pos)); // BORRAR
            System.out.println(x_pos + " " + y_pos);
         
        }
        while(laberinto.getPosicion(x_pos, y_pos).equals("Muro"));
        dibujar();
        
        
    }
    
    public void  dibujar(){
        
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledEllipse(x_pos, y_pos , 0.42,0.22);
        
    }
    
    public void mover(){
        
        
    }
    
}


