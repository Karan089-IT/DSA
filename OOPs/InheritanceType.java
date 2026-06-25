public class InheritanceType {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   
  //    d.walk();
        d.bark();  

        Cat c = new Cat();
        c.eat();   
        c.meow();

    }
}

/* 
//single level Inheritance 
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}
    */

/* 
//Multi level
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Walking...");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Barking...");
    }
}
*/



//Hierarchial 
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}