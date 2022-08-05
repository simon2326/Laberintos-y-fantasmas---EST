package simulacion;

import edu.princeton.cs.algs4.StdDraw;

/**
 *
 * @author simon
 */
public class Laberinto {
    
    private int[][] matriz; 

    public int[][] getMatriz() {
        return matriz;
    }
    
    public Laberinto(String[] data){
        
        this.matriz = new int [data.length][data[0].length()];
        
        
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length(); j++){
                matriz[i][j]= Character.getNumericValue(data[i].charAt(j)); 
                System.out.print(matriz[i][j]);
            }
            System.out.println("|"); // borrarlo luego
        }  
        
        dibujarLaberinto();
    }
    
    public String getPosicion(int x, int y){
    
        if(matriz[(matriz.length-1)-y][x]==1) //Ya que la matriz está al revés
            return "Muro";
        else 
            return "Camino";
    }
    
    public void dibujarLaberinto(){
        
        int x = matriz.length-1;
        int y;
        
        StdDraw.setXscale(0, matriz[0].length);
        StdDraw.setYscale(0, matriz.length-1);

        for(int i = 0; i < matriz.length; i++){ 
            y=0;
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] == 1){
                    StdDraw.setPenColor(StdDraw.DARK_GRAY);
                    StdDraw.filledSquare(y, x , 0.52);
                    
                }
                y++;
            }
            x--;
        }
    }
    
}
