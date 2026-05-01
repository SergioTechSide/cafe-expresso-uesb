/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class ItemPedidoTest {
    
    public ItemPedidoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   /**
     * Teste do método calcularSubtotal, da classe ItemPedido.
     * Este teste verifica se o cálculo de preço x quantidade está correto.
     */
    @Test
    public void testCalcularSubtotal() {
        System.out.println("Executando: calcularSubtotal");
        
        // 1. Preparação (Cenário de Teste)
        Produto cafe = new Produto("Café Expresso", 5.0);
        ItemPedido instance = new ItemPedido(cafe, 3); // 3 cafés de 5.00
        
        double resultadoEsperado = 15.0; // 3 * 5 = 15
        
        // 2. Execução
        double resultadoObtido = instance.calcularSubtotal();
        
        // 3. Verificação (V&V)
        // O 0.01 é a margem de erro aceitável para casas decimais
        assertEquals(resultadoEsperado, resultadoObtido, 0.01);
    }

    /**
     * Teste do método getProduto.
     * Verifica se o item está guardando o produto corretamente.
     */
    @Test
    public void testGetProduto() {
        System.out.println("Executando: getProduto");
        
        Produto cafe = new Produto("Café Expresso", 5.0);
        ItemPedido instance = new ItemPedido(cafe, 1);
        
        assertEquals(cafe, instance.getProduto());
    }

    /**
     * Teste do método getQuantidade.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("Executando: getQuantidade");
        
        ItemPedido instance = new ItemPedido(new Produto("Chá", 3.0), 5);
        
        int resultadoEsperado = 5;
        assertEquals(resultadoEsperado, instance.getQuantidade());
    }
}
    