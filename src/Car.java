public class Car extends Vehicle {

    private String SeatingCapacity;

    public Car(String OwnerName, String Brand, String Model, int Year, String SeatingCapacity) {
        super(OwnerName, Brand, Model, Year);
        this.SeatingCapacity = SeatingCapacity;
    }

    public void SetSeatingCapacity(String SeatingCapacity) {
        this.SeatingCapacity = SeatingCapacity;
    }

    public String GetSeatingCapacity() {
        return SeatingCapacity;
    }

    public void displayinfo() {
        System.out.println(" Owner Name: " + GetOwnerName());
        System.out.println(" Brand : " + GetBrand());
        System.out.println(" Model : " + GetModel());
        System.out.println(" Year : " + GetYear());
        System.out.println(" SeatingCapacity: " + GetSeatingCapacity());
    }
    
}
