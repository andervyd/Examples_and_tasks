package by.andervyd.introduction_oop.go_next.overloading.overloading_method;

public class Basket {

    void pay(double money) {
        System.out.println("Paid in cash " + money);
    }

    double pay(double money, double bonus) {
        System.out.println("Paid in cash " + money + " plus bonus " + bonus);
        return money + bonus;
    }

    void pay(String cardName) {
        System.out.println("Paid by credit card #" + cardName);
    }

    void pay(String accountNum, String bankCode) {
        System.out.println("Transfer to account #" + accountNum + " to bank " + bankCode);
    }
}
