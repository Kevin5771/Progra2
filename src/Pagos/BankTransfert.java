package Pagos;

public class BankTransfert implements PayMethod{
    @Override
    public void PaymentMethod(double amount)throws Exception {
        if (amount <= 0) {
            throw new Exception("El monto debe ser mayor a 0");
        }
        System.out.println("Procesando transferencia bancaria de $" + amount);
        confirmTransfer();
    }

    private void confirmTransfer() {
        System.out.println("Transferencia bancaria confirmada.");
    }
}
