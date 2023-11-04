import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan tanggal lahir anda (hari-bulan): ");
        int day = input.nextInt();
        int month = input.nextInt();

        String zodiacSign = determineZodiacSign(day,month);

        System.out.println("Tanda zodiak anda adalah: " + zodiacSign);
    }

    public static String determineZodiacSign(int day, int month) {
        String zodiacSign = "";

        if ((month == 3 && day >= 21) || (month == 4 && day <= 22)) {
            zodiacSign = "Aries";
        } else if ((month == 4 && day >= 23) || (month == 5 && day <= 24)) {
            zodiacSign = "Taurus";
        } else if ((month == 5 && day >= 25) || (month == 6 && day <= 26)) {
            zodiacSign = "Gemini";
        } else if ((month == 6 && day >= 27) || (month == 7 && day <= 28)) {
            zodiacSign = "Cancer";
        } else if ((month == 7 && day >= 29) || (month == 8 && day <= 1)) {
            zodiacSign = "Leo";
        } else if ((month == 8 && day >= 2) || (month == 9 && day <= 4)) {
            zodiacSign = "Virgo";
        } else if ((month == 9 && day >= 5) || (month == 10 && day <= 8)) {
            zodiacSign = "Libra";
        } else if ((month == 10 && day >= 9) || (month == 11 && day <= 12)) {
            zodiacSign = "Scorpio";
        } else if ((month == 11 && day >= 13) || (month == 12 && day <= 14)) {
            zodiacSign = "Sagittarius";
        } else if ((month == 12 && day >= 15) || (month == 1 && day <= 16)) {
            zodiacSign = "Capricorn";
        } else if ((month == 1 && day >= 17) || (month == 2 && day <= 18)) {
            zodiacSign = "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            zodiacSign = "Pisces";
        }
        return zodiacSign;
    }
}