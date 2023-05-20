package com.noaaviel.specialviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.noaaviel.spannablehelper.SpannableHelper;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    SpannableString spannableString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews(){
        textView = findViewById(R.id.tvNoaExample);
        String text = (String) textView.getText();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            spannableString = new SpannableString(textView.getText().toString());
            spannableString = SpannableHelper.showTextPartlyBold(text,"Noa",getColor(com.noaaviel.spannablehelper.R.color.purple_700));
        }
        textView.setText(spannableString);
    }
}