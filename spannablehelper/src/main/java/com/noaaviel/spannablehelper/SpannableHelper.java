package com.noaaviel.spannablehelper;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpannableHelper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @RequiresApi(api = Build.VERSION_CODES.P)
    public static SpannableString showTextPartlyBold(String text, String patternText,int boldColor) {
        SpannableString spannableString = new SpannableString(text);
        Pair<Integer, Integer> indices = getPatternIndices(patternText.toLowerCase(), text.toLowerCase());
        if (indices != null) {
            spannableString.setSpan(
                    new TypefaceSpan(Typeface.DEFAULT_BOLD),
                    indices.first,
                    indices.second,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            );

            spannableString.setSpan(
                    new ForegroundColorSpan(boldColor),
                    indices.first,
                    indices.second,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            );
        }
        return spannableString;
    }

    public static Pair<Integer, Integer> getPatternIndices(String pattern, String input) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        if (m.find()) {
            int start = m.start();
            int end = m.end();
            return new Pair<>(start, end);
        } else {
            return null;
        }
    }

    public static void addStrikethroughText(TextView textView, String patternText) {
        SpannableString spannableString = new SpannableString(textView.getText());
        Pair<Integer, Integer> indices = getPatternIndices(patternText.toLowerCase(), textView.getText().toString().toLowerCase());
        if (indices != null) {
            spannableString.setSpan(
                    new StrikethroughSpan(),
                    indices.first,
                    indices.second,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            );
            textView.setText(spannableString);
        }
    }

    public static void addUnderlineText(TextView textView, String patternText) {
        SpannableString spannableString = new SpannableString(textView.getText());
        Pair<Integer, Integer> indices = getPatternIndices(patternText.toLowerCase(), textView.getText().toString().toLowerCase());
        if (indices != null) {
            spannableString.setSpan(
                    new UnderlineSpan(),
                    indices.first,
                    indices.second,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            );
            textView.setText(spannableString);
        }
    }

    public static void changeFontSize(TextView textView, String patternText, int newSize) {
        SpannableString spannableString = new SpannableString(textView.getText());
        Pair<Integer, Integer> indices = getPatternIndices(patternText.toLowerCase(), textView.getText().toString().toLowerCase());
        if (indices != null) {
            spannableString.setSpan(
                    new AbsoluteSizeSpan(newSize, true),
                    indices.first,
                    indices.second,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            );
            textView.setText(spannableString);
        }
    }

    public static void changeFontColor(TextView textView, String patternText, int newColor) {
        SpannableString spannableString = new SpannableString(textView.getText());
        Pair<Integer, Integer> indices = getPatternIndices(patternText.toLowerCase(), textView.getText().toString().toLowerCase());
        if (indices != null) {
            spannableString.setSpan(
                    new ForegroundColorSpan(newColor),
                    indices.first,
                    indices.second,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            );
            textView.setText(spannableString);
        }
    }

    public static void changeBackgroundColor(TextView textView, String patternText, int newColor) {
        SpannableString spannableString = new SpannableString(textView.getText());
        Pair<Integer, Integer> indices = getPatternIndices(patternText.toLowerCase(), textView.getText().toString().toLowerCase());
        if (indices != null) {
            spannableString.setSpan(
                    new BackgroundColorSpan(newColor),
                    indices.first,
                    indices.second,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            );
            textView.setText(spannableString);
        }
    }

    public static void changeTextStyle(TextView textView, String patternText, int style) {
        SpannableString spannableString = new SpannableString(textView.getText());
        Pair<Integer, Integer> indices = getPatternIndices(patternText.toLowerCase(), textView.getText().toString().toLowerCase());
        if (indices != null) {
            spannableString.setSpan(
                    new StyleSpan(style),
                    indices.first,
                    indices.second,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            );
            textView.setText(spannableString);
        }
    }

}