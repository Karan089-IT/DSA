
// Arrays as function arguments
//concept - call/pass by reference

public class functionArgument {

    public static void update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {88, 89, 90};
        int nonChangable = 5;
        update(marks, nonChangable);
        System.out.println(nonChangable);

        //print our marks
        for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    
}
