package pkg3_tugaswsibd;

import java.util.Scanner;

public class JumlahElemenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = input.nextInt();
        
        int[] deret = new int[jumlahElemen];
        
        System.out.println("\nMasukkan " + jumlahElemen + " angka untuk mengisi array:");
        
        int i = 0;
        if (jumlahElemen > 0) {
            do {
                System.out.print("Elemen ke-" + (i+1) + ": ");
                deret[i] = input.nextInt();
                i++;
            } while (i < deret.length);
        }
        
        System.out.println("\nIsi array yang telah dibuat:");
        
        i = 0;
        if (jumlahElemen > 0) {
            do {
                System.out.print(deret[i]);
                // Menambahkan koma jika bukan elemen terakhir
                if (i < deret.length - 1) {
                    System.out.print(", ");
                }
                i++;
            } while (i < deret.length);
        }
        System.out.println("");
        input.close();
    }
}
