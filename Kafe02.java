import java.util.Scanner;
public class Kafe02 {

    public static void Menu(String namaPelanggan, boolean isMember) {
    
        System.out.println("Selamat datang, " + namaPelanggan+ "!");
    
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }        
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.");
    }
    
    public static int hitungTotalHarga02 (int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static int diskon(int hargaTotal, String kodePromo) {
        
        if (kodePromo.equalsIgnoreCase("DISKON50")){
            hargaTotal *= 0.5;
            System.out.println("Selamat anda mendapatkan diskon sebesar 50%!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")){
            hargaTotal *= 0.7;
            System.out.println("Selamat anda mendapatkan diskon sebesar 30%!");
        } else {
            System.out.println("Kode Invalid!");
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        Menu("Andi", false);
        
        
        System.out.print("\nBerapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenisMenu = sc2.nextInt();

        int totalHarga = 0;
        
        for (int i = 1; i <= jumlahJenisMenu; i++) {
            System.out.println("Pesanan ke-" + i + ":");
            System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc2.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc2.nextInt();
            
            totalHarga += hitungTotalHarga02(pilihanMenu, banyakItem);
        }
        System.out.print("\nMasukkan kode promo (atau tekan Enter jika tidak ada): ");
        sc2.nextLine(); 
        String kodePromo = sc2.nextLine();

        int diskon = diskon(totalHarga, kodePromo);
        int totalSemua = totalHarga - diskon;
        
        System.out.println("================================================================");
        System.out.println("Total sebelum diskon: " + totalHarga);
        System.out.println("Total harga untuk pesanan anda: " + totalSemua);
    }
}
