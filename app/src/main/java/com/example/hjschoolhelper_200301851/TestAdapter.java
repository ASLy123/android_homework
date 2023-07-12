package com.example.hjschoolhelper_200301851;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class TestAdapter extends BaseAdapter {
    private Context context;
    private List<Map<String,Object>> list;

    TestAdapter(Context c,List<Map<String,Object>> I){         //初始化类
        context = c;
        list = I;

    }

    @Override
    public int getCount() {//显示列表中一共有多少条信息

        return list.size();
    }

    @Override
    public Object getItem(int position) {       //取出当前条目的信息
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {        //获取当前条目的id
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {          //关联样式文件

        convertView = LayoutInflater.from(context).inflate(R.layout.item_list_test,null);   //样式文件的引用，null没有嵌套
        ViewHolder v =new ViewHolder();
        v.img_item_list = convertView.findViewById(R.id.img_item_list);
        v.txt_item_list_name =convertView.findViewById(R.id.txt_item_list_name);
        v.txt_item_list_desc =convertView.findViewById(R.id.txt_item_list_desc);
        //赋值
        v.img_item_list.setImageResource((Integer) list.get(position).get("img"));
        v.txt_item_list_name.setText((CharSequence) list.get(position).get("name"));    //CharSequence
        v.txt_item_list_desc.setText((Integer) list.get(position).get("desc"));


        return convertView;
    }
    private class ViewHolder{      //样式文件控件容器
        ImageView img_item_list;
        TextView txt_item_list_name;
        TextView txt_item_list_desc;



    }
}

