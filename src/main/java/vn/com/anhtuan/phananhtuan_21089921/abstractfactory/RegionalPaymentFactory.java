package vn.com.anhtuan.phananhtuan_21089921.abstractfactory;


import vn.com.anhtuan.phananhtuan_21089921.factory.PaymentFactory;

public abstract class RegionalPaymentFactory {
    public abstract PaymentFactory getCreditCardFactory();
    public abstract PaymentFactory getPayPalFactory();
    public abstract PaymentFactory getBankTransferFactory();
}
