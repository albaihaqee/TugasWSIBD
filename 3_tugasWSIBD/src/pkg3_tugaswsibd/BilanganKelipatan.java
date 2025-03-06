package pkg3_tugaswsibd;

public class BilanganKelipatan {
    
    public static void main(String[] args) {
        System.out.println("         Do_While         ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        
        String hasilOutput = "";
        int pangkatTemp = 0;
        int bilanganTemp;
        
        do {
            bilanganTemp = (int) Math.pow(2, pangkatTemp);
            
            if (bilanganTemp <= 100) {
                hasilOutput += bilanganTemp + " ";
            }
            
            pangkatTemp++;
        } while (bilanganTemp <= 100);
        
        int spasi = (28 - hasilOutput.length()) / 2; 
        
        for (int i = 0; i < spasi; i++) {
            System.out.print(" ");
        }
        
        int pangkat = 0;
        int bilangan;
        
        do {
            bilangan = (int) Math.pow(2, pangkat);
            
            if (bilangan <= 100) {
                System.out.print(bilangan + " ");
            }
            
            pangkat++;
        } while (bilangan <= 100);
        
        System.out.println("");
    }
}
