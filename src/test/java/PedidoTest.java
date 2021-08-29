import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    @Test
    void emiteCupom10percent(){
        FabricaAbstrata fabrica = new FabricaCupom10percent();
        Pedido pedido = new Pedido(fabrica);

        assertEquals("Cupom de 10% aplicado!", pedido.emitirPedido());
    }
    @Test
    void emiteCupom20percent(){
        FabricaAbstrata fabrica = new FabricaCupom20percent();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Cupom de 20% aplicado!", pedido.emitirPedido());
    }
}