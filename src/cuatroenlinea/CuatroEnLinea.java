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

    public int[][] getJuego() {
        return juego;
    }
    
}
