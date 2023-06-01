import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade %: ");

        int n = scan.nextInt();
        System.out.println(n);

        if (n >= 75 && n <= 100){
        System.out.println("A");

        } else if(n >= 70 && n <= 75){
        System.out.println("B");
        
        } else if(n >= 60 && n <= 70){
        System.out.println("C");
            
        }else if(n >= 50 && n <= 60){
        System.out.println("D");
                
        }else if(n >= 0 && n <= 50){
        System.out.println("F");
                    
        }


        scan.close();
    }
}