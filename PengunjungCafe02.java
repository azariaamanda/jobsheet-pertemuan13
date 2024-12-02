import java.util.Scanner;
public class PengunjungCafe02 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung: ");
        // for (int i=0; i < namaPengunjung.length; i++){
        //     System.out.println("- " + namaPengunjung[i]);
        for (String pengunjung : namaPengunjung) {
            System.out.println("- " + pengunjung);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }  
}
//     Contoh no 3
//     public static void daftarPengunjung(String... namaPengunjung, int... umurPengunjung) {
//         System.out.println("Daftar Nama dan Umur Pengunjung:");
//         for (int i = 0; i < namaPengunjung.length; i++) {
//             System.out.println("- " + namaPengunjung[i] + " (Umur: " + umurPengunjung[i] + ")");
//         }
//     }

//     public static void main(String[] args) {
//         daftarPengunjung("Ali", "Budi", "Citra", 25, 30, 35);
//     }
// }