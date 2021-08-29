public class Pedido {
    private Cupom desconto;

    public Pedido(FabricaAbstrata fabrica){
        this.desconto = fabrica.createCupom();
    }

    public String emitirPedido(){
        return  this.desconto.emitir();
    }
}
