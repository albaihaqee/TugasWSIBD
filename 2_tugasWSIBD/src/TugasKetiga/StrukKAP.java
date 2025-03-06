package TugasKetiga;

import java.util.Scanner;

public class StrukKAP {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println ("-----------------------------------------------");
        System.out.println ("           Kharisma Agung Plaza (KAP)          ");
        System.out.println ("            Promo Belanja Berhadiah            ");
        System.out.println ("       Khusus Pembelian 5 Barang Pertama       ");
        System.out.println ("        Dengan harga minimum Rp 10000.00       ");
        System.out.println ("-----------------------------------------------");

        System.out.print("Masukkan nama pembeli : ");
        String nama = input.nextLine();
        System.out.println("");
        
        int totalHarga = 0;
        boolean dapatMug = true;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan harga barang ke-" + i + " : ");
            int harga = input.nextInt();
            totalHarga += harga;
            
            if(harga < 10000) {
                dapatMug = false;
            }
        }
        
        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " + totalHarga);
        System.out.println("");
        
        if(dapatMug) {
            System.out.println("Selamat...\nAnda mendapat hadiah 1 buah mug cantik");
        } else {
            System.out.println("Maaf, Anda tidak memenuhi syarat untuk mendapatkan hadiah");
        }
        
        System.out.println("-----------------------------------------------");
        System.out.println("               Terima Kasih                    ");
        System.out.println(" Anda telah berbelanja di Kharisma Agung Plaza ");
        System.out.println("-----------------------------------------------");
    }
}
