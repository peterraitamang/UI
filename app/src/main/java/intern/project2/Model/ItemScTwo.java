package intern.project2.Model;

import java.util.ArrayList;

public class ItemScTwo {
    private String amount, bankName;

    public String getAmount() {
        return amount;
    }

    public String getBankName() {
        return bankName;
    }

    public ItemScTwo(String amount, String bankName) {
        this.amount = amount;
        this.bankName = bankName;
    }
    public static ArrayList<ItemScTwo> getItems(){
        ArrayList<ItemScTwo> items = new ArrayList<>();
        items.add(new ItemScTwo("$5000","City Bank Ltd."));
        items.add(new ItemScTwo("$6000","Brac Bank Ltd."));
        items.add(new ItemScTwo("$7000","Exim Bank Ltd."));
        items.add(new ItemScTwo("$8000","Trust Bank Ltd."));
        return items;
    }
}
