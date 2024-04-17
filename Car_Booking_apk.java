import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
    private String model;
    private boolean available;

    public Car(String model) {
        this.model = model;
        this.available = true;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class CarRentalSystem {
    private List<Car> cars;

    public CarRentalSystem() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota Corolla"));
        cars.add(new Car("Honda Civic"));
        cars.add(new Car("Nissan Altima"));
    }

    public void displayAvailableCars() {
        System.out.println("Available Cars:");
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car.getModel());
            }
        }
    }

    public void bookCar(String model) {
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && car.isAvailable()) {
                car.setAvailable(false);
                System.out.println("Car " + model + " booked successfully!");
                return;
            }
        }
        System.out.println("Car " + model + " is not available for booking.");
    }
}

public class Car_Booking_apk {
    public static void main(String[] args) {
        CarRentalSystem rentalSystem = new CarRentalSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nCar Rental System Menu:");
            System.out.println("1. Display Available Cars");
            System.out.println("2. Book a Car");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    rentalSystem.displayAvailableCars();
                    break;
                case 2:
                    System.out.print("Enter car model to book: ");
                    scanner.nextLine(); // Consume newline
                    String model = scanner.nextLine();
                    rentalSystem.bookCar(model);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        scanner.close();
    }
}
