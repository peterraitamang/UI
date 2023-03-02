package intern.project2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import intern.project2.databinding.ActivityScreenOneBinding;

public class ScreenOneActivity extends AppCompatActivity {

    ActivityScreenOneBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityScreenOneBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

//        b.layout.

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.profile:
                Toast.makeText(this, "Profile clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.Status:
                Toast.makeText(this, "Status clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.Help:
                Toast.makeText(this, "Help clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.Logout:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}