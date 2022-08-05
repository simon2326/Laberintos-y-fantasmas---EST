package simulacion;

/**
 * @author Simón
 */
import java.util.Arrays;

public class Simulacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] vector = {
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
                "1111111111111111111111111111111"};
         Laberinto lol = new Laberinto(vector);
         Fantasma lola = new Fantasma(lol);
      
    }
    
   
}
