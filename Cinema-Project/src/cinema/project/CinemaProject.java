
package cinema.project;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class CinemaProject {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
         ArrayList<Ticket> list=new ArrayList<>(); 
         Booking v=new Booking();
         
        char choice;
        do {            
            drawMenu();
            choice=Character.toUpperCase(input.next().charAt(0));
            switch(choice)
            {
                case 'A':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|------- Add New Booking --------|");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                   v.addNewBooking();
                   break;
                case 'D':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|-----    Delete Booking   ------|");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    v.deleteBookingBySopperName();
                    break;
                case 'U':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|- Update information of Booking -|");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                   v.updatAllShopperInfo();
                    break;
                case 'P':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|----- print all Bookings -------|");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    v.printAllBookings(list);
                    break;
                    case 'F':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|--- Find Bookings By Name ---|");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                   v.findByName();
                    break;
                    case 'S':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|- Resort Sort all Bookings By Name -|");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                   v.sortByName();
                    break;
                case 'E':
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|--- you ended The program ---|");
                    System.out.println(" |------  Thank You   -------|");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                default:
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|----- No Such Choice -------|");
                    System.out.println("|-------- Try Again ---------|");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
            }
        } 
        while (choice!='E');
    }

    public static void drawMenu() 
    {
        System.out.println(" What would you like to do : ");
        System.out.println("A - Add New Booking : ");
        System.out.println("D - Delete Booking By Name : ");
        System.out.println("U - Udpate A Booking : ");
        System.out.println("P - Print all Booking : ");
        System.out.println("F - Find Booking by name of client :");
        System.out.println("S - Sort Booking's By Name Shopper : ");
        System.out.println("E - To exit ");
        System.out.println(" Enter a choice : ");
    }
        
        
    }
    

