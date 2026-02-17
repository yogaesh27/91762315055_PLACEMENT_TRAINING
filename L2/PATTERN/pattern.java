public class pattern {
    static void pattern1(){
         String[][] arr=new String[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               arr[i][j]="*";
            }
        }
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  
        }
    }
    static void pattern2(){
        
    }

    public static void main(String[] args) {
       pattern1();
    }
}