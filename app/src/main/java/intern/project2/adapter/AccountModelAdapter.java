package intern.project2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import intern.project2.Model.AccountsModel;
import intern.project2.R;
import intern.project2.databinding.ActivityScreenFourBinding;
import intern.project2.databinding.CustomCardviewScreen1Binding;

public class AccountModelAdapter extends RecyclerView.Adapter<AccountModelAdapter.ViewHolder> {

    private AccountsModel[]mydata;

    public AccountModelAdapter(AccountsModel[] mydata) {
        this.mydata = mydata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycler_view_cardview,parent,false);
        ViewHolder viewHolder = new ViewHolder(listItem);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final AccountsModel AccountsModel = mydata [position];
        holder.textView1.setText(mydata[position].getAmount());
        holder.textView2.setText(mydata[position].getBankAccountName());

        holder.recyclerView_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Accounts worth:"+AccountsModel.getAmount(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mydata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView1,textView2;
        public CardView recyclerView_cardview;
        public ImageView button_more;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.textView1 = (TextView) itemView.findViewById(R.id.tv41);
            this.textView2 = (TextView) itemView.findViewById(R.id.tv42);
            this.recyclerView_cardview = (CardView) itemView.findViewById(R.id.cardView_recyclerView);
            this.button_more = (ImageView) itemView.findViewById(R.id.iv_more);

        }
    }

}
