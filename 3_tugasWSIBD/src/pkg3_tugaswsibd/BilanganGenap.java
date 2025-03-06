package pkg3_tugaswsibd;

import java.util.Scanner;

public class BilanganGenap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();
        
        if (batasAwal > batasAkhir) {
            System.out.println("Error: Batas awal tidak boleh lebih besar dari batas akhir");
            return;
        }
        
        System.out.println("Bilangan genap dari " + batasAwal + " sampai " + batasAkhir + " adalah:");
        
        if (batasAwal % 2 != 0) {
            batasAwal++;
        }
        
        for (int i = batasAwal; i <= batasAkhir; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("");
        input.close();
    }
}
