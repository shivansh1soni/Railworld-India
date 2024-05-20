public class SingleInheritance {
    public static void main(String[] args) {
        // Create an instance of Smartphone
        Smartphone mySmartphone = new Smartphone();

        // Use the inherited methods from BasicPhone
        mySmartphone.makeCall();
        mySmartphone.sendText();

        // Use the new method from Smartphone
        mySmartphone.takePhoto();
    }
}

// This is the superclass representing a basic mobile phone
class BasicPhone {
    // Method to make calls
    void makeCall() {
        System.out.println("Making a call...");
    }

    // Method to send text messages
    void sendText() {
        System.out.println("Sending a text...");
    }
}

// This is the subclass that extends BasicPhone, adding a new feature: a camera
class Smartphone extends BasicPhone {
    // Method to take a photo
    void takePhoto() {
        System.out.println("Taking a photo...");
    }
}

