import java.util.Scanner;

public class SalonService {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Salon salon = new Salon();
        boolean flag = true;
        while (flag) {
            switch (getUserChoice()) {
                case 1:
                {
                  Salon s1= salon.getTypeOfService(getService(),getTimeOfService());
                    System.out.println(s1);
                }
                break;
                case 2:
                {
                    System.out.println("Bill Amount:"+salon.AmountAfterAllDiscount());
                }
                case 3:
                {
                    flag=false;
                }
            }
        }
    }
        private static int getService(){
            System.out.println("enter the service \n 1.HaircutLong \n 2.HairCutShort \n 3.Hair coloring \n 4.Hair straightening" +
                    "5.AntiOxidantFacial \n 6.AcneReductionFacial \n 7.SkinLighteningFacial ");
            int service= sc.nextInt();
            return service;
        }
        private static String getTimeOfService(){
            System.out.println("enter the service day: \n 1.WeekDays 2.WeekEnds");
            int serviceDays= sc.nextInt();
            if(serviceDays==1){
               return Salon.WEEKDAY;
            }
            return Salon.WEEKENDS;
        }
        public static int  getUserChoice(){
            System.out.println("enter the choice\n 1.Continue 2.Print Bill \n 3.exit");
            int choice = sc.nextInt();
            return choice;
        }
}
