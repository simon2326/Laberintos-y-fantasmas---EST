package simulacion;

import edu.princeton.cs.algs4.StdDraw;

/**
 *
 * @author ALEJO
 */
public class Fantasma {
    
    //Posición Actual
    private int x, y, direccion;
    private Laberinto lab;
    
    public Fantasma(Laberinto lab){
        try{
            /*
            Inicializar el fantasma en una posición
            aleatoria, diferente del muro
            En este caso X = 13 y Y = 31
            */
            direccion = 1 + (int)(Math.random() * 4);
            do{
                this.lab = lab;
                x = (int)(lab.getMatriz_lab()[0].length*Math.random());
                y = (int)(lab.getMatriz_lab().length*Math.random());

            }while(lab.getPosicion(x, y).equals("Muro"));

            dibujar();  
        }
        catch (Exception e)
        {
            
        }
        
    }
    
    public void dibujar(){
        try
        {
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledEllipse(x, y, 0.4, 0.11);

            StdDraw.filledSquare(x+0.2, y-0.1, 0.06);
            StdDraw.filledSquare(x-0.2, y-0.1, 0.06);
            StdDraw.filledSquare(x, y-0.1, 0.06);

            StdDraw.setPenColor(StdDraw.BOOK_BLUE);
            StdDraw.filledCircle(x-0.15, y+0.003, 0.05);
            StdDraw.filledCircle(x+0.15, y+0.003, 0.05);
        }
        catch (Exception e)
        {
            
        }
        
    }
    
    public void mover(){
        try
        {
            switch(direccion){
                
                case 1: //Norte (N)
                    assert(lab.getPosicion(x, y+1).equals("Camino") || 
                           lab.getPosicion(x, y+1).equals("Muro")):"El Laberinto debe ser de unos y ceros";
                    if(lab.getPosicion(x, y+1).equals("Camino")){
                        StdDraw.setPenColor(StdDraw.GRAY);
                        StdDraw.filledSquare(x, y, 0.4);
                        y++;
                    }else
                    direccion = 1 + (int)(Math.random() * 4);
                    break;
                    
                case 2: //Este (E)
                    assert(lab.getPosicion(x, y+1).equals("Camino") || 
                           lab.getPosicion(x, y+1).equals("Muro")):"El Laberinto debe ser de unos y ceros";
                    if(lab.getPosicion(x+1, y).equals("Camino")){
                        StdDraw.setPenColor(StdDraw.GRAY);
                        StdDraw.filledSquare(x, y, 0.4);
                        x++;
                        
                    }else
                    direccion = 1 + (int)(Math.random() * 4);
                    break;
                    
                case 3: //Oeste (W)
                    assert(lab.getPosicion(x, y+1).equals("Camino") || 
                           lab.getPosicion(x, y+1).equals("Muro")):"El Laberinto debe ser de unos y ceros";
                    if(lab.getPosicion(x-1, y).equals("Camino")){
                        StdDraw.setPenColor(StdDraw.GRAY);
                        StdDraw.filledSquare(x, y, 0.4);
                        x--;
                    }else
                    direccion = 1 + (int)(Math.random() * 4);
                    break;
                    
                case 4: //Sur (S)
                    assert(lab.getPosicion(x, y+1).equals("Camino") || 
                           lab.getPosicion(x, y+1).equals("Muro")):"El Laberinto debe ser de unos y ceros";
                    if(lab.getPosicion(x, y-1).equals("Camino")){
                        StdDraw.setPenColor(StdDraw.GRAY);
                        StdDraw.filledSquare(x, y, 0.4);    
                        y--;
                    }else
                        direccion = 1 + (int)(Math.random() * 4);
                    break;
            }
            dibujar();
        }
        catch (Exception e){
            
        }      
    }
}
