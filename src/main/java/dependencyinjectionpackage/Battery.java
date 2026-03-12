package dependencyinjectionpackage;

public class Battery {
    void charging(){
        System.out.println("used for charging the mobile");
    }
}
 class Mobile{
    Battery battery;
    Mobile(Battery battery){
        this.battery= battery;
    }
    void work(){
        battery.charging();
        System.out.println("charged the mobile");
    }
    public static void main(String[] args){
         Mobile mobile= new Mobile(new Battery());
//        Battery battery= new Battery();
//        Mobile mobile= new Mobile(battery);
        mobile.work();
    }
 }
