package com.cd.softinputdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView mIv;
    private EditText mEt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIv = findViewById(R.id.iv);
        mEt2 = findViewById(R.id.et2);
        SoftInputUtil softInputUtil = new SoftInputUtil();
        softInputUtil.attachSoftInput(mEt2, new SoftInputUtil.ISoftInputChanged() {
            @Override
            public void onChanged(boolean isSoftInputShow, int softInputHeight, int viewOffset) {
                if (isSoftInputShow){
                    mEt2.setTranslationY(mEt2.getTranslationY()-viewOffset);
                }else {
                    mEt2.setTranslationY(0);
                }
            }
        });
    }
}