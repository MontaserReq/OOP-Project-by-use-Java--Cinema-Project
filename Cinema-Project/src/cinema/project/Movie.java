package cinema.project;

import java.util.Scanner;

class Movie {
    static Scanner input=new Scanner(System.in);
    private String title;
    private double timeOfMovie;
    private int hallId;

    public Movie() {
        
        this.title = "Fast and furious";
        this.timeOfMovie = 1.30;
        this.hallId = -1;
    }

    public Movie(String title, double timeOfMovie, int hallId) {
        setTitle(title);
        setTimeOfMovie(timeOfMovie);
        setHallId(hallId);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getTimeOfMovie() {
        return timeOfMovie;
    }

    public void setTimeOfMovie(double timeOfMovie) {
        // Check the timeMovie
        if (timeOfMovie == 1) {
            this.timeOfMovie=timeOfMovie;
        } else if (timeOfMovie == 1.3) {
            this.timeOfMovie=timeOfMovie;
        } else if (timeOfMovie == 2) {
            this.timeOfMovie=timeOfMovie;
        } else if (timeOfMovie == 2.3) {
            this.timeOfMovie=timeOfMovie;
        } else if (timeOfMovie == 3) {
            this.timeOfMovie=timeOfMovie;
        } else {
            System.out.println("The time is not valid Enter like as ( 1 / 1.3 / 2.0 / 2.3 /3.0 )");
        }
         while (true) {
        try {
         
            
            if (timeOfMovie == 1 || timeOfMovie == 1.3 || timeOfMovie == 2 || timeOfMovie == 2.3 || timeOfMovie == 3) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid movie length.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid movie length.");
            input.nextLine(); 
            
        }
    }
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        if(hallId > 0 && hallId < 10)
        this.hallId = hallId;
        else
            this.hallId=-1;
    }

    @Override
    public String toString() {
        return "Movie [ title=" + title + ", timeOfMovie=" + timeOfMovie + ", hallId=" + hallId + " ] ";
    }
}

