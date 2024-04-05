// // Define the PaymentProcessor interface with a method to process payments
// public interface PaymentProcessor {
//     void processPayment(double amount);

//     void cancelPayment(String cancel);
// }

// // Implement the PaymentProcessor interface with a CreditCardProcessor class
// public class CreditCardProcessor implements PaymentProcessor {
//     public void processPayment(double amount) {
//         System.out.println("Processing credit card payment of $" + amount);
//     }
// }

// // Use the PaymentProcessor interface in the PaymentService class
// public class PaymentService {
//     private PaymentProcessor paymentProcessor;

//     private PaymentProcessor cancelPayment;

//     public PaymentService(PaymentProcessor paymentProcessor) {
//         this.paymentProcessor = paymentProcessor;
//     }
    
//     public cancelPayment (PaymentProcessor cancelPayment){
//         this.cancelPayment=cancelPayment;
//     }
    
//     public void makePayment(double amount) {
//         paymentProcessor.processPayment(amount);
//     }
//     public void cancelPayment(String cancel){
//         cancelPayment.cancelPayment(cancel);
//     }
// }

// // Main class to run the example
// public class Main {
//     public static void main(String[] args) {
//         PaymentProcessor processor = new CreditCardProcessor();
//         PaymentService service = new PaymentService(processor);
        
//         service.makePayment(100.0);
//     }
// }





































// A simple class that represents a message sending service
public class MessageSender {
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
}

// The NotificationService class that depends on MessageSender
public class NotificationService {
    private MessageSender messageSender;

    // Constructor injection of the MessageSender dependency
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void notifyUser(String message) {
        this.messageSender.sendMessage(message);
    }
}

// Main class to demonstrate dependency injection
public class Main {
    public static void main(String[] args) {
        // Creating a MessageSender instance
        MessageSender sender = new MessageSender();
        
        // Injecting the MessageSender into NotificationService
        NotificationService service = new NotificationService(sender);
        
        // Using the NotificationService
        service.notifyUser("Hello, DI without polymorphism!");
    }
}
