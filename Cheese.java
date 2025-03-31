//Delia Spiegelman
public class Cheese extends Dairy{
    int saltinessPercentage;
    String consistency;
    String country;
    String typeOfCheese;

    public Cheese(){
        type = "cheese";
        saltinessPercentage = 20;
        consistency = "hard";
        country = "France";
        typeOfCheese = "cheddar";
    }
    public Cheese(String a, int d, int s, String con, String c, String t){
        super(a, d, "cheese");
        saltinessPercentage = s;
        consistency = con;
        country = c;
        typeOfCheese = t;
    }

    public int getSaltinessPercentage(){
        return saltinessPercentage;
    }
    public String getConsistency(){
        return consistency;
    }
    public String getCountry(){
        return country;
    }
    public String getTypeOfCheese(){
        return typeOfCheese;
    }

    public void setSaltinessPercentage(int s){
        saltinessPercentage = s;
    }
    public void setConsistency(String con){
        consistency = con;
    }
    public void setCountry(String c){
        country = c;
    }
    public void setTypeOfCheese(String t){
        typeOfCheese = t;
    }

    public void getConsumed(){
        super.getConsumed();
        if (saltinessPercentage > 20){
            System.out.println("You thought it was a bit salty and the consistency was very " + consistency);
        }
        else{
            System.out.println("You enjoyed the saltiness and the consistency was very " + consistency);
        }
    }

    public void addSalt(){
        if (saltinessPercentage <= 90){
            saltinessPercentage += 10;
        }
        else{
            System.out.println("Sorry, the salt percentage is too high to add any more salt");
        }
    }

    public void getGrated(){
        if ((consistency.toLowerCase()).equals("hard")){
            System.out.println("This cheese has now been grated");
            consistency = "grated";
        }
        else{
            System.out.println("Sorry this cheese is not the right consistency");
        }
    }

    public boolean equals(Cheese cheese){
        if (super.equals(cheese) && this.saltinessPercentage == cheese.getSaltinessPercentage() && (this.consistency).equals(cheese.getConsistency()) && (this.country).equals(cheese.getCountry())){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        if (!expired){
            return super.toString() + "\nAlso, this cheese is " + typeOfCheese + " and has a salt percentage of " + saltinessPercentage + "%, a " + consistency + " consistency, and comes from " + country;
        }
        else{
            return super.toString();
        }
    }
}
