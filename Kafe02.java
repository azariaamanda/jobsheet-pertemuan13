import java.util.Scanner;
public class Kafe02 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
    
        System.out.println("Selamat datang, " + namaPelanggan+ "!");
    
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
    
        if (kodePromo.equalsIgnoreCase("DISKON50")){
            System.out.println("Selamat anda mendapatkan diskon sebesar 50%!");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")){
            System.out.println("Selamat anda mendapatkan diskon sebesar 30%!");
        } else{
            System.out.println("Kode Invalid!");
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
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);

        Menu("Andi", true, "DISKON50");
        // Menu("Salma", false, "DISKON30");
        // Menu("Titi", true, "INVALIDCODE");

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc2.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc2.nextInt();

        int totalHarga = hitungTotalHarga02(pilihanMenu, banyakItem);
        
        System.out.println("Total harga untuk pesanan anda: " + totalHarga);
    }
}
