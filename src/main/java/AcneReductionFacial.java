public class AcneReductionFacial extends Salon{
    private double price=800;
    private final ServiceType type=ServiceType.NORMAL;
    private double priceAfterDiscount;
    @Override
    public double AmountAfterDiscount(){
        priceAfterDiscount= price*type.getType();
        return priceAfterDiscount;
    }
}
