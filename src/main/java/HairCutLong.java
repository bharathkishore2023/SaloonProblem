public class HairCutLong extends Salon{
    private double price=200;
    private final ServiceType type=ServiceType.NORMAL;
    private double priceAfterDiscount;
    @Override
    public double AmountAfterDiscount(){
        priceAfterDiscount= price-(price*type.getType());
        System.out.println(priceAfterDiscount);
        return priceAfterDiscount;
    }

    @Override
    public String toString() {
        return "HairCutLong{}";
    }
}
