package cinema.project;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
        

public class Ticket {
    static Scanner input = new Scanner(System.in);
    private int ticketId;
    private String seatNumber;
    private double ticketPrice;
    private Movie movie;
    private Shopper shopper;
   

    public Ticket() {
        this.ticketId = -1;
        this.seatNumber = "0O";
        this.ticketPrice = 5;
        this.movie = new Movie();
        this.shopper = new Shopper();
    }

    public Ticket(int ticketId, String seatNumber, double ticketPrice, Movie movie, Shopper shopper) {
//        this.ticketId = ticketId;
//        this.seatNumber = seatNumber;
//        this.ticketPrice = ticketPrice;
        setTicketld(ticketId);
        setSeatNumber(seatNumber);
        setTicketPrice(ticketPrice);
        this.movie = movie;
        this.shopper = shopper;
    }
        public Ticket(int ticketId, String seatNumber, double ticketPrice, String title,double timeOfMovie,String name,String phoneNumber) {
//        this.ticketId = ticketId;
//        this.seatNumber = seatNumber;
//        this.ticketPrice = ticketPrice;
        setTicketld(ticketId);
        setSeatNumber(seatNumber);
        setTicketPrice(ticketPrice);
        this.movie = new Movie();
        this.shopper = new Shopper();
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketld(int ticketId) {
//        Random random = new Random();
//        int randomNumber = random.nextInt(999999) + 100000;
//
//        // Check if the random number is divisible by 5
//        if (randomNumber % 5 == 0) {
//                    this.ticketId = randomNumber;
//        } else {
//                    this.ticketId =-1;
//        }
        this.ticketId=ticketId;
  }

    public String getSeatNumber() {
        return seatNumber;
    }



    public void setSeatNumber( String seatNumber) {
           if (seatNumber == null || seatNumber.length() != 2) {
            System.out.println("Invalid input. Please enter the seat number in the format 'A1' or 'V1'.");
            return;
        }

        char seatType = seatNumber.charAt(0);
        int seatNumberValue;

        if (!(seatType == 'V' || seatType == 'A')) {
            System.out.println("Invalid seat type. Please enter either V or A.");
            return;
        }

        try {
            seatNumberValue = Integer.parseInt(seatNumber.substring(1));
        } catch (NumberFormatException e) {
            System.out.println("Invalid seat number. Please enter a valid number.");
            return;
        }

        if (seatType == 'V' && (seatNumberValue < 1 || seatNumberValue > 15)) {
            System.out.println("Invalid seat number value for V. Please enter a number between 1 and 15.");
            return;
        }

        if (seatType == 'A' && (seatNumberValue < 1 || seatNumberValue > 20)) {
            System.out.println("Invalid seat number value for A. Please enter a number between 1 and 20.");
            return;
        }

        this.seatNumber = seatNumber;
    
    }
            
        
    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        if (ticketPrice>0) 
                this.ticketPrice = ticketPrice;
        else
        this.ticketPrice = -1;
    }
    
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Shopper getShopper() {
        return shopper;
    }

    public void setShopper(Shopper shopper) {
        this.shopper = shopper;
    }

    
    public static void printTableHeader()
{
    System.out.printf("%-20s%-25s%-20s%-20s%-20s%-20s%-20s%n"
            , "Ticket Id","Seat Number"
            ,"Title of movie"," Time Of Movie","Id of hall"
            ,"Name Shopper","phoneNumber of shopper");  
}
    public void printInformationAsRow()
{
    System.out.printf("%-20d%-25s%-20s%-20s%-20d%-20s%-20s%n"
            ,ticketId,seatNumber
            ,getMovie().getTitle(),getMovie().getTimeOfMovie(),getMovie().getHallId()
            ,getShopper().getName(),getShopper().getPhoneNumber());
}

}