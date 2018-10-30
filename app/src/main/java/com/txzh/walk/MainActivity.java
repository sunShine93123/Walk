package com.txzh.walk;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.txzh.walk.HomePage.WalkHome;
import com.txzh.walk.Register.RetrievePassword;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    protected Typeface typeface;
    private Intent intent;
    public static TextView tv_AppName,tv_forget_password,tv_registered_account;
    private Button btn_login;
    public static int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);  //去掉标题栏
        setContentView(R.layout.activity_main);


        //设置字体样式
        typeface = Typeface.createFromAsset(getAssets(),"fonts/font1.ttf");
        tv_AppName = findViewById(R.id.tv_AppName);
        tv_AppName.setTypeface(typeface);

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(this);
        tv_forget_password = findViewById(R.id.tv_forget_password);
        tv_forget_password.setOnClickListener(this);
        tv_registered_account = findViewById(R.id.tv_registered_account);
        tv_registered_account.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        id = view.getId();
        switch (id ){
            case R.id.btn_login:
                intent = new Intent(MainActivity.this, WalkHome.class);
                startActivity(intent);
                Toast.makeText(this, "aaaa", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_forget_password:
                //Toast.makeText(this, "bbbb", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, RetrievePassword.class);
                startActivity(intent);
                break;
            case R.id.tv_registered_account:
                //Toast.makeText(this, "cccc", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, RetrievePassword.class);
                startActivity(intent);
                break;
        }
    }
}
