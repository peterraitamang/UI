package intern.project2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import intern.project2.Model.Item;
import intern.project2.R;

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList <Item> items;

    public CustomListAdapter(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView ==null){
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.custom_cardview_screen1, parent, false);
        }

        Item currentItem = (Item) getItem(position);
        //get
        TextView textViewItemProfile = (TextView) convertView.findViewById(R.id.tv1);
        TextView textViewItemName = (TextView) convertView.findViewById(R.id.tv2);
        TextView textViewItemStatus = (TextView) convertView.findViewById(R.id.tv3);
        TextView textViewItemAmount = (TextView) convertView.findViewById(R.id.tv4);
        TextView textViewItemDate = (TextView) convertView.findViewById(R.id.tv5);
        //set
        textViewItemProfile.setText(currentItem.getItemProfileImg());
        textViewItemName.setText(currentItem.getItemName());
        textViewItemStatus.setText(currentItem.getItemStatus());
        textViewItemAmount.setText(currentItem.getItemAmount());
        textViewItemDate.setText(currentItem.getItemDate());

        return convertView;
    }
}
