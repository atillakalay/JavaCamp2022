public class Main {
    public static void main(String[] args) {
     int toplam=   topla(5, 7);
     System.out.println(toplam);

        int toplam2=   topla2(5, 7,8,9,10);
        System.out.println(toplam2);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    public static String mesajVer(String mesaj) {
        mesaj = "Hello World";
        return mesaj;
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi :sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

}