package infrastructure;


import java.util.HashMap;
import java.util.Map;


import domain.Pedido;


public class PedidoRepository {


    private final Map<String, Pedido> pedidos = new HashMap<>();


    public void salvar(Pedido pedido) {
        if(pedidos.containsKey(pedido.getId())){
            System.out.println("Pedido já registrado!");
        }else{
            pedidos.put(pedido.getId(), pedido);
        }
    }


    public Pedido buscarPorId(String id) {
        if(pedidos.get(id) == null){
            System.out.println("Pedido de ID " + id + " não existe!");
        }

        return pedidos.get(id);
    }
}