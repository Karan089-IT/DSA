// Polymorphism :- i) Compile time(Method OverLoading) / Static
//                 ii) Rum time (Method Overriding)  / Dynamic


public class Polymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.sum(2, 3));       
        System.out.println(c.sum(2, 3, 4));    
        System.out.println(c.sum(2.5, 3.5));
        
        Deer d = new Deer();
        d.eat();
    }
    
}

//Method OverLoading :- Multiple functions with the same name but different parameters
class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a, double b) {
        return a + b;
    }
}



//Method Overriding :- parent and child classes both contain the same function with a different definition
class Animal{
    void eat(){
        System.out.println("eats anythings");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}

