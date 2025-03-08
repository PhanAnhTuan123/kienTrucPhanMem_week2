package vn.com.anhtuan.phananhtuan_21089921.payment;

public class BankTransferPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng hình thức chuyển khoản.");
    }
}
