import java.util.Scanner;
public class PenjualanCafe02 {
    
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        
        int [][] rekapPenjualan = new int [5][7];
        String [] menuCafe = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        
        System.out.println("--- Input Data Penjualan 5 Menu ---");
        
        for (int i=0; i < rekapPenjualan.length; i++){
            System.out.println("Data Penjualan Menu " + menuCafe[i]);
            for (int j=0; j < rekapPenjualan[i].length; j++){
                System.out.print("Masukkan penjualan hari ke-" + (j+1) + ": ");
                rekapPenjualan[i][j] = sc2.nextInt();
            }
        }
        sc2.nextLine();

        System.out.println("\n========================== Rekapitulasi Data Penjualan ==========================");
        tampilanDataPenjualan(rekapPenjualan, menuCafe);
        
        System.out.println("\n===========================  Menu Penjualan Tertinggi ===========================");
        String menuTerbanyak = menuPenjualanTerbanyak(rekapPenjualan, menuCafe);
        System.out.println("Menu dengan penjualan tertinggi tersebut adalah: " + menuTerbanyak);

        System.out.println("\n============================== Rata-Rata Penjualan ==============================");
        rata2Penjualan(rekapPenjualan, menuCafe);
        
    }
    static void tampilanDataPenjualan(int[][] rekapPenjualan, String[] menuCafe) {
        //tabel
        System.out.printf("%-15s", "Menu");
        for (int hari = 1; hari <= 7; hari++) {
            System.out.printf("%-10s", "Hari " + hari);
        }
        System.out.println();
        //input angka penjualan
        for (int i = 0; i < rekapPenjualan.length; i++) {
            System.out.printf("%-15s", menuCafe[i]);
            for (int j = 0; j < rekapPenjualan[i].length; j++) {
                System.out.printf("%-10d", rekapPenjualan[i][j]);
            }
            System.out.println();
        }
    }
    static String menuPenjualanTerbanyak(int[][] penjualan, String[] menuCafe) {
        String menuTerbanyak = "";
        int totalPenjualanTertinggi = 0;
    
        for (int i = 0; i < penjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > totalPenjualanTertinggi) {
                totalPenjualanTertinggi = totalPenjualan;
                menuTerbanyak = menuCafe[i];
            }
        }
        System.out.println("Total penjualan tertinggi sebanyak : " + totalPenjualanTertinggi);
        return menuTerbanyak;
    }
    static void rata2Penjualan(int[][] rekapPenjualan, String[] menuCafe) {
        for (int i = 0; i < rekapPenjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < rekapPenjualan[i].length; j++) {
                totalPenjualan += rekapPenjualan[i][j];
            }
            double rataRata = totalPenjualan / 7;
            System.out.println("Rata rata penjualan " + menuCafe[i] + ": " + rataRata);
        }
    }
}