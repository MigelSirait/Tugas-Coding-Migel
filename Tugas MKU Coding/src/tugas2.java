import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int eventCount = 0;
        int oddCount = 0;

        System.out.println("Program menghitung bilangan genap dan ganjil.");
        System.out.println("Masukkan bilangan bulat positif (angka negatif untuk keluar): ");

        while (true) {
            int num = input.nextInt();

            if (num < 0) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            }

            if (num % 2 == 0) {
                eventCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Jumlah bilangan genap: " + eventCount);
        System.out.println("Jumlah bilangan ganjil: " + oddCount);
    }
}