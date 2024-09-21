package Pagos;

public class Tarjeta implements Pago{
    @Override
    public void pagar() {
        System.out.println("Pago realizado con exito");
    }
}
