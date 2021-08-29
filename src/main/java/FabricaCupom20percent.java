public class FabricaCupom20percent implements FabricaAbstrata{
    @Override
    public Cupom20percent createCupom(){
        return new Cupom20percent();
    }
}
