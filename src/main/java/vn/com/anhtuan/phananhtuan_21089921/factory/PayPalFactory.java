package vn.com.anhtuan.phananhtuan_21089921.factory;


import vn.com.anhtuan.phananhtuan_21089921.payment.PayPalPayment;
import vn.com.anhtuan.phananhtuan_21089921.payment.Payment;

public class PayPalFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}
