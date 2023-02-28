package intern.project2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import intern.project2.Model.ItemScTwo;
import intern.project2.R;

public class CustomScTwoAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<ItemScTwo> itemScTwos;

    public CustomScTwoAdapter(Context context, ArrayList<ItemScTwo> itemScTwos) {
        this.context = context;
        this.itemScTwos = itemScTwos;
    }

    @Override
    public int getCount() {
        return itemScTwos.size();
    }

    @Override
    public Object getItem(int position) {
        return itemScTwos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_cardview_screen2, parent,false);
        }

        ItemScTwo currentItem = (ItemScTwo) getItem(position);

        TextView textViewAmount = (TextView) convertView.findViewById(R.id.tv1);
        TextView textViewBankName = (TextView) convertView.findViewById(R.id.tv2);

        textViewAmount.setText(currentItem.getAmount());
        textViewBankName.setText(currentItem.getBankName());
        return convertView;
    }
}
