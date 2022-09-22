public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("------------------------------------------------------------------");

        String ortaMetin = "İlginizi çekebilir!";
        String altMetin = "Vade süresi";

        System.out.println(altMetin + " " + ortaMetin);

        int vade = 12;
        double dolarDun = 18.10;
        double dolarBugun = 18.10;

        if (dolarBugun < dolarDun) {
            System.out.println("Dolar düştü!");
        } else if (dolarBugun == dolarDun) {
            System.out.println("Dolar eşit!");
        } else {
            System.out.println("Dolar arttı!");
        }

        System.out.println("------------------------------------------------------------------");

        String[] krediler = { "Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli" };
        for (String kredi : krediler) {
            System.out.println(kredi);
        }

    }

}