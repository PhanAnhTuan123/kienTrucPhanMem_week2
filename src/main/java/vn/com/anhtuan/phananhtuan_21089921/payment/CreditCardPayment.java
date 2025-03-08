package vn.com.anhtuan.phananhtuan_21089921.payment;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng thẻ tín dụng.");
    }
}
