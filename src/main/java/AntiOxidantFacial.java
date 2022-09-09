public class AntiOxidantFacial extends Salon{
    private double price=600;
    private final ServiceType type=ServiceType.NORMAL;
@Override
    public double AmountAfterDiscount(){
        double priceAfterDiscount = price-(price*type.getType());
    System.out.println(priceAfterDiscount);
        return priceAfterDiscount;
    }
    @Override
    public String toString() {
        return "AntiOxidant{}";
    }
}
