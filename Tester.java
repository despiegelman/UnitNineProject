public class Tester{
    public static void main (String[] args){
        Cheese dairy = new Cheese();
        Cheese dairy2 = new Cheese("cow", 31, 30, "soft", "England", "munster");
        System.out.println(dairy.equals(dairy2));
        System.out.println(dairy2);
    }
}
