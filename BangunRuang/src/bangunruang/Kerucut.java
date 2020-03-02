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
public class Kerucut {
    public double pi = 3.14, r, s;

 
   
    public double Volume(double r, double t){
        return (pi*r*r*t)/3;
       
       
    }
    public double Luas(double r, double s){
        double luasAlas = pi*r*r;
        double luasSelimutK = pi*r*s;
        return luasAlas+luasSelimutK;
    }
}

