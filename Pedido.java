import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;
    private StatusPedido status;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.status = StatusPedido.PENDENTE;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        this.itens.add(new ItemPedido(produto, quantidade));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void pagar() {
        this.status = StatusPedido.PAGO;
    }

    public void enviarParaCozinha() {
        if (this.status == StatusPedido.PAGO) {
            this.status = StatusPedido.EM_PREPARO;
        } else {
            System.out.println("Erro: O pedido precisa estar PAGO antes de ir para a cozinha.");
        }
    }

    public void finalizarPedido() {
        this.status = StatusPedido.FINALIZADO;
    }

    public StatusPedido getStatus() { return status; }
    public List<ItemPedido> getItens() { return itens; }
}
