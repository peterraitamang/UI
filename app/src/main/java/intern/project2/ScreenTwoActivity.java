package intern.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import intern.project2.Model.Item;
import intern.project2.adapter.CustomListAdapter;
import intern.project2.databinding.ActivityScreenFourBinding;
import intern.project2.databinding.ActivityScreenTwoBinding;

public class ScreenTwoActivity extends AppCompatActivity {

    ActivityScreenTwoBinding b;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityScreenTwoBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        popuateUsersList();
    }


    private void popuateUsersList() {

        ArrayList<Item> items = Item.getItems();
        CustomListAdapter adapter = new CustomListAdapter(this, items);

        ListView listView = (ListView) findViewById(R.id.screenTwo_listView);
        listView.setAdapter(adapter);

    }
}