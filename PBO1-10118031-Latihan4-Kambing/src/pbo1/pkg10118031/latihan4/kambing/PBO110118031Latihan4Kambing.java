package pbo1.pkg10118031.latihan4.kambing;

/**
 *
 * @author Vendetta
 * NANA              : Rizki Aria Putra
 * Kelas             : PBO1
 * NIM               : 10118031
 * Deskripsi Program : Prrogram ini berisi program untuk varibel lokal
 */
public class PBO110118031Latihan4Kambing {
//Deklarasi variable lokal

    public void tambahKambing() {
        int jumlahKambing = 0;
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah di tambah: " + jumlahKambing);
    }

    public static void main(String[] args) {

        PBO110118031Latihan4Kambing kambingJantan = new PBO110118031Latihan4Kambing();
        kambingJantan.tambahKambing();

    }

}
