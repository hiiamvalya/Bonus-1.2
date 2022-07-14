public class Main {
    public static void main(String args[]) {

        int amount = 100;
        int balans = 100;
        int bonus;

        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int total = amount + balans + bonus;

        System.out.println("Общий баланс счета составляет " + total + " рублей. Бонус: " + bonus + " рублей. ");
    }
}