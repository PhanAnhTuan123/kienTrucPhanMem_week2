package vn.com.anhtuan.phananhtuan_21089921.factory;


import vn.com.anhtuan.phananhtuan_21089921.payment.CreditCardPayment;
import vn.com.anhtuan.phananhtuan_21089921.payment.Payment;

public class CreditCardFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
