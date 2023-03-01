package intern.project2.Model;

import java.util.ArrayList;

public class Item {
    private String itemProfileImg, itemName, itemStatus, itemAmount, itemDate;

    public String getItemProfileImg() {
        return itemProfileImg;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public String getItemAmount() {
        return itemAmount;
    }

    public String getItemDate() {
        return itemDate;
    }

    public Item(String itemProfileImg, String itemName, String itemStatus, String itemAmount, String itemDate) {
        this.itemProfileImg = itemProfileImg;
        this.itemName = itemName;
        this.itemStatus = itemStatus;
        this.itemAmount = itemAmount;
        this.itemDate = itemDate;
    }

    public static ArrayList<Item> getItems(){
        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("C","The City bank Limited","Trasfer to bank - Completed"
                ,"-$ 4000","Jan 20"));
        items.add(new Item("B","Brac Bank Limited","Trasfer to bank - Completed"
                ,"+$ 9500","Feb 14"));
        items.add(new Item("E","The City bank Limited","Trasfer to bank - Completed"
                ,"+$ 3500","Feb 18"));
        items.add(new Item("T","The City bank Limited","Trasfer to bank - Completed"
                ,"-$ 5000","Feb 22"));
        items.add(new Item("L","Brac Bank Limited","Transfer to Wallet - Completed"
                ,"+5000","Feb 01"));
        return items;

    }
}
