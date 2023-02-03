class Movie{
    //Data members - should be private(Instance variables)
    private int duration;
    private String name;
    private double rating;

    //member functions - should be public(Behaviour or Member function or methods)
    public int getDuration(){ return duration; };
    public void setDuration(int duration){ this.duration = duration; };

    public String getName(){ return name; };
    public void setName(String name){ this.name = name; };

    public double getRatings(){ return rating; };
    public void setRatings(double rating){ this.rating = rating; };

}

class Encaptulation{
    public static void main(String args[]){
        Movie m = new Movie(); //object of movie class.

        //Error : cannot access privateproperties
        // m.duration = 180;
        // m.name = "abc";
        // m.rating = 5.0
        
        m.setDuration(180);
        m.setName("Drisham");
        m.setRatings(8.5);

        System.out.println(m.getDuration() + " " + m.getName() + " " + m.getRatings());


    }
}