public abstract class Vehicle {
    
    private String OwnerName;
    private String Brand;
    private String Model;
    private int Year;

    public Vehicle(String OwnerName, String Brand, String Model, int Year) {
        this.OwnerName = OwnerName;
        this.Brand = Brand;
        this.Model = Model;
        this.Year = Year;
    }

    public void SetOwnerName(String Name) {
        this.OwnerName = Name;
    }

    public String GetOwnerName() {
        return OwnerName;
    }

    public void SetBrand(String Name) {
        this.Brand = Name;
    }

    public String GetBrand() {
        return Brand;
    }

    public void SetModel(String Name) {
        this.Model = Name;
    }

    public String GetModel() {
        return Model;
    }

    public void SetYear(int Year) {
        this.Year = Year;
    }

    public int GetYear() {
        return Year;
    }

    public abstract void displayinfo();

}
