// The base class for all properties
class Property {
    String address;
    double squareFeet;

    // Constructor
    Property(String address, double squareFeet) {
        this.address = address;
        this.squareFeet = squareFeet;
    }

    // Method to display basic property information
    void display() {
        System.out.println("Address: " + address);
        System.out.println("Square Feet: " + squareFeet);
    }
}

// Derived class for Residential properties
class Residential extends Property {
    int bedrooms;
    int bathrooms;

    // Constructor
    Residential(String address, double squareFeet, int bedrooms, int bathrooms) {
        super(address, squareFeet); // Call to base class constructor
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    // Overriding display method to include bedrooms and bathrooms
    void display() {
        super.display(); // Call base class method
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Bathrooms: " + bathrooms);
    }
}

// Derived class for Commercial properties
class Commercial extends Property {
    String leaseType;
    String businessType;

    // Constructor
    Commercial(String address, double squareFeet, String leaseType, String businessType) {
        super(address, squareFeet); // Call to base class constructor
        this.leaseType = leaseType;
        this.businessType = businessType;
    }

    // Overriding display method to include leaseType and businessType
    void display() {
        super.display(); // Call base class method
        System.out.println("Lease Type: " + leaseType);
        System.out.println("Business Type: " + businessType);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Residential residentialProperty = new Residential("123 Maple St", 1500.0, 3, 2);
        Commercial commercialProperty = new Commercial("456 Oak St", 3000.0, "Triple Net", "Retail");

        System.out.println("Residential Property Details:");
        residentialProperty.display(); // Display details of the residential property

        System.out.println("\nCommercial Property Details:");
        commercialProperty.display(); // Display details of the commercial property
    }
}
