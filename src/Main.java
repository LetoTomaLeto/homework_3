public class Main {
    public static void main(String[] args) {
        int balance = 2365;
        int topUp = 500;
        int bonus;

        if (balance >= 1_000) {
            bonus = (balance + topUp) / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Пополните баланс на сумму более 1000 рублей: " + (balance) + " руб.");
        System.out.println("Получите бонус в размере 1 рубля за каждые полные 100 рублей: " + (bonus));
    }
}
