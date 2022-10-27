import java.util.Scanner;
public class Bank{
    public void bankRate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How much Deposit Money");
        int mon = sc.nextInt();
        System.out.println("Your Depsit Time (3 or 6)");
        int timeOfDeposit = sc.nextInt();

        if(timeOfDeposit==3){
            System.out.println((mon*22)/100);
        }
        else if(timeOfDeposit==6){
            
            System.out.println((mon*21)/100);
        }
        else{
            System.out.println("Something when a wrong ");
        }
       


    }
}