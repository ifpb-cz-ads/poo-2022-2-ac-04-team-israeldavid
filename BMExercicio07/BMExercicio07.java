public class BMExercicio07
{
    public static void main(String[] args){
        
        int x = 13;
        int y = 0;
        while(y!=1){
        if(x%2==0){
            y=x/2;
            System.out.print("=>" + y);
        }else{
        y = 3*x+1;
        System.out.print("=>" + y);
        }
        x=y;
        }
    }
}
