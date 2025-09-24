  class TooYoungException extends RuntimeException {
        public TooYoungException(String message) {
            super(message);
        }
    }
class TooOldException extends RuntimeException {
        public TooOldException(String message) {
            super(message);
        }
    }

public class BootcampEnrollment {
    public void enroll(int age) {
        if (age < 15) {
            throw new TooYoungException("Age is too young to enroll in the bootcamp.");
        } else if (age > 50) {
            throw new TooOldException("Age is too old to enroll in the bootcamp.");
        } else {
            System.out.println("Enrollment successful for age: " + age);
        }
    }
    
    public static void enroll(String name, int age) throws TooYoungException, TooOldException {
        BootcampEnrollment enrollment = new BootcampEnrollment();
        try {
            enrollment.enroll(10);
        } catch (TooYoungException | TooOldException e) {
            System.out.println("Enrollment error: " + e.getMessage());
        }
        
        try {
            enrollment.enroll(55);
        } catch (TooYoungException | TooOldException e) {
            System.out.println("Enrollment error: " + e.getMessage());
        }
        
        enrollment.enroll(25); // Successful enrollment
    }
    public static void main(String[] args) {
        enroll("Alice", 10);
    }
}
