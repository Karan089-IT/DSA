// Class - bluePrint of an object
// Interfaces - bluePrint of a class

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.veg();
        b.nonVeg();
    }
}

interface ChessPlayer {
   void moves();
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, right, left");
    }
}

class King implements ChessPlayer {
    public void moves(){
        System.out.println("up, down, right, left, diadonal (by 1-step)");
    }
}


//Multiple inheritance
interface Herbivore{
    void veg();
}

interface Carnivore{
    void nonVeg();
}

class Bear implements Herbivore, Carnivore{
    public void veg(){
        System.out.println("Bear eats plants");
    }

    public void nonVeg(){
        System.out.println("Bear eats meat");
    }
} 