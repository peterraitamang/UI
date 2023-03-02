package intern.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import intern.project2.Model.AccountsModel;
import intern.project2.adapter.AccountModelAdapter;
import intern.project2.databinding.ActivityScreenFourBinding;

public class ScreenFourActivity extends AppCompatActivity {
    ActivityScreenFourBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityScreenFourBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());


        AccountsModel[] myListData = new AccountsModel[]{
            new AccountsModel("$5000","City Bank Account"),
            new AccountsModel("$6000","Brac Bank Account"),
            new AccountsModel("$7000","Exim Bank Account"),
            new AccountsModel("$1000","Brac Bank Account"),
            new AccountsModel("$5000","Exim Bank Account"),
            new AccountsModel("$6000","Exim Bank Account"),
            new AccountsModel("$7000","Exim Bank Account"),
            new AccountsModel("$8000","Brac Bank Account")
        };

        RecyclerView recyclerView =(RecyclerView) findViewById(R.id.rv1 );
        AccountModelAdapter adapter = new AccountModelAdapter(myListData);
        recyclerView.setLayoutManager(new LinearLayoutManager(ScreenFourActivity.this, LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);
    }
}