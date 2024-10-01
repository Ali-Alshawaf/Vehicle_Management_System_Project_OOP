public class MotorCycle extends Vehicle {

    private int EngineSize;

    public MotorCycle(String OwnerName, String Brand, String Model, int Year, int EngineSize) {
        super(OwnerName, Brand, Model, Year);
        this.EngineSize = EngineSize;
    }

    public void SetEngineSize(int EngineSize) {
        this.EngineSize = EngineSize;
    }

    public int GetEngineSize() {
        return EngineSize;
    }

    public void displayinfo() {
        System.out.println(" Owner Name: " + GetOwnerName());
        System.out.println(" Brand : " + GetBrand());
        System.out.println(" Model : " + GetModel());
        System.out.println(" Year : " + GetYear());
        System.out.println("The Engine size: " + GetEngineSize());
    }

}
