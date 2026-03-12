package dependencypackage;

public class Battery {
    void charging(){
        System.out.println("batter used for charging");
    }
}
class Mobile{
    Battery battery= new Battery();
    void work(){
        battery.charging();
        System.out.println("charging the mobile");
    }

    public static void main(String[] args){
        Mobile m= new Mobile();
        m.work();
    }

}
