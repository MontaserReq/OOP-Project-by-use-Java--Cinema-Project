package cinema.project;
public class Shopper {
    private String name;
    private String phoneNumber;

    public Shopper() {
        this.name = "Mohammad" ;
        this.phoneNumber = "07#*******" ;
    }

    public Shopper(String name, String phoneNumber) {
        setName(name);
        setPhoneNumber(phoneNumber);
    }

    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
   public void setPhoneNumber(String phoneNumber) {
      String myString = "0712345678";

    try {
        // Check if the string is 10 characters long
        if (myString.length() == 10) {

            // Check if the first character is 07
            if (myString.charAt(0) == '0' && myString.charAt(1) == '7') {

                // The string is valid
                System.out.println("The string is valid");
                this.phoneNumber = phoneNumber;
            }
            else {

                // The string is invalid
                System.out.println("The string is unvalid");
                this.phoneNumber = "07#1234567";
            }
        }
        else {
            // The string is not 10 characters long
            System.out.println("The string is not 10 characters long");
        }
    } catch (NullPointerException e) {
        System.out.println("Error: " + e.getMessage());
    }
   }


   
}
