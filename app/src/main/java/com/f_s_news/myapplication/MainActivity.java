package com.f_s_news.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ListView list1;
    ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();
    HashMap<String,String>hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list1=findViewById(R.id.list1);
        createtable();








my_adapter adapter =new my_adapter();
list1.setAdapter(adapter);
    }

    //........................................
    //........................................
    //........................................

private class my_adapter extends BaseAdapter{

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       LayoutInflater layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View my_view=layoutInflater.inflate(R.layout.first_layout,parent,false);

        ImageView imageView=my_view.findViewById(R.id.imageView);
        TextView textView1=my_view.findViewById(R.id.textView1);
        TextView textView2=my_view.findViewById(R.id.textView2);
        TextView textView3=my_view.findViewById(R.id.textView3);
        LinearLayout line=my_view.findViewById(R.id.line);


HashMap<String,String>hashMap=arrayList.get(position);

        String cat=hashMap.get("cat");
        String img_url=hashMap.get("img_url");
        String tit=hashMap.get("tit");
        String des=hashMap.get("des");








        Picasso.get().load(img_url)
                            .placeholder(R.drawable.download8)
                            .into(imageView);

        textView1.setText(cat);
        textView2.setText(tit);
        textView3.setText(des);




//..................................
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        textView1.setBackgroundColor(color);
//..................................

 line.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
//..................................

       NEWSDEITLS.tittle=tit;
        NEWSDEITLS.text=des;
        Bitmap bitmap= ( (BitmapDrawable) imageView.getDrawable() ).getBitmap();
NEWSDEITLS.my_bitmap=bitmap;

 //..................................

startActivity(new Intent(MainActivity.this,NEWSDEITLS.class));


     }
 });



        return my_view;
    }


}

    /*              hashMap=new HashMap<>();
                    hashMap.put("cat","");
                    hashMap.put("img_url","");
                    hashMap.put("tit","");
                    hashMap.put("des","");
                    arrayList.add(hashMap);          */



private void createtable(){



    hashMap=new HashMap<>();
        hashMap.put("cat","Tech");
        hashMap.put("img_url","https://i0.wp.com/techzoom.tv/wp-content/uploads/2022/10/%E0%A6%97%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A6%BE%E0%A6%95%E0%A7%8D%E0%A6%B8%E0%A6%BF-%E0%A6%B0%E0%A6%BF%E0%A6%82-%E0%A6%A8%E0%A6%BF%E0%A7%9F%E0%A7%87-%E0%A6%95%E0%A6%BE%E0%A6%9C-%E0%A6%95%E0%A6%B0%E0%A6%AC%E0%A7%87-%E0%A6%B8%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%AE%E0%A6%B8%E0%A6%BE%E0%A6%82.jpg");
        hashMap.put("tit","গ্যালাক্সি রিং নিয়ে কাজ করবে স্যামসাং");
        hashMap.put("des","প্রতিদিন কতটুকু পথ হাঁটা হয়েছে, হূত্স্পন্দন কতটুকু, ঘুমের পরিমাপসহ স্বাস্থ্য সুরক্ষায় স্মার্টওয়াচ ও স্মার্টব্যান্ডের প্রচলন রয়েছে। এসব ডিভাইস অনেকের কাছে স্বাচ্ছন্দ্যের আবার কারো কাছে বিরক্তির। তবে এদিক থেকে স্মার্ট রিং অনেকটাই আরামদায়ক। এ কারণে শিগগিরই এমন একটি ডিভাইস নিয়ে কাজ করার পরিকল্পনা হাতে নিয়েছে স্যামসাং।");
arrayList.add(hashMap);

    hashMap=new HashMap<>();
    hashMap.put("cat","Tech");
    hashMap.put("img_url","https://i0.wp.com/techzoom.tv/wp-content/uploads/2022/10/%E0%A6%97%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%B2%E0%A6%BE%E0%A6%95%E0%A7%8D%E0%A6%B8%E0%A6%BF-%E0%A6%B0%E0%A6%BF%E0%A6%82-%E0%A6%A8%E0%A6%BF%E0%A7%9F%E0%A7%87-%E0%A6%95%E0%A6%BE%E0%A6%9C-%E0%A6%95%E0%A6%B0%E0%A6%AC%E0%A7%87-%E0%A6%B8%E0%A7%8D%E0%A6%AF%E0%A6%BE%E0%A6%AE%E0%A6%B8%E0%A6%BE%E0%A6%82.jpg");
    hashMap.put("tit","গ্যালাক্সি রিং নিয়ে কাজ করবে স্যামসাং");
    hashMap.put("des","প্রতিদিন কতটুকু পথ হাঁটা হয়েছে, হূত্স্পন্দন কতটুকু, ঘুমের পরিমাপসহ স্বাস্থ্য সুরক্ষায় স্মার্টওয়াচ ও স্মার্টব্যান্ডের প্রচলন রয়েছে। এসব ডিভাইস অনেকের কাছে স্বাচ্ছন্দ্যের আবার কারো কাছে বিরক্তির। তবে এদিক থেকে স্মার্ট রিং অনেকটাই আরামদায়ক। এ কারণে শিগগিরই এমন একটি ডিভাইস নিয়ে কাজ করার পরিকল্পনা হাতে নিয়েছে স্যামসাং।");
    arrayList.add(hashMap);


    }

    //........................................
    //........................................
    //........................................


}