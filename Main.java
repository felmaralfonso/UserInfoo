import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
        
    Scanner scn = new Scanner(System.in);
    int age;
    String firstname;
    String midinitial;
    String lastname;
    String birthday;
    String gender;
  
     //Get last name
     System.out.println("Last Name: "); 
     lastname = scn.nextLine(); 

    // Get first name
    System.out.println("First Name: "); 
    firstname = scn.nextLine();  
    
    // Get middle initial
    System.out.println("Middle Initial: "); 
    midinitial = scn.nextLine();  

  
    // Get gender
    System.out.println("Gender: ");
    gender = scn.nextLine(); 

    // Get birthday
    System.out.println("Birthday (MM/DD/YY): ");
    birthday = scn.nextLine();  

  
   // Get age
   System.out.println("Age: "); 
   age = scn.nextInt();  
     

    //Capitalize first letter of the word
    String FirstName = firstname.substring(0,1).toUpperCase() + firstname.substring(1);
    
    String MiddleInitial = midinitial.substring(0,1).toUpperCase();
    
    String LastName = lastname.substring(0,1).toUpperCase() + lastname.substring(1);

    String Gender = gender.substring(0,1).toUpperCase() + gender.substring(1);


    
    // Prints and organizes data
    System.out.println("\n"+"Last Name: "+ LastName + ",\n" + "First Name: " + FirstName + ",\n" +"Middle Initial: " + MiddleInitial
    + "." + "\n" +"Age: "+age + ".\n" +"Gender: " + Gender + ",\n" + "Birthday: " + birthday + ".");
    
    scn.close();

    }
    
   
    
}
