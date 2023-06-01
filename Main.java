import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade %: ");

        //scans int input from user
        int num = scan.nextInt();

        if (num >= 75 && num <= 100){
        System.out.println("A");

        } else if(num >= 70 && num <= 75){
        System.out.println("B");
        
        } else if(num >= 60 && num <= 70){
        System.out.println("C");
            
        }else if(num >= 50 && num <= 60){
        System.out.println("D");
                
        }else if(num >= 0 && num <= 50){
        System.out.println("F");
                    
        }


        scan.close();
    }
}