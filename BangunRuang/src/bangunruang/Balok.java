package bangunruang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sistem
 */

public class Balok  {
    
 
    public int Volume(int p, int l, int t){
        return p*l*t;
    }
    public int Luas(int p, int l, int t){
        return 2*((p*l)+(p*t)+(l*t));
    }
    
}
