import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemum = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tullips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        int flowertCount = chrysanthemum + roses + tullips;
        double chrysanthemumPrice = 0;
        double rosesPrice = 0;
        double tullipsPrice = 0;
        if (season.equals("Spring") || season.equals("Summer")) {
            chrysanthemumPrice = 2.00 * chrysanthemum;
            rosesPrice = 4.10 * roses;
            tullipsPrice = 2.50 * tullips;
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            chrysanthemumPrice = 3.75 * chrysanthemum;
            rosesPrice = 4.50 * roses;
            tullipsPrice = 4.15 * tullips;
        }

        double totalPrice = chrysanthemumPrice + rosesPrice + tullipsPrice;

        if (holiday.equals("Y")) {
            totalPrice = totalPrice + totalPrice * 0.15;
        }  if (tullips > 7 && season.equals("Spring")) {
            totalPrice = totalPrice - totalPrice * 0.05;
        }  if (roses >= 10 && season.equals("Winter")) {
            totalPrice = totalPrice - totalPrice * 0.10;
        }  if (flowertCount > 20) {
            totalPrice = totalPrice - totalPrice * 0.20;
        }

        System.out.printf("%.2f", totalPrice + 2);
    }
}
