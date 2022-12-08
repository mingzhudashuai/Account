import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Account ac=new Account();
        System.out.println("Your account name is"+ac.getName()+"\nPlease enter a new name for you:");
        String name=sc.nextLine();
        ac.setName(name);
        System.out.println();
        System.out.printf("Your new account name is:\n"+ac.getName());
    }
}
