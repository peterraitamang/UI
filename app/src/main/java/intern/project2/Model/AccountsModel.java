package intern.project2.Model;

import java.util.ArrayList;

public class AccountsModel {
    private String amount, bankAccountName;

    public String getAmount() {
        return amount;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public AccountsModel(String amount, String bankAccountName) {
        this.amount = amount;
        this.bankAccountName = bankAccountName;
    }
    public static ArrayList<AccountsModel> getList(){
        ArrayList<AccountsModel> list = new ArrayList<>();
        list.add(new AccountsModel("$5000","City Bank Account"));
        list.add(new AccountsModel("$6000","Brac Bank Account"));
        list.add(new AccountsModel("$7000","Exim Bank Account"));
        list.add(new AccountsModel("$2000","Brac Bank Account"));
        list.add(new AccountsModel("$5000","Exim Bank Account"));
        list.add(new AccountsModel("10000","City Bank Account"));
        return list;
    }
}
