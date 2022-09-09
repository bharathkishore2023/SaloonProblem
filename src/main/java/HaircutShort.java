public class HaircutShort extends Salon{
    private double price=400;
    private double priceAfterDiscount;
    private final ServiceType type=ServiceType.NORMAL;

   @Override
   public double AmountAfterDiscount(){
        priceAfterDiscount= price*type.getType();
        return priceAfterDiscount;
    }
}
