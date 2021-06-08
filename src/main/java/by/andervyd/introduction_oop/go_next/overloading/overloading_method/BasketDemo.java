package by.andervyd.introduction_oop.go_next.overloading.overloading_method;

public class BasketDemo {
    public static void main(String[] args) {

        Basket basketBob = new Basket();
        Basket basketBobB = new Basket();
        Basket basketLee = new Basket();
        Basket basketMay = new Basket();

        basketBob.pay(1200);
        // >> Paid in cash 1200.0

        double moneyWitBonus = basketBobB.pay(1200, 100);
        System.out.println("Money with bonus: " + moneyWitBonus);
        // >> Paid in cash 1200.0 plus bonus 100.0
        //    Money with bonus: 1300.0

        basketLee.pay("0234 1234 5432 6311");
        // >> Paid by credit card #0234 1234 5432 6311

        basketMay.pay("3FF52315D", "5563");
        // >> Transfer to account #3FF52315D to bank 5563
    }
}
