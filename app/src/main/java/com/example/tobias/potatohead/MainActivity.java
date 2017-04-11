package com.example.tobias.potatohead;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    SharedPreferences pref;
    Map<View, View> map = new HashMap<>();
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // at all checkboxes and respective images to hasmap
        map.put(findViewById(R.id.checkBoxArms), findViewById(R.id.imageViewArms));
        map.put(findViewById(R.id.checkBoxEars), findViewById(R.id.imageViewEars));
        map.put(findViewById(R.id.checkBoxEyebrows), findViewById(R.id.imageViewEyebrows));
        map.put(findViewById(R.id.checkBoxEyes), findViewById(R.id.imageViewEyes));
        map.put(findViewById(R.id.checkBoxGlasses), findViewById(R.id.imageViewGlasses));
        map.put(findViewById(R.id.checkBoxHat), findViewById(R.id.imageViewHat));
        map.put(findViewById(R.id.checkBoxMouth), findViewById(R.id.imageViewMouth));
        map.put(findViewById(R.id.checkBoxMustache), findViewById(R.id.imageViewMustache));
        map.put(findViewById(R.id.checkBoxNose), findViewById(R.id.imageViewNose));
        map.put(findViewById(R.id.checkBoxShoes), findViewById(R.id.imageViewShoes));

        // create shared preferences to save data when flipping screen
        pref = getSharedPreferences("Saved", Context.MODE_PRIVATE);

        for(Map.Entry<View,View> pair : map.entrySet()) {
            CheckBox check = (CheckBox) pair.getKey();
            View acc = pair.getValue();
            String name = (String) check.getText();
            boolean visible = pref.getBoolean(name, false);
            if(visible) {
                acc.setVisibility(View.VISIBLE);
                check.setChecked(true);
            } else {
                check.setChecked(false);
            }
        }
    }

    // all checkboxes with their respective image from hashmap
    public void clickBaitArms(View view) {
        View acc = map.get(view);
        SharedPreferences.Editor editor = pref.edit();
        boolean visible = pref.getBoolean("Arms", false);
        if(visible) {
            acc.setVisibility(View.INVISIBLE);
            editor.putBoolean("Arms", false);
        } else {
            acc.setVisibility(View.VISIBLE);
            editor.putBoolean("Arms", true);
        }
        editor.apply();
    }

    public void clickBaitGlasses(View view) {
        View acc = map.get(view);
        SharedPreferences.Editor editor = pref.edit();
        boolean visible = pref.getBoolean("Glasses", false);
        if(visible) {
            acc.setVisibility(View.INVISIBLE);
            editor.putBoolean("Glasses", false);
        } else {
            acc.setVisibility(View.VISIBLE);
            editor.putBoolean("Glasses", true);
        }
        editor.apply();
    }

    public void clickBaitHat(View view) {
        View acc = map.get(view);
        SharedPreferences.Editor editor = pref.edit();
        boolean visible = pref.getBoolean("Hat", false);
        if(visible) {
            acc.setVisibility(View.INVISIBLE);
            editor.putBoolean("Hat", false);
        } else {
            acc.setVisibility(View.VISIBLE);
            editor.putBoolean("Hat", true);
        }
        editor.apply();
    }

    public void clickBaitEyebrows(View view) {
        View acc = map.get(view);
        SharedPreferences.Editor editor = pref.edit();
        boolean visible = pref.getBoolean("Eyebrows", false);
        if(visible) {
            acc.setVisibility(View.INVISIBLE);
            editor.putBoolean("Eyebrows", false);
        } else {
            acc.setVisibility(View.VISIBLE);
            editor.putBoolean("Eyebrows", true);
        }
        editor.apply();
    }

    public void clickBaitNose(View view) {
        View acc = map.get(view);
        SharedPreferences.Editor editor = pref.edit();
        boolean visible = pref.getBoolean("Nose", false);
        if(visible) {
            acc.setVisibility(View.INVISIBLE);
            editor.putBoolean("Nose", false);
        } else {
            acc.setVisibility(View.VISIBLE);
            editor.putBoolean("Nose", true);
        }
        editor.apply();
    }

    public void clickBaitEyes(View view) {
        View acc = map.get(view);
        SharedPreferences.Editor editor = pref.edit();
        boolean visible = pref.getBoolean("Eyes", false);
        if(visible) {
            acc.setVisibility(View.INVISIBLE);
            editor.putBoolean("Eyes", false);
        } else {
            acc.setVisibility(View.VISIBLE);
            editor.putBoolean("Eyes", true);
        }
        editor.apply();
    }

    public void clickBaitEars(View view) {
        View acc = map.get(view);
        SharedPreferences.Editor editor = pref.edit();
        boolean visible = pref.getBoolean("Ears", false);
        if(visible) {
            acc.setVisibility(View.INVISIBLE);
            editor.putBoolean("Ears", false);
        } else {
            acc.setVisibility(View.VISIBLE);
            editor.putBoolean("Ears", true);
        }
        editor.apply();
    }

    public void clickBaitMouth(View view) {
        View acc = map.get(view);
        SharedPreferences.Editor editor = pref.edit();
        boolean visible = pref.getBoolean("Mouth", false);
        if(visible) {
            acc.setVisibility(View.INVISIBLE);
            editor.putBoolean("Mouth", false);
        } else {
            acc.setVisibility(View.VISIBLE);
            editor.putBoolean("Mouth", true);
        }
        editor.apply();
    }

    public void clickBaitMustache(View view) {
        View acc = map.get(view);
        SharedPreferences.Editor editor = pref.edit();
        boolean visible = pref.getBoolean("Mustache", false);
        if(visible) {
            acc.setVisibility(View.INVISIBLE);
            editor.putBoolean("Mustache", false);
        } else {
            acc.setVisibility(View.VISIBLE);
            editor.putBoolean("Mustache", true);
        }
        editor.apply();
    }

    public void clickBaitShoes(View view) {
        SharedPreferences.Editor editor = pref.edit();
        View acc = map.get(view);
        boolean visible = pref.getBoolean("Shoes", false);
        if(visible) {
            acc.setVisibility(View.INVISIBLE);
            editor.putBoolean("Shoes", false);
        } else {
            acc.setVisibility(View.VISIBLE);
            editor.putBoolean("Shoes", true);
        }
        editor.apply();
    }

//    public void onDestroy() {
//
//        super.onDestroy();
//        SharedPreferences.Editor editor = pref.edit();
//        editor.clear();
//        editor.commit();
//
//    }
}