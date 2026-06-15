interface BicycleParts {
    int tyres = 2;
    int maxSpeed = 25;
}

interface BicycleOperations {
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations {

    public int gears;
    public int currentSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Speed after brake: " + currentSpeed);
    }

    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Speed after acceleration: " + currentSpeed);
    }

    public String bicycleDesc() {
        return "Gears: " + gears +
               "\nMax Speed Allowed: " + maxSpeed;
    }
}

class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int gears, int currentSpeed, int startHeight) {
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String bicycleDesc() {
        return super.bicycleDesc() +
               "\nSeat Height: " + seatHeight;
    }
}

public class Activity7 {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 0, 25);

        System.out.println(mb.bicycleDesc());

        mb.speedUp(20);
        mb.applyBrake(5);
    }
}