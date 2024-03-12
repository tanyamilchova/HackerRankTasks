package OOP2.Vehicles;

public class VehicleWithPedals {
     protected void function(){
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.\n" +
                "My ancestor is a cycle who is a vehicle with pedals.");
    }
    static class MotorCycle extends VehicleWithPedals{
        MotorCycle(){
            super.function();
        }


    }
    public static void main(String[] args) {
        MotorCycle motorcycle=new MotorCycle();
    }
}
