package intern.project2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class ScreenOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_one);
        getSupportActionBar().hide();
        //        ActionBar actionBar = getSupportActionBar();
//        actionBar.setTitle("go back to Menu");
//        actionBar.setDisplayShowHomeEnabled(true);
//        actionBar.setDisplayHomeAsUpEnabled(true);



    }
}