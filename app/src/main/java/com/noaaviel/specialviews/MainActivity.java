package com.noaaviel.specialviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.noaaviel.spannablehelper.SpannableHelper;

public class MainActivity extends AppCompatActivity {

    TextView textView, text1, text2,text3,text4,text5,text6;
    SpannableString spannableString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews(){
        textView = findViewById(R.id.tvNoaExample);
        text1 = findViewById(R.id.tvNoaExample1);
        text2 = findViewById(R.id.tvNoaExample2);
        text3 = findViewById(R.id.tvNoaExample3);
        text4 = findViewById(R.id.tvNoaExample4);
        text5 = findViewById(R.id.tvNoaExample5);
        text6 = findViewById(R.id.tvNoaExample6);

        String text = (String) textView.getText();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            spannableString = new SpannableString(textView.getText().toString());
            spannableString = SpannableHelper.showTextPartlyBold(text,"Noa",getColor(com.noaaviel.spannablehelper.R.color.purple_700));
        }
        textView.setText(spannableString);
        SpannableHelper.addStrikethroughText(text1,"noa");
        SpannableHelper.addUnderlineText(text2,"noa");
        SpannableHelper.changeFontSize(text3,"noa",18);
        SpannableHelper.changeFontColor(text4,"noa",R.color.teal_200);
        SpannableHelper.changeBackgroundColor(text5,"noa",R.color.color);
    }
}