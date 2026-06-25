public class HollowRect {
/*     public static void main(String[] args) {
        int totRows = 4;
        int totCols = 5;

        //Outer loop - rows
        for(int i = 1; i <= totRows; i++){
            //inner - columns
            for(int j = 1; j <= totCols; j++){
                //cell - (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    // boundary cells
                    System.out.print('*');
                } else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }  */




        //by functions/Methods

        public static void hollow_rect(int totRows, int totCols){
            //Outer loop - rows
        for(int i = 1; i <= totRows; i++){
            //inner - columns
            for(int j = 1; j <= totCols; j++){
                //cell - (i,j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    // boundary cells
                    System.out.print('*');
                } else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rect(5, 5);
    }
}
