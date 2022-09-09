public class HairStraightening extends Salon{
    private double price=3500;
    private final ServiceType type=ServiceType.PREMIUM;
    private double priceAfterDiscount;
@Override
    public double AmountAfterDiscount(){
        priceAfterDiscount= price*type.getType();
        return priceAfterDiscount;
    }
}
