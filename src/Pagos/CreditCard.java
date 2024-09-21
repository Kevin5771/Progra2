package Pagos;
import java.time.LocalDate;
import java.util.Random;

public class CreditCard implements PayMethod{
    private String cardNumber;
    private LocalDate expirationDate;
    private int cvv;

    public CreditCard(String cardNumber, LocalDate expirationDate, int cvv) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }


    private boolean validateCard() {
        return validateCardNumber() && validateExpirationDate() && validateCVV();
    }

    private boolean validateCardNumber() {
        return cardNumber != null && cardNumber.length() == 16 && cardNumber.matches("\\d+");
    }

    private boolean validateExpirationDate() {
        return expirationDate.isAfter(LocalDate.now());
    }

    private boolean validateCVV() {
        return String.valueOf(cvv).length() == 3;
    }

    @Override
    public void PaymentMethod(double amount) throws Exception {
        if (!validateCard()) {
            throw new Exception("La tarjeta de crédito no es válida.");
        }
        System.out.println("Procesando pago con tarjeta de crédito de $" + amount);
    }
}
