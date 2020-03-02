/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

import static java.lang.System.exit;
import java.util.InputMismatchException;
import java.lang.Exception;
import java.lang.Throwable;
import java.util.Scanner;

/**
 *
 * @author sistem
 */
public class BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereh
        Scanner menu = new Scanner(System.in);

        do {
            int pilih;
            int hitung;
            int hasil;
            double hasil2;

            System.out.println("MANA YANG KAMU PILIH?");
            System.out.println("1. BALOK");
            System.out.println("2. KERUCUT");
            System.out.println("3. LIMAS SEGITIGA");
            System.out.println("4. EXIT");
            System.out.println("ENTER CHOOSE NUMBER");
            pilih = menu.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("KAMU MENGHITUNG BALOK");
                    System.out.println("HITUNG MANA DULU");
                    System.out.println("1. VOLUME");
                    System.out.println("2. LUAS PERMUKAAN");
                    System.out.println("ENTER CHOOSE NUMBER");
                    Balok b = new Balok();
                    Scanner balok = new Scanner(System.in);
                    int pj,
                     lb,
                     tg;

                    hitung = menu.nextInt();
                    switch (hitung) {
                        case 1:
                            try {
                                System.out.println("PANJANG =");
                                pj = balok.nextInt();

                                System.out.println("LEBAR = ");
                                lb = balok.nextInt();

                                System.out.println("TINGGI = ");
                                tg = balok.nextInt();
                                b.Volume(pj, lb, tg);
                            } catch (InputMismatchException err) {
                                System.err.println("Errornya" + " " + err.getMessage());
                                System.out.println("Input integer aja yaa");
                            } finally {
                                System.out.println("Perhitungan selesai...");
                            }

                            break;

                        case 2:
                            try {
                                System.out.println("PANJANG =");
                                pj = balok.nextInt();

                                System.out.println("LEBAR = ");
                                lb = balok.nextInt();

                                System.out.println("TINGGI = ");
                                tg = balok.nextInt();
                                hasil = b.Luas(pj, lb, tg);

                                System.out.println("Luas permukaan balok= " + hasil);
                            } catch (InputMismatchException err) {
                                System.err.println("Errornya" + " " + err.getMessage());
                                System.out.println("Input integer aja yaa");
                            } finally {
                                System.out.println("Perhitungan selesai...");

                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("KAMU MENGHITUNG KERUCUT");
                    System.out.println("HITUNG MANA DULU");
                    System.out.println("1. VOLUME");
                    System.out.println("2. LUAS PERMUKAAN");
                    System.out.println("ENTER CHOOSE NUMBER");
                    Kerucut k = new Kerucut();
                    Scanner kerucut = new Scanner(System.in);
                    double rj,
                     ti,
                     ss;

                    hitung = menu.nextInt();
                    switch (hitung) {
                        case 1:
                            try {
                                System.out.println("JARI-JARI =");
                                rj = kerucut.nextDouble();

                                System.out.println("TINGGI = ");
                                ti = kerucut.nextDouble();

                                hasil2 = k.Volume(rj, ti);
                                System.out.println("Volume kerucut = " + hasil2);
                            } catch (Exception err) {
                                System.err.println("Errornya" + " " + err.getMessage());
                                System.out.println("Kamu input selain angka yaa");
                            } finally {
                                System.out.println("Perhitungan selesai...");

                            }
                            break;

                        case 2:
                            try {
                                System.out.println("JARI-JARI =");
                                rj = kerucut.nextDouble();

                                System.out.println("SELIMUT = ");
                                ss = kerucut.nextDouble();

                                hasil2 = k.Luas(rj, ss);

                                System.out.println("Luas permukaan kerucut= " + hasil2);
                            } catch (Exception err) {
                                System.err.println("Errornya" + " " + err.getMessage());
                                System.out.println("Kamu input selain angka yaa");
                            } finally {
                                System.out.println("Perhitungan selesai...");

                            }
                            break;

                    }
                    break;

                case 3:
                    System.out.println("KAMU MENGHITUNG LIMAS SEGITIGA");
                    System.out.println("HITUNG MANA DULU");
                    System.out.println("1. VOLUME");
                    System.out.println("2. LUAS PERMUKAAN");
                    System.out.println("ENTER CHOOSE NUMBER");
                    LimasSegitiga ls = new LimasSegitiga();
                    Scanner limassgtg = new Scanner(System.in);
                    double aa,
                     tAlass,
                     tLimass,
                     luasMrg;
                    hitung = menu.nextInt();
                    switch (hitung) {
                        case 1:
                            try {
                                System.out.println("ALAS =");
                                aa = limassgtg.nextDouble();

                                System.out.println("TINGGI ALAS = ");
                                tAlass = limassgtg.nextDouble();
                                System.out.println("TINGGI LIMAS = ");
                                tLimass = limassgtg.nextDouble();

                                hasil2 = ls.Volume(aa, tAlass, tLimass);
                                System.out.println("Volume limas segitiga= " + hasil2);
                            } catch (Throwable err) {
                                System.err.println("Errornya" + " " + err.getMessage());
                                System.out.println("Kamu input selain angka yaa");
                            } finally {
                                System.out.println("Perhitungan selesai...");

                            }
                            break;

                        case 2:
                            try {
                                System.out.println("ALAS =");
                                aa = limassgtg.nextDouble();

                                System.out.println("TINGGI ALAS = ");
                                tAlass = limassgtg.nextDouble();
                                System.out.println("LUAS MIRING = ");
                                luasMrg = limassgtg.nextDouble();

                                hasil2 = ls.Luas(aa, tAlass, luasMrg);

                                System.out.println("Luas permukaan limas segitiga= " + hasil2);
                            } catch (Throwable err) {
                                System.err.println("Errornya" + " " + err.getMessage());
                                System.out.println("Kamu input selain angka yaa");
                            } finally {
                                System.out.println("Perhitungan selesai...");

                            }
                            break;

                    }
                    break;
                case 4:
                    exit(0);
            }
        } while (1 < 2);
    }
}
