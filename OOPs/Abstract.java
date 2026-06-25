public class Abstract {
    public static void main(String[] args) {
    //     Horse h = new  Horse();
    //     h.eat();
    //     h.walk();
    //     System.out.println(h.color);
        
    //     Chicken c = new Chicken();
    //     c.eat();
    //     c.walk();
    //     System.out.println(c.color);
    
    Mustang myHorse = new Mustang();
    //Animal -> Horse -> Mustang

    }
}


abstract class Animal {
    String color;

    Animal(){
        color = "brown";
        System.out.println("animal constructor called");
    }
    void eat(){    // non-abstract method
        System.out.println("Animal eats");
    }

    abstract void walk();    //Abstract methods (no body/ no implementation)
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){
        color = "drak brown";
    }

    void walk(){
        System.out.println("walk on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor called");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "white";
    }

    void walk(){
        System.out.println("walk on 2 legs");
    }
}