package pboif2.pkg10119052.latihan36.targetsaldotabungan;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * target saldo tanbungan
 * 
 */
public class PBOIF210119052Latihan36TargetSaldoTabungan {

    public static void main(String[] args) {
       Tabungan tabungan = new Tabungan();
        
        tabungan.setSaldo(3500000);
        tabungan.setTarget(6000000);
        tabungan.setBunga(0.08);
        
        tabungan.hitungTarget();
    }
    
}
