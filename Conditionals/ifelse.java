
public class ifelse {
    public static void main(String[] args) {
        int age = 17;
        if(age >= 18){
            System.out.println("Adult: vote, drive");
        }
        if(age > 13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not adult");
        }
    }
}
