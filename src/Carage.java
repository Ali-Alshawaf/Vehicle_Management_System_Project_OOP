public class Carage {

    private Vehicle[] vehicles;
    private int Count;

    public Carage() {
        this.vehicles = new Vehicle[100];
        this.Count = 0;
    }

    public void AddVehicle(Vehicle vehicle) {
        if (Count < vehicles.length) {
            vehicles[Count] = vehicle;
            Count++;
            System.out.println("Add Successfuly");
        } else {
            System.out.println("The Carage is Full");
        }
    }

    public void RemoveVehicle(String Name) {
        boolean state = false;
        for (int i = 0; i < Count; i++) {
            if (vehicles[i].GetOwnerName().equalsIgnoreCase(Name)) {
                vehicles[i] = vehicles[Count - 1];
                vehicles[Count - 1] = null;
                Count--;
                state = true;
                System.out.println("Remove it Successfuly");
                break;
            }
        }
        if (state == false) {
            System.out.println("There is no Name by this: " + Name);
        }
    }

    public void UpdateVehicle(String NewOwner, String Model, String Brand, int Year, String SearchName) {
        boolean state = false;
        for (int i = 0; i < Count; i++) {
            if (vehicles[i].GetOwnerName().equalsIgnoreCase(SearchName)) {
                vehicles[i].SetOwnerName(NewOwner);
                vehicles[i].SetBrand(Brand);
                vehicles[i].SetModel(Model);
                vehicles[i].SetYear(Year);
                state = true;
                System.out.println("Update it Successfuly");
                break;
            }
        }
        if (state == false) {
            System.out.println("There is no Name by this: " + SearchName);
        }
    }

    public void DisplayVehicle() {
        if (Count == 0) {
            System.out.println("The Carage is empty");
        } else {
            for (int i = 0; i < Count; i++) {
                System.out.println(i);
                vehicles[i].displayinfo();
                System.out.println();
            }
        }
    }

    public void DisplayVehicleDetails(String SearchName) {
        boolean state = false;
        for (int i = 0; i < Count; i++) {
            if (vehicles[i].GetOwnerName().equalsIgnoreCase(SearchName)) {
                vehicles[i].displayinfo();
                System.out.println();
                state = true;
                break;
            }
        }
        if (state == false) {
            System.out.println("There is no Name by this: " + SearchName);
        }
    }

}
