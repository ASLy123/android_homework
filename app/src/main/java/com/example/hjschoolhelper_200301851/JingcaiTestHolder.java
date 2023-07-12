package com.example.hjschoolhelper_200301851;

import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class JingcaiTestHolder extends RecyclerView.ViewHolder {
    ImageView img_recy_jingcai;
    TextView txt_item_recy_name;
    TextView txt_item_recy_desc;
    GridView grid_item_recy;

    public JingcaiTestHolder(@NonNull View itemView) {
        super(itemView);
        img_recy_jingcai=itemView.findViewById(R.id.img_recy_huodong);
        txt_item_recy_name=itemView.findViewById(R.id.txt_item_recy_name);
        txt_item_recy_desc=itemView.findViewById(R.id.txt_item_recy_desc);
        grid_item_recy=itemView.findViewById(R.id.grid_item_recy);

    }
}
