public class Dairy {
    String animal;
    boolean expired;
    int daysTillExpiration;
    String type;

    public Dairy(){
        animal = "cow";
        expired = false;
        daysTillExpiration = 31;
        type = "milk";
    }
    public Dairy(String a, int d, String t){
        animal = a;
        daysTillExpiration = d;
        type = t;
        if (daysTillExpiration < 0){
            expired = true;
        }
        else{
            expired = false;
        }
    }

    public String getAnimal(){
        return animal;
    }
    public boolean getExpired(){
        return expired;
    }
    public int getDaysTillExpiration(){
        return daysTillExpiration;
    }
    public String getType(){
        return type;
    }

    public void setAnimal(String a){
        animal = a;
    }
    public void setExpired(boolean e){
        expired = e;
    }
    public void setDaysTillExpiration(int d){
        daysTillExpiration = d;
    }
    public void setType(String t){
        type = t;
    }

    public void getConsumed(){
        System.out.println("This" + type + "has been consumed");
        animal = null;
        expired = false;
        daysTillExpiration = 0;
        type = null;
    }

    public void expire(){
        System.out.println("This " + type + " has expired");
        expired = true;
        daysTillExpiration = 0;
    }

    public void passADay(){
        daysTillExpiration -= 1;
        if (daysTillExpiration == 0){
            this.expire();
        }
    }

    public boolean equals(Dairy dairy){
        if ((this.getAnimal()).equals(dairy.getAnimal()) && (this.getExpired()) == (dairy.getExpired()) && (this.getDaysTillExpiration()) == (dairy.getDaysTillExpiration()) && (this.getType()).equals(dairy.getType())){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        if (!expired){
            return "This is some " + type + " from a " + animal + "\nThis is not expired but expires in " + daysTillExpiration + "days";
        }
        else{
            return "This is some " + type + " from a " + animal + "\nThis is expired DO NOT CONSUME";
        }
    }
}
