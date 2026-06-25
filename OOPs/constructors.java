public class constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Karan" );
        Student s3 = new Student(123);
        System.out.println(s2.name);
        //aap koi bhi object ko creat kar de or ush object ke creation ke hisab se jo bhi sutaible 
        //constructors hai oo call ho ja ye  :- constructor overLoading
        //You create any object and whatever constructors are available according to the creation of that object get called:- Constructor Overloading
    }
}

class Student{
    String name;
    int roll;
//Non-parameterized :

    Student(){
        System.out.println("karan");      
    }


//Parameterized :
    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}