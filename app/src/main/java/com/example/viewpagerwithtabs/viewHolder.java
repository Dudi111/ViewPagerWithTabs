package com.example.viewpagerwithtabs;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class viewHolder extends RecyclerView.ViewHolder {
    private TextView textView;


    public viewHolder(@NonNull  View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        textView=itemView.findViewById(R.id.tvtextview);
    }
    public void setdata(Model model){
        textView.setText(model.getName());
    }
}
