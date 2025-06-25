class MovieTicket{
    String movieName;
    int seats;
    double ratePerTicket;

    MovieTicket(String movieName, int seats, double ratePerTicket){
        this.movieName = movieName;
        this.seats = seats;
        this.ratePerTicket = ratePerTicket;
    }

    public double calculateTotal(){
        double cost = seats * ratePerTicket;
        return cost;
    }

    public boolean isAvailable(int requestedSeats){

        if(seats < requestedSeats){
            return false;
        }
        else{
            return true;
        }
    }
}

class Main{
    public static void main(String[] args){

        MovieTicket mt = new MovieTicket("Avengers", 1 , 140.0);

        double cost = mt.calculateTotal();

        System.out.println("The Total is " + cost);

        if(mt.isAvailable(3)){
            System.out.println("The seat is available ");
        }
        else{
            System.out.println("The seat is not available ");
        }
        
    }
}