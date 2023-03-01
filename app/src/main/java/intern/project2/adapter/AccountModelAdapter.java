package intern.project2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import intern.project2.Model.AccountsModel;
import intern.project2.R;

public class AccountModelAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<AccountsModel> accountsModels;

    public AccountModelAdapter(Context context, ArrayList<AccountsModel> accountsModels) {
        this.context = context;
        this.accountsModels = accountsModels;
    }

    @Override
    public int getCount() {
        return accountsModels.size();
    }

    @Override
    public Object getItem(int position) {
        return accountsModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.recycler_view_cardview,parent,false);
        }
        AccountsModel currentItem = (AccountsModel) getItem(position);

        TextView textViewAmount = (TextView) convertView.findViewById(R.id.tv41);
        TextView textViewBankAccountName = (TextView) convertView.findViewById(R.id.tv42);

        textViewAmount.setText(currentItem.getAmount());
        textViewBankAccountName.setText(currentItem.getBankAccountName());



        return convertView;
    }
}
