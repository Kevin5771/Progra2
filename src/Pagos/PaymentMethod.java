package Pagos;

public interface PaymentMethod {
    void processPayment(double amount) throws Exception;
}
