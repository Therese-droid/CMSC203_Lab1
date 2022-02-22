
public class Movie{
    //the given private variables
    private String title;
    private String rating;
    private int soldTickets;
    public Movie(){
        title = "";
        rating = "";
        soldTickets = 0;
    }
    //instantiates the object as a copy of an already existing object
    public Movie(Movie m){
        title = m.title;
        rating = m.rating;
        soldTickets = m.soldTickets;
    }
    public Movie(String title, String rating, int soldTickets){
        this.title = title;
        this.rating = rating;
        this.soldTickets = soldTickets;
    }
    //this function returns the "title" of the "Movie" object
     public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getRating(){
        return rating;
    }
    //this function sets the "rating" of the "Movie" object aaccording to the argument received
    public void setRating(String rating){
        this.rating = rating;
    }

    //this function returns the value of "soldTickets"(number of tickets sold) of the "Movie" object
    public int getSoldTickets(){
        return soldTickets;
    }
    //this function sets the "soldTickets" of the "Movie" object according to the argument received
    public void setSoldTickets(int soldTickets){
        this.soldTickets = soldTickets;
    }

    //this function returns a concatenated string of the "title", "rating" and "soldTickets" of the "Movie" object
    public String toString(){
        return (this.title + "(" + this.rating + "): Tickets Sold: " + this.soldTickets);
    }
}