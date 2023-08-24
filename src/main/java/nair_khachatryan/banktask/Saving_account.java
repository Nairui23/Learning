package nair_khachatryan.banktask;

public class Saving_account implements Account {

     double initial_amountSaving;
     double interest_of_saving;
    public void deposit(){
        System.out.println(initial_amountSaving+ "Initial amount is deposited in the saving account");
    }
    public void withdraw(){
        System.out.println(initial_amountSaving+interest_of_saving +"Amount is withdraw from the Saving account");

    }
    public void calculate_interest(){
        interest_of_saving = initial_amountSaving *1.5;
        System.out.println("Interest calculated for this account is equal" + interest_of_saving);
    }
    public void view_balances(){
        System.out.println("The balance of the account is equal"+ (initial_amountSaving+interest_of_saving));

    }
}
