import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Carage carage = new Carage();
        Scanner scanner = new Scanner(System.in);

        int Chose = 0;
        do {

            System.out.println("______________________________________");
            System.out.println("[1] Add Car in Carage");
            System.out.println("[2] Update Car in Carage");
            System.out.println("[3] Remove Car in Carage");
            System.out.println("[4] Display car info in Carage");
            System.out.println("[5] Display all cars in Carage");
            System.out.println("______________________________________");
            Chose = scanner.nextInt();
            scanner.nextLine();

            switch (Chose) {

                case 1:
                    int ChoseVehicle = 0;
                    System.out.println("______________________________________");
                    System.out.println("[1] Car");
                    System.out.println("[2] Truck");
                    System.out.println("[3] Motor Cycle");
                    System.out.println("______________________________________");
                    ChoseVehicle = scanner.nextInt();
                    scanner.nextLine();

                    switch (ChoseVehicle) {
                        case 1:
                            System.out.println("Add Car Page");

                            System.out.println("Owner name");
                            String CarOwnerName = scanner.nextLine();

                            System.out.println("Brand");
                            String CarBrand = scanner.nextLine();

                            System.out.println("Model");
                            String CarModel = scanner.nextLine();

                            System.out.println("Year");
                            int CarYear = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Seating Capacity");
                            String CarSeatingCapacity = scanner.nextLine();

                            carage.AddVehicle(new Car(CarOwnerName, CarBrand, CarModel, CarYear, CarSeatingCapacity));
                            break;

                        case 2:
                            System.out.println("Add Truck Page");

                            System.out.println("Owner name");
                            String TruckOwnerName = scanner.nextLine();

                            System.out.println("Truck Brand");
                            String TruckBrand = scanner.nextLine();

                            System.out.println("Truck Model");
                            String TruckModel = scanner.nextLine();

                            System.out.println("Year");
                            int TruckYear = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Truck Cargo Capacity");
                            Double TruckCargoCapacity = scanner.nextDouble();
                            scanner.nextLine();

                            carage.AddVehicle(
                                    new Truck(TruckOwnerName, TruckBrand, TruckModel, TruckYear, TruckCargoCapacity));
                            break;

                        case 3:
                            System.out.println("Add Motor Cycle Page");

                            System.out.println("Motor Cycle Owner name");
                            String MotorCycleOwnerName = scanner.nextLine();

                            System.out.println("Motor Cycle Brand");
                            String MotorCycleBrand = scanner.nextLine();

                            System.out.println("Motor Cycle Model");
                            String MotorCycleModel = scanner.nextLine();

                            System.out.println("Motor Cycle Year");
                            int MotorCycleYear = scanner.nextInt();
                            scanner.nextLine();

                            System.out.println("Motor Cycle EngineSize");
                            int MotorCycleEngineSize = scanner.nextInt();
                            scanner.nextLine();

                            carage.AddVehicle(new MotorCycle(MotorCycleOwnerName, MotorCycleBrand, MotorCycleModel,
                                    MotorCycleYear, MotorCycleEngineSize));

                            break;
                        default:
                            System.out.println("Invalid input");
                            break;
                    }

                    break;

                case 2:
                    System.out.println("Update Page");

                    System.out.println("Enter Owner name");
                    String SearchName = scanner.nextLine();

                    System.out.println("Enter New owner ");
                    String NewOwner = scanner.nextLine();

                    System.out.println("Brand");
                    String Brand = scanner.nextLine();

                    System.out.println("Model");
                    String Model = scanner.nextLine();

                    System.out.println("Year");
                    int Year = scanner.nextInt();
                    scanner.nextLine();

                    carage.UpdateVehicle(NewOwner, Model, Brand, Year, SearchName);
                    break;

                case 3:
                    System.out.println("Remove Page");

                    System.out.println("Enter Owner name");
                    String NameToRemove = scanner.nextLine();
                    carage.RemoveVehicle(NameToRemove);
                    break;

                case 4:
                    System.out.println("All Cars in the carage");

                    carage.DisplayVehicle();
                    break;

                case 5:
                    System.out.println("Details Page");

                    System.out.println("Enter Owner name");
                    String NameToDisplayInfo = scanner.nextLine();
                    carage.DisplayVehicleDetails(NameToDisplayInfo);
                    break;

                case 0:
                    System.out.println("Remove Page");

                    System.out.println("Enter Owner name");

                    break;

                default:
                    System.out.println("Goodby my frind");
                    break;
            }
        } while (Chose != 0);
        scanner.close();
    }
}
