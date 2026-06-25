public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "karan";
        s1.roll = 90;
        s1.password = "abcd";
        s1.marks[0]=100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;

        for(int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

/* 
//Shallow Copy Constructor
    //Shallow Copy :- Copies reference, not actual object data
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks; //not copy all the array ,only reference copy hota hai  :- Shallow copy
    }
*/

//Deep copy constructor    
    //Deep Copy:- Copies actual data, creates new object, Separate memory, changes don't reflect
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i =0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];

        }
    }

    Student(){
        marks = new int[3];
        System.out.println("constructor is called...");      
    }

    
}
