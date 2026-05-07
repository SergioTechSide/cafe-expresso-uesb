
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    public void testCalcularTotal() {
        // Preparação do cenário (V&V)
        Produto cafe = new Produto("Café Expresso", 5.0);
        Produto pão = new Produto("Pão de Queijo", 4.50);
        
        Pedido instance = new Pedido();
        instance.adicionarItem(cafe, 2); // 10.0
        instance.adicionarItem(pão, 2);  // 9.0
        
        double expResult = 19.0;
        double result = instance.calcularTotal();
        
        // Verificação do resultado
        assertEquals(expResult, result, 0.01);
    }
}