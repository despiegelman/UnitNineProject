//Delia Spiegelman
import java.util.ArrayList;
public class Tester{
    public static void main (String[] args){
        ArrayList<Dairy> dairyShelf = new ArrayList<Dairy>();
        Dairy dairy = new Dairy();
        Cheese dairy2 = new Cheese("cow", 31, 30, "soft", "England", "munster");
        Brie dairy3 = new Brie();
        Dairy someCheese = new Cheese();
        Dairy moreCheese = someCheese;
        Dairy someBrie = new Brie("Goat", 20, 10, "round", 10);
        Dairy moreBrie = someBrie;
        Cheese someMoreBrie = new Brie();
        Cheese evenMoreBrie = someMoreBrie;
        Brie moonCheese = new Brie("cow", 31, 40, "square", 3);
        dairyShelf.add(dairy);
        dairyShelf.add(dairy2);
        dairyShelf.add(dairy3);
        dairyShelf.add(someCheese);
        dairyShelf.add(moreCheese);
        dairyShelf.add(someBrie);
        dairyShelf.add(moreBrie);
        dairyShelf.add(someMoreBrie);
        dairyShelf.add(evenMoreBrie);
        dairyShelf.add(moonCheese);
    }
}
