package com.ifsc.contaclick;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterPlaneta extends ArrayAdapter <Planeta>{

    int myresource;

    public AdapterPlaneta(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(myresource,parent,false);


        TextView tv = convertView.findViewById(R.id.tvNome);
        tv.setText(this.getItem(position).nome);

        return convertView;
    }


}
