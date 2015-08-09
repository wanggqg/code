package com.app.wangguoqiang.howold;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    private ImageView iv;
    private Button btIamge;
    private Button btHow;
    private String mCurrentPhoto = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
        initEvents();
    }

    private void initEvents() {
        btIamge.setOnClickListener(this);
        btHow.setOnClickListener(this);
    }

    private void assignViews() {
        iv = (ImageView) findViewById(R.id.iv);
        btIamge = (Button) findViewById(R.id.bt_iamge);
        btHow = (Button) findViewById(R.id.bt_how);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_iamge:
                //这里获取一张图片
                Intent intent = new Intent(Intent.ACTION_PICK);

                break;
            case R.id.bt_how:

                break;
        }
    }
}
