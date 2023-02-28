package intern.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import intern.project2.Model.Item;
import intern.project2.Model.ItemScTwo;
import intern.project2.adapter.CustomListAdapter;

public class ScreenFiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_five);
        populateUsersList();
    }

    private void populateUsersList() {
        ArrayList<Item> items = Item.getItems();
        CustomListAdapter adapter = new CustomListAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.screenFive_listView);
        listView.setAdapter(adapter);
    }
}