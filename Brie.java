public class Brie extends Cheese{
    String shape;
    int slices;

    public Brie(){
        super();
        consistency = "soft";
        country = "France";
        shape = "round";
        slices = 8;
    }
    public Brie(String a, int d, int s, String sh, int sl){
        super(a, d, s, "soft", "France", "brie");
        shape = sh;
        slices = sl;
    }

    public String getShape(){
        return shape;
    }
    public int getSlices(){
        return slices;
    }

    public void setShape(String sh){
        shape = sh;
    }
    public void setSlices(int sl){
        slices = sl;
    }

    public void getConsumed(){
        if (slices >= 1){
            System.out.println("You have eaten 1 slice of brie");
            super.getConsumed();
            slices -= 1;
        }
        else{
            System.out.println("You have eaten all of the brie");
        }
    }

    public void cutMoreSlices(int s){
        if (slices > 0){
            slices += s;
        }
        else{
            System.out.println("Sorry, all of the brie is gone");
        }
    }

    public void spread(String food){
        if (slices >= 1){
            System.out.println("You have spread 1 slice of brie on " + food);
            super.getConsumed();
            slices -= 1;
        }
        else{
            System.out.println("You have eaten all of the brie");
        }
    }

    public void mold(String newShape){
        if (slices >= 1){
            System.out.println("You have spread molded the brie from a " + shape + " to a " + newShape);
            shape = newShape;
        }
        else{
            System.out.println("There is no brie left to mold");
        }
    }

    public boolean equals(Brie brie){
        if (super.equals(brie) && this.slices == brie.getSlices() && (this.shape).equals(brie.getConsistency())){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString(){
        if (!expired){
            return super.toString() + "\nThis brie is " + shape + " and has " + slices + " slices";
        }
        else{
            return super.toString();
        }
    }
}
