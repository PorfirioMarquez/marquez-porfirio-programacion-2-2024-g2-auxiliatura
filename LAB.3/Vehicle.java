public class Vehicle {
    private String brand;
    private String model;
    private double price;
    //constructor
    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    //metodos
    public void start() {
        System.out.println(brand + " " + model + " is starting.");
    }

    public void stop() {
        System.out.println(brand + " " + model + " is stopping.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
public class ElectricVehicle extends Vehicle {
    private double batteryCapacity;
    //herencia y sobre escritura 
    public ElectricVehicle(String brand, String model, double price, double batteryCapacity) {
        super(brand, model, price);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
//llama al constructor  de la super clase
private int range;

public ElectricVehicle(String brand, String model, double price, double batteryCapacity, int range) {
    super(brand, model, price);
    this.batteryCapacity = batteryCapacity;
    this.range = range;
}

public void displayRange() {
    System.out.println("Range: " + range + " km");
}
//prueba de clase
public class Main {
    public static void main(String[] args) {
        ElectricVehicle myEV = new ElectricVehicle estring("Tesla", "Model 3", 50000, 75, 500);
        myEV.start();
        myEV.displayInfo();
        myEV.displayRange();
        myEV.stop();
    }
}