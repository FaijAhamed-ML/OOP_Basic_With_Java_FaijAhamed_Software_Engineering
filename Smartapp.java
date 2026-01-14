class smartphone {
    private String brand;
    private Battery battery;
    private Processor processor;

    public smartphone(String brand, Battery battery, Processor processor){
        this.brand = brand;
        this.battery =battery;
        this.processor = processor;

    }
    public void displaySmartphoneDetails(){
        System.out.println("Smartphone Brand: "+brand);
        battery.displayBatteryDetails();
        processor.displayProcessorDetails();
    }    
}

class Battery{
    private int capacity;

    public Battery(int capacity){
        this.capacity = capacity;
    }

    public void displayBatteryDetails(){
        System.out.println("Battery capacity: "+capacity+"mAh");
    }

}

class Processor{
    private String model;

    public Processor(String model){
        this.model = model;
    }

    public void displayProcessorDetails(){
        System.out.println("Processor Model: "+model);
    }
}

public class Smartapp {
    public static void main(String[] args) {
        Battery battery = new Battery(5000);
        Processor processor = new Processor("Snapdragon 888");
        smartphone phone = new smartphone("Samsung Galaxy", battery, processor);
        phone.displaySmartphoneDetails();
    }
}

