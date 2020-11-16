package pbo2.pkg10119073.latihan60.akatsuki;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan profil anggota akatsuki
 * dengan konsep pewarisan class
 *
 */

public class Akatsuki {
    protected String nama, asal, cincin, posisiCincin, partner, ciri;

    public Akatsuki() {
        System.out.println("====================================");
        System.out.println("--------------AKATSUKI--------------");
        System.out.println("====================================");
        System.out.println("Daftar Anggota :");
        System.out.println("1. Pein");
        System.out.println("2. Konan");
        System.out.println("3. Kisame");
        System.out.println("4. Zetsu");
        System.out.println("5. Tobi");
        System.out.println("6. Deidara");
        System.out.println("7. Hidan");
        System.out.println("8. Kakuzu");
        System.out.println("9. Sasori");
        System.out.println("10. Itachi");
        System.out.println("11. Orochimaru");
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public String getCincin() {
        return cincin;
    }

    public String getPosisiCincin() {
        return posisiCincin;
    }

    public String getPartner() {
        return partner;
    }
    
    public String getCiri(){
        return ciri;
    }

    public int pilihAnggota() {
        System.out.print("\nPilih Karakter : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    
}
