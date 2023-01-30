class Movie{
    private string name;
    private int duration;
    private double rating;
    
    public void setDuration(int newDuration){ duration = newDuration};
    public void setName(String newName){ name = newName};
    public void setRating(String newRating){ rating = newRating};

    public int getDuration(){return duration};
    public String getName(){return name};
    public double getRating(){return rating};

    public static void main(String args[]){
        Movie RRR = new Movie();
        RRR.setDuration(120);
        RRR.setName("RRR");
        RRR.setRating(9.5);

        System.out.println(RRR.getDuration() + " "
        + RRR.getName() + " " + RRR.getRating());
    }

}

