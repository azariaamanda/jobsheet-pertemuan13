import java.util.Scanner;
public class Kubus02 {
    
    static int hitungVolume(int s){
        int volume = s*s*s;
        return volume;
    }

    static int hitungLuasPermukaan(int s){
        int luas = 6*s*s;
        return luas;
    }

    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int s, volume, luas;

        System.out.print("Masukkan panjang sisi kubus: ");
        s = sc2.nextInt();

        volume = hitungVolume(s);
        System.out.println("Volume kubus adalah " + volume);

        luas = hitungLuasPermukaan(s);
        System.out.println("Luas Permukaan kubus adalah " + luas);
    }
}
