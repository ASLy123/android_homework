package com.example.hjschoolhelper_200301851;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JingcaiPhotoAdapter extends RecyclerView.Adapter<JingcaiTestHolder> {

    private List<Map<String,Object>> list;

    JingcaiPhotoAdapter(List<Map<String,Object>>l){
        list=l;
    }
    @NonNull
    @Override
    public JingcaiTestHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recy_shetuanjingcao,parent,false);
        JingcaiTestHolder recyitem=new JingcaiTestHolder(v);
        return recyitem;
    }

    @Override
    public void onBindViewHolder(@NonNull JingcaiTestHolder holder, int position) {
        Map<String,Object>map=list.get(position);
        holder.img_recy_jingcai.setImageResource((Integer) map.get("img"));
        holder.txt_item_recy_name.setText((CharSequence) map.get("name"));
        holder.txt_item_recy_desc.setText((Integer) map.get("desc"));

        int[]photoes=(int[])map.get("photo");
        List photolist=new ArrayList();

        for (int i=0;i<photoes.length;i++){
            Map<String,Object> m=new HashMap<>();
            m.put("img",photoes[i]);
            photolist.add(m);
        }
        SimpleAdapter photoAdapter=new SimpleAdapter(holder.itemView.getContext(),photolist,
                R.layout.item_grid_shetuanjingcao,new String[]{"img"},new int[]{R.id.img_item_grid_jingcai});
        holder.grid_item_recy.setAdapter(photoAdapter);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}