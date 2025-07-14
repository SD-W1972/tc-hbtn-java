import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
    private ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie) {
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas() {
        int total = 0;
        for (PedidoCookie cookie : cookies) {
            total += cookie.getQuantidadeCaixas();
        }
        return total;
    }

    public int removerSabor(String sabor) {
        int totalRemovido = 0;
        Iterator<PedidoCookie> iterator = cookies.iterator();
        
        while (iterator.hasNext()) {
            PedidoCookie cookie = iterator.next();
            if (cookie.getSabor().equals(sabor)) {
                totalRemovido += cookie.getQuantidadeCaixas();
                iterator.remove();
            }
        }
        
        return totalRemovido;
    }
}