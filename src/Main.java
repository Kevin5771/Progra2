import Pagos.PayMethod;
import java.time.LocalDate;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        double amount = 100.0;

        // Validación y procesamiento de pago con tarjeta de crédito
        PayMethod.processPayment processor = new Pago.PaymentProcessor(new Pago.CreditCardPayment(
                "1234567812345678", LocalDate.of(2025, 12, 31), 123));
        processor.Paymentrocess(amount);  // Pago con tarjeta de crédito

        // Procesamiento de transferencia bancaria
        processor.setPaymentMethod(new Pago.BankTransferPayment());
        processor.process(amount);  // Pago con transferencia bancaria y confirmación

        // Procesamiento de PayPal con simulación de aprobación
        processor.setPaymentMethod(new Pago.PayPalPayment("user@example.com", "password"));
        processor.process(amount);  // Pago con PayPal (aprobado o denegado)

        // Procesamiento de criptomonedas
        processor.setPaymentMethod(new Pago.CryptoPayment());
        processor.process(amount);  // Pago con criptomonedas
    }
    }
