package vn.com.anhtuan.phananhtuan_21089921.payment;

public class PayPalPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " thông qua cổng thanh toán PAYPAL.");
    }
}
