package cinema.project;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class Booking {
   static Scanner input=new Scanner(System.in);
    private  ArrayList<Ticket> tickets;
    private static int numofTickets=0;
   

    public Booking() {
        tickets = new ArrayList<>();
    }

//   public void addNewBooking(int ticketId, String numberOfSeats, double price,Movie movie,Shopper shopper) {
//        Ticket t = new Ticket(ticketId, numberOfSeats, price,movie,shopper);
//        tickets.add(t);
//    }
   public  void addNewBooking() {
        Ticket g = new Ticket();
        System.out.println("ID Ticket is Added ");
        Random random1 = new Random();
        // Generate a random number between 100000 and 999999
        int randomIdnumber = random1.nextInt(99999) + 10000;
        // Print the random number
        g.setTicketld(randomIdnumber);
        System.out.println("Enter seat number in the format 'A1' or 'V1':");
        String l=input.next().toUpperCase();
        g.setSeatNumber(l);
        System.out.print("Enter ticket Price : ");
        double d=input.nextDouble();
        g.setTicketPrice(d);
        System.out.print("Enter the Title of Movie : ");
        Movie o=new Movie();
        input.nextLine();
        String title= input.next().toUpperCase();
        o.setTitle(title); 
        System.out.print("Enter Id of Hall :");
        int id=input.nextInt();
        o.setHallId(id);
        System.out.print("Enter The Movie time --> "+ "Enter one of this --> "+ " 1\t"+" 1.3\t"+" 2\t"+" 2.3\t"+" 3\t : ");
        double time=input.nextDouble();
        o.setTimeOfMovie(time);
        g.setMovie(new Movie(title, time,id));
        System.out.print("Enter Shooper Name : ");
        Shopper s=new Shopper();
        input.nextLine();
        String name=input.next().toUpperCase();
        s.setName(name);
        System.out.print("Enter Shooper phonenumber :");
        String number=input.nextLine();
        s.setPhoneNumber(number);
        g.setShopper(new Shopper(name, number));
        g.setMovie(o);
        g.setShopper(s);
        tickets.add(g);
        
        System.out.println("========= New booking is Added ========");
        numofTickets++;
    }
   public void printAllBookings(ArrayList <Ticket> list) {
        System.out.println("=======================================================");
        System.out.println("                    Cinema System                      ");
        System.out.println("=======================================================");
        Ticket.printTableHeader();
        for (int i = 0; i <tickets.size(); i++){
            tickets.get(i).printInformationAsRow();
        }
        System.out.println("=======================================================");
        System.out.println("=======================================================");
        System.out.println(numofTickets);
    }

    public  void deleteBookingBySopperName() {
        System.out.println("Enter Shopper Name do you want to delete his Booking ");
        input.nextLine();
        String s=input.nextLine();
        for (int i =0; i < tickets.size(); i++) {
            if (tickets.get(i).getShopper().getName().equalsIgnoreCase(s)) {
                tickets.remove(i);
                System.out.print("Booking is  deleted!!");
            }
        }
        numofTickets--;
        printAllBookings(tickets);
    }
    public void findByName()
    {
        System.out.println("Enter the Shopper Name ");
        String n=input.nextLine();
        boolean found=false;
        for (int i = 0; i <tickets.size(); i++) 
        {
            if(tickets.get(i).getShopper().getName().equalsIgnoreCase(n))
            {
                Ticket.printTableHeader();
                found=true;
                tickets.get(i).printInformationAsRow();
            }
        }
        if(found)
            System.out.println("------- The Shopper is Found   ---------");
        else
            System.out.println("------- The Shopper is Not Found  -------");
    }
     public void sortByName()
    {
        
        for (int i = 0; i <tickets.size() -1; i++) {
            for (int j = i+1; j <tickets.size(); j++) {
                if(tickets.get(i).getShopper().getName().compareToIgnoreCase(tickets.get(j).getShopper().getName())>0)
                {
                   Ticket temp = tickets.get(i);
                   tickets.set(i,tickets.get(j));
                   tickets.set(j, temp);
                }
            }
        }
        for (int i = 0; i <tickets.size(); i++) 
        {
            tickets.get(i).printInformationAsRow();
        }
                System.out.println("==================================");
                System.out.println("| The Shopper are Sorted By Name |");
                System.out.println("==================================");
    
    }
     public void updatAllShopperInfo()
    {
        System.out.println("Enter the Ticket ID that you want to update : ");
       
        int num=input.nextInt();
        
        Ticket m=new Ticket();
        
        boolean found=false;
        
        for (int i = 0; i <tickets.size(); i++) {
            if(tickets.get(i).getTicketId()==num) 
            { 
                found=true;
        tickets.remove(i);
        System.out.println("Enter seat number in the format 'A1' or 'V1':");
        m.setSeatNumber(input.next().toUpperCase());
        System.out.println("Enter the new Ticket Price : ");
        m.setTicketld(input.nextInt());
        System.out.println("Enter new title Movie : ");
        Movie o=new Movie();
        input.nextLine();
        o.setTitle(input.next().toUpperCase()); 
        System.out.println("Enter the new Time of  Movie : ");
        o.setTimeOfMovie(input.nextDouble());
        System.out.println("Enter new Hall Id");
        o.setHallId(input.nextInt());
        Shopper s=new Shopper();
        System.out.println("Enter new Shopper Name");
        input.nextLine();
        s.setName(input.next());
        System.out.println("Enter new shopper phone");
        m.setMovie(o);
        m.setShopper(s);
        tickets.add(m);
            }
           
        }
        if(found)
            System.out.println("~~~~~~~~~~ The Shopper Information are Updated  ~~~~~~~~~");
        else
            System.out.println("~~~~~~~~~~~   The Shopper isn't Found ~~~~~~~~~~~ ");
    }

 
    }

