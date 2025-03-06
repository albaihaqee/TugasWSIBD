package pkg3_tugaswsibd;

public class NamaArray {
    public static void main(String[] args) {
        String[] namaBagian = {"Faiq", "Raihan", "Albaihaqi"};
        
        System.out.println("Bagian-bagian nama:");
        for (int i = 0; i < namaBagian.length; i++) {
            System.out.println("Bagian ke-" + (i+1) + ": " + namaBagian[i]);
        }
        
        String namaLengkap = "";
        for (int i = 0; i < namaBagian.length; i++) {
            namaLengkap += namaBagian[i];
            if (i < namaBagian.length - 1) {
                namaLengkap += " ";
            }
        }
        System.out.println("\nNama lengkap: " + namaLengkap);
        
        String namaLengkapAlt = String.join(" ", namaBagian);
        System.out.println("Nama lengkap (alternatif): " + namaLengkapAlt);
    }
}
