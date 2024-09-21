package Pagos;
import java.time.LocalDate;
import java.util.Random;

public class CryptoPay implements PayMethod{
    @Override
    public void PaymentMethod(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("El monto debe ser mayor a 0");
        }
        System.out.println("Procesando pago con criptomonedas de $" + amount);
    }
}
