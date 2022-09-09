import java.util.HashMap;

public class Salon {
    HashMap<Integer,Salon>typesOfService=new HashMap<>();

    public static String WEEKDAY="Weekday";
    public static String WEEKENDS="Weekends";
    public String timeOfService;
    private double overAllAmountToBePaid=0;
    public Salon getTypeOfService(int service, String timeOfService) {
        typesOfService.put(service,new HairCutLong());
        typesOfService.put(service,new HaircutShort());
        typesOfService.put(service,new HairColoring());
        typesOfService.put(service,new HairStraightening());
        typesOfService.put(service,new AntiOxidantFacial());
        typesOfService.put(service,new AcneReductionFacial());
        typesOfService.put(service,new SkinLighteningFacial());
        this.timeOfService=timeOfService;
        overAllAmountToBePaid+=typesOfService.get(service).AmountAfterDiscount();
        System.out.println(overAllAmountToBePaid);
        return typesOfService.get(service);
    }


    public double AmountAfterDiscount() {
        return 0;
    }

    public double AmountAfterAllDiscount(){
    /*    if(overAllAmountToBePaid>=1500 && typesOfService.equals(WEEKDAY)){
            return (overAllAmountToBePaid*(0.1));
    }
        if(overAllAmountToBePaid>=1500 && typesOfService.equals(WEEKENDS))
        {
           return overAllAmountToBePaid*0.05;
        }*/
        return overAllAmountToBePaid;
        }
}
