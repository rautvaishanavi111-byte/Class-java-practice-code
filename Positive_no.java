import java.util.Scanner;
public class positive_no {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<=10;i++){
            System.out.println("enter the number:");
            int number = sc.nextInt();
            if(number<=0){
                continue;
            }
            
        }
        sc.close();
    }
    
}
