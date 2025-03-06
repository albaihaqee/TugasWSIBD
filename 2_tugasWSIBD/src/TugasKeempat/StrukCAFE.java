package TugasKeempat;

import java.util.Scanner;

public class StrukCAFE {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--------------------------------------------------------");
        System.out.println("                       CAFE CERIA                       ");
        System.out.println("                     ANEKA MINUMAN                      ");
        System.out.println("--------------------------------------------------------");
        System.out.println("                     SPECIAL MENU :                     ");
        System.out.println("                    1. Soft drinks                      ");
        System.out.println("                    2. Mix juice                        ");
        System.out.println("                    3. Nescafe                          ");
        System.out.println("                    4. Soda milk                        ");
        System.out.println("                    5. Tea                              ");
        System.out.println("--------------------------------------------------------");

        System.out.print("Masukkan nama pembeli : ");
        String nama = input.nextLine();
        
        System.out.print("\nSilakan masukkan pilihan anda : ");
        int pilihan = input.nextInt();
        
        String pesanan;
        switch (pilihan) {
            case 1:
                pesanan = "Soft drinks";
                break;
            case 2:
                pesanan = "Mix juice";
                break;
            case 3:
                pesanan = "Nescafe";
                break;
            case 4:
                pesanan = "Soda milk";
                break;
            case 5:
                pesanan = "Tea";
                break;
            default:
                pesanan = "Pilihan tidak tersedia";
        }
        
        if (pilihan >= 1 && pilihan <= 5) {
            System.out.println("\nMinuman yang anda pesan adalah " + pesanan);
            System.out.println("Pesanan akan segera kami antar");
        } else {
            System.out.println("\n" + pesanan);
        }

        System.out.println("\n--------------------------------------------------------");
        System.out.println("Terima Kasih " + nama + " telah berkunjung di Cafe Ceria");
        System.out.println("--------------------------------------------------------");

        input.close();
    }
}
