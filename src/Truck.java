public class Truck extends Vehicle {

    private Double CargoCapacity;

    public Truck(String OwnerName, String Brand, String Model, int Year, Double CargoCapacity) {
        super(OwnerName, Brand, Model, Year);
        this.CargoCapacity = CargoCapacity;
    }

    public void SetCargoCapacity(Double CargoCapacity) {
        this.CargoCapacity = CargoCapacity;
    }

    public Double GetCargoCapacity() {
        return CargoCapacity;
    }

    public void displayinfo() {
        System.out.println(" Owner Name: " + GetOwnerName());
        System.out.println(" Brand : " + GetBrand());
        System.out.println(" Model : " + GetModel());
        System.out.println(" Year : " + GetYear());
        System.out.println("The Cargo Capacity : " + GetCargoCapacity());

    }

}
