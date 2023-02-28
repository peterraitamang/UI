package intern.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import intern.project2.Model.Item;
import intern.project2.adapter.CustomListAdapter;

public class ScreenTwoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_two);
        popuateUsersList();
    }

    private void popuateUsersList() {

        ArrayList<Item> items = Item.getItems();
        CustomListAdapter adapter = new CustomListAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.screenTwo_listView);
        listView.setAdapter(adapter);

    }
}