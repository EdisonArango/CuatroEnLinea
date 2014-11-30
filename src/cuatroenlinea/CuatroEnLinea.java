/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cuatroenlinea;

import java.util.Random;

/**
 *
 * @author Arango Abello
 */
public class CuatroEnLinea {

    private int[][] juego=new int[7][8];
    
    public int aplicador(){
        Random rnd=new Random();
        return rnd.nextInt(8);
    }

    public int verificarGanador(){
        for (int i = 0; i < juego.length; i++) {
            for (int j = 0; j < juego[0].length; j++) {
                try{
                if (juego[i][j]==juego[i][j+1]&&juego[i][j]==juego[i][j+2]&&juego[i][j]==juego[i][j+3]) {
                    if (juego[i][j]!=0) {
                        return juego[i][j];
                    }
                }
                }catch(Exception e){
                    //System.out.println("Nulo en: "+i+","+j);
                }
                try{
                if (juego[i][j]==juego[i+1][j]&&juego[i][j]==juego[i+2][j]&&juego[i][j]==juego[i+3][j]){
                    if (juego[i][j]!=0) {
                        return juego[i][j];
                    }
                }
                }catch(Exception e){}
                try{
                if (juego[i][j]==juego[i-1][j-1]&&juego[i][j]==juego[i-2][j-2]&&juego[i][j]==juego[i-3][j-3]){
                    if (juego[i][j]!=0) {
                        return juego[i][j];
                    }
                }
                }catch(Exception e){}
                try{
                if (juego[i][j]==juego[i-1][j+1]&&juego[i][j]==juego[i-2][j+2]&&juego[i][j]==juego[i-3][j+3]){
                    if (juego[i][j]!=0) {
                        return juego[i][j];
                    }
                }
                }catch(Exception e){}
            }
        }
        return 0;
    }
    
    public int[][] getJuego() {
        return juego;
    }
    
}
