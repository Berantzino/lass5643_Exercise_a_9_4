
public class SportUtilityVehicle extends Car {

    // Write a class SportUtilityVehicle that relates to the Car class from Self-Check Problems 9 and 10 and whose
    // methods have the following behavior. Whenever possible, use inheritance to reuse behavior from the superclasses.

    @Override
    public void m1() {
        System.out.println("SUV 1");
    }

    @Override
    public void m2() {
        super.m1();
    }

    @Override
    public String toString() {
        return "SUV " + super.toString();
    }
}
