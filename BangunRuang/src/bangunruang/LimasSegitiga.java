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
public class LimasSegitiga {
    public double Volume(double a, double tAlas, double tLimas){
        double luasAlas = (a*tAlas)/2;
        return (luasAlas*tLimas)/3;
    }
    public double Luas(double a, double tAlas, double luasMiring){
        double luasAlas = (a*tAlas)/2;
        return luasAlas+(3*luasMiring);
    }
    
}
