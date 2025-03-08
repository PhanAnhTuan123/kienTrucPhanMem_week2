package vn.com.anhtuan.phananhtuan_21089921.service;

import vn.com.anhtuan.phananhtuan_21089921.payment.Payment;
import vn.com.anhtuan.phananhtuan_21089921.service.PaymentService;

public class PaymentService {
    private static PaymentService instance;

    private PaymentService() {}  // Private constructor để ngăn việc khởi tạo bên ngoài

    public static PaymentService getInstance() {
        if (instance == null) {
            instance = new PaymentService();
        }
        return instance;
    }

    public void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }
}
