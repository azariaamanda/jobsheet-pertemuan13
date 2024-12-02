import java.util.Scanner;
public class Percobaan602 {
    // public static void main(String[] args) {
    //     Scanner sc2 = new Scanner(System.in);

    //     int p,l,t,L,vol;

    //     System.out.print("Masukkan panjang: ");
    //     p=sc2.nextInt();
    //     System.out.print("Masukkan lebar: ");
    //     l=sc2.nextInt();
    //     System.out.print("Masukkan tinggi: ");
    //     t=sc2.nextInt();

    //     L=p*l;
    //     System.out.println("Luas persegi panjang adalah " + L);

    //     vol=p*l*t;
    //     System.out.println("Volume balok adalah " + vol);
    // }

    static int hitungluas (int pjg, int lb){
        int Luas = pjg*lb;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b){
        int volume = hitungluas(a, b) * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        int p,l,t,L,vol;
        System.out.print("Masukkan panjang: ");
        p=sc2.nextInt();
        System.out.print("Masukkan lebar: ");
        l=sc2.nextInt();
        System.out.print("Masukkan tinggi: ");
        t=sc2.nextInt();

        L=hitungluas(p,l);
        System.out.println("Luas persegi panjang adalah " + L);
    
        vol=hitungVolume(t,p,l);
        System.out.println("Volume balok adalah " + vol);
    }
}
