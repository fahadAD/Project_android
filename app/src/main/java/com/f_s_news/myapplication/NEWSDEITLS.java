package com.f_s_news.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class NEWSDEITLS extends AppCompatActivity {

ImageView coverimage;
 TextView covertittle,covertext;
 FloatingActionButton fab;
TextToSpeech textToSpeech;
 public static String tittle="";
    public static String text="";
public static Bitmap my_bitmap=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newsdeitls);


        textToSpeech=new TextToSpeech(NEWSDEITLS.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });
        coverimage=findViewById(R.id.coverimage);
        covertext=findViewById(R.id.covertext);
        covertittle=findViewById(R.id.covertittle);
        fab=findViewById(R.id.fab);



covertittle.setText(tittle);
        covertext.setText(text);
if (my_bitmap!=null)coverimage.setImageBitmap(my_bitmap);


fab.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
String tex=covertext.getText().toString();
textToSpeech.speak(tex,TextToSpeech.QUEUE_FLUSH,null,null);
    }
});





    }
}