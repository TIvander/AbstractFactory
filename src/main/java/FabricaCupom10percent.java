public class FabricaCupom10percent implements FabricaAbstrata{
    @Override
    public Cupom10percent createCupom(){
        return new Cupom10percent();
    }
}
