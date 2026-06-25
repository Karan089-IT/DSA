public class Basics {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1   ,Pen() -> contructor - special type of function in a class
        p1.setColor("Blue");
        p1.setColor(5);

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}
class Pen {
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color = newColor;
    }

    void setColor(int newTip){
        tip = newTip;
    }
}
