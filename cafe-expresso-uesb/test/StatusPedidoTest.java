
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatusPedidoTest {

    @Test
    public void testFluxoDeStatus() {
        Pedido instance = new Pedido();
        
        // Verifica status inicial
        assertEquals(StatusPedido.PENDENTE, instance.getStatus());
        
        // Testa transição para PAGO
        instance.pagar();
        assertEquals(StatusPedido.PAGO, instance.getStatus());
        
        // Testa envio para cozinha
        instance.enviarParaCozinha();
        assertEquals(StatusPedido.EM_PREPARO, instance.getStatus());
    }
}