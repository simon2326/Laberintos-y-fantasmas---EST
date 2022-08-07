package simulacion;

import edu.princeton.cs.algs4.StdDraw;
/**
 *
 * @author ALEJO
 */
public class Laberinto {
    
    private int[][] matriz_lab;

    public int[][] getMatriz_lab() {
        return matriz_lab;
    }
    
    public Laberinto(String[] vector){
        
        //Inicializar la matriz convirtiendo a enteros los valores del vector
        this.matriz_lab = new int[vector.length][vector[0].length()];
        
        for(int i = 0; i < vector.length; i++){
            for(int j = 0; j < vector[i].length(); j++){
                //
                matriz_lab[i][j] = Character.getNumericValue(vector[i].charAt(j));
            }
        }
        dibujarLaberinto();
    }
    
    public String getPosicion(int x, int y){
        
        //1 representa muro y el 0 representa camino.
        if(matriz_lab[(matriz_lab.length-1)-y][x]==1)
            return "Muro";
        else
            return "Camino";
    }
    
    public void dibujarLaberinto(){
        
        int x = matriz_lab.length-1;
        int y;
        
        StdDraw.setXscale(0, matriz_lab[0].length);
        StdDraw.setYscale(0, x);
        
        for(int i = 0; i < matriz_lab.length; i++){
            y = 0;
            for(int j = 0; j < matriz_lab[i].length; j++){
                
                if(matriz_lab[i][j] == 1){
                    StdDraw.setPenColor(StdDraw.BOOK_RED);
                    StdDraw.filledSquare(y, x, 0.55);
                }
                else{
                    StdDraw.setPenColor(StdDraw.GRAY);
                    StdDraw.filledSquare(y, x, 0.55);
                }
                y++;
            }
            x--;
        } 
    }
}
