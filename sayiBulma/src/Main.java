public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 7, 9, 0};
        int findNumber = 12;
        boolean hasGot=false;

        for (int i = 0; i < numbers.length; i++) {
            if (findNumber == numbers[i]) {
               hasGot=true;
            }
        }
        if (hasGot==true){
            System.out.println("Sayı mevcuttur");
        }
        else {
            System.out.println("Sayı mevcut değidir.");
        }
    }

}
