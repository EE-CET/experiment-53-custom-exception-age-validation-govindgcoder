import java.util.Scanner;

// Create class InvalidAgeException extends Exception
// Create a constructor that accepts a message string and passes it to super(message)

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
}

public class CustomException {
    
    // Create a static method validate(int age) that throws InvalidAgeException
    // Check if age < 18, throw new InvalidAgeException("Not eligible to vote")
    public static void validate(int age) throws InvalidAgeException {
        if(age<18) throw new InvalidAgeException("Not eligible to vote");
    }
    // Else print "Eligible to vote"
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            validate(age);
            System.out.print("Eligible to vote");
        } catch (InvalidAgeException e){
            System.out.print("Exception: "+e.getMessage());
        }
    }
    
        // TODO: Read age
        
}
