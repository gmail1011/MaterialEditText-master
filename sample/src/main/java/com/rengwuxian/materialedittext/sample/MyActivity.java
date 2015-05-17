package com.rengwuxian.materialedittext.sample;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.rengwuxian.materialedittext.MaterialAutoCompleteTextView;
import com.rengwuxian.materialedittext.MaterialEditText;

/**
 * Created by Administrator on 2015/5/17.
 */
public class MyActivity  extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
//        LinearLayout line=new LinearLayout(this);
//        line.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
//
//        MaterialEditText text=new MaterialEditText(this);
//        text.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        line.addView(text);
        setContentView(R.layout.my_activity);
        MaterialEditText text=(MaterialEditText)findViewById(R.id.edit);
        text.setIconRight(R.drawable.ic_phone);
        text.setHideUnderline(false);
    }
}
