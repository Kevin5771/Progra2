package Pagos;
import java.time.LocalDate;
import java.util.Random;

public class PaymentProcessor {
    private PayMethod payMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.payMethod = (PayMethod) paymentMethod;
    }

    // Cambia el método de pago dinámicamente
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        if (paymentMethod == null) {
            throw new IllegalArgumentException("Método de pago no puede ser nulo");
        }
        this.payMethod = (PayMethod) paymentMethod;
    }

    // Procesa el pago con el método seleccionado
    public void process(double amount) {
        try {
            payMethod.PaymentMethod(amount);
        } catch (Exception e) {
            System.out.println("Error al procesar el pago: " + e.getMessage());
        }
    }
}
