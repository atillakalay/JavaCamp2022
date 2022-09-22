public class Main {
    public static void main(String[] args) {
        SayiBulmaca();
    }

    public static void SayiBulmaca() {
        int[] numbers = {1, 2, 5, 7, 9, 0};
        int findNumber = 12;
        boolean hasGot = false;

        for (int i = 0; i < numbers.length; i++) {
            if (findNumber == numbers[i]) {
                hasGot = true;
            }
        }
        if (hasGot == true) {
            mesajVer("Sayı mevcuttur: " + findNumber);
        } else {
            mesajVer("Sayı mevcuttur: " + findNumber);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
