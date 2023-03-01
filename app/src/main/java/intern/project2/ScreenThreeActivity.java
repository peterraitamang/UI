package intern.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

import intern.project2.Model.Item;
import intern.project2.Model.ItemScTwo;
import intern.project2.adapter.CustomListAdapter;
import intern.project2.adapter.CustomScTwoAdapter;
import intern.project2.databinding.ActivityScreenThreeBinding;

public class ScreenThreeActivity extends AppCompatActivity {

    ActivityScreenThreeBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityScreenThreeBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());
        getSupportActionBar().hide();
        populateUsersList();
    }

    private void populateUsersList() {

        ArrayList<ItemScTwo> itemScTwos = ItemScTwo.getItems();
        CustomScTwoAdapter adapter = new CustomScTwoAdapter(this,itemScTwos);

        ListView listView =(ListView) findViewById(R.id.screenThree_listView);
        listView.setAdapter(adapter);
    }

}