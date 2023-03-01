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
        populateAccountsList();

    }

    private void populateAccountsList() {
        ArrayList<AccountsModel> accountsModels = AccountsModel.getList();
        AccountModelAdapter accountModelAdapter = new AccountModelAdapter(this, accountsModels);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        b.rv1.setLayoutManager(linearLayoutManager);
        b.rv1.setAdapter(accountModelAdapter);


    }
}