package vn.com.anhtuan.phananhtuan_21089921.factory;

import vn.com.anhtuan.phananhtuan_21089921.payment.BankTransferPayment;
import vn.com.anhtuan.phananhtuan_21089921.payment.Payment;


public class BankTransferFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new BankTransferPayment();
    }
}
