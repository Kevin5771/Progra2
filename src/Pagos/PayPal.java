package Pagos;
import java.time.LocalDate;
import java.util.Random;

public class PayPal implements PayMethod{
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }



    private boolean approveTransaction() {
        // Simulación de la respuesta de aprobación de PayPal
        Random random = new Random();
        return random.nextBoolean(); // Aprobación aleatoria
    }

    @Override
    public void PaymentMethod(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("El monto debe ser mayor a 0.");
        }
        System.out.println("Procesando pago con PayPal de $" + amount);
        if (approveTransaction()) {
            System.out.println("Transacción de PayPal aprobada.");
        } else {
            throw new Exception("Transacción de PayPal denegada.");
        }
    }
}



