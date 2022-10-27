import java.util.Scanner;
public class InfiniteCal{

    static void cal(){
        for(int i =0;i<=0;i++){
            Scanner sc =new Scanner(System.in);
            System.out.print("Type your First Number ");
            int num1 = sc.nextInt();
            System.out.print("Type your Second Number ");
            int num2 = sc.nextInt();
            double num3 = (double)(num1+num2); // use casting
            System.out.print(num3+"\n");
        }

    }
    public static void main(String [] args){
        cal(); // create static method infront

    }
}