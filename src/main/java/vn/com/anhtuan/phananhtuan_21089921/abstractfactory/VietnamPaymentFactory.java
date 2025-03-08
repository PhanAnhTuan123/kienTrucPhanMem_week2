package vn.com.anhtuan.phananhtuan_21089921.abstractfactory;


import vn.com.anhtuan.phananhtuan_21089921.factory.BankTransferFactory;
import vn.com.anhtuan.phananhtuan_21089921.factory.CreditCardFactory;
import vn.com.anhtuan.phananhtuan_21089921.factory.PayPalFactory;
import vn.com.anhtuan.phananhtuan_21089921.factory.PaymentFactory;

/*
    * Cu the o khu vuc Vietnam
 */
public class VietnamPaymentFactory extends RegionalPaymentFactory{
    @Override
    public PaymentFactory getCreditCardFactory() {
        return new CreditCardFactory();
    }

    @Override
    public PaymentFactory getPayPalFactory() {
        return new PayPalFactory();
    }

    @Override
    public PaymentFactory getBankTransferFactory() {
        return new BankTransferFactory() {
        };
    }
}
