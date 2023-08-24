package nair_khachatryan.banktask;

public class Current_account implements Account {
    double initial_amount;
    double interest;
    public void deposit(){
        System.out.println(initial_amount+ "Initial amount is deposited");
    }
    public void withdraw(){
        System.out.println(initial_amount+interest +"Amount is withdraw from the account");
    }
    public void calculate_interest(){
        interest = initial_amount*1.1;
        System.out.println("Interest calculated for this account is equal" + interest);
    }
    public void view_balances(){
        System.out.println("The balance of the account is equal"+ (initial_amount+interest));

    }
}
