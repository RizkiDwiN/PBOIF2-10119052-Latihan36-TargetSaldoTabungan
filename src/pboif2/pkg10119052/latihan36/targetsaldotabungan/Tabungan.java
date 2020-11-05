/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119052.latihan36.targetsaldotabungan;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * target saldo tabungan
 * 
 */
public class Tabungan {
    private int target, saldo;
    private double bunga;

    public void setTarget(int target) {
        this.target = target;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setBunga(double bunga) {
        this.bunga = bunga;
    }
    
    public void hitungTarget() {
        int i = 0;
        while(saldo <= target) {
            i++;
            saldo = saldo + (int)(saldo * bunga);
            System.out.println("Saldo di bulan ke-" + i + " Rp. " +
                    String.format("%,d", saldo).replace(',', '.'));
        }
    } 
}
