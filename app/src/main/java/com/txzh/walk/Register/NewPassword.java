package com.txzh.walk.Register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import com.txzh.walk.MainActivity;
import com.txzh.walk.R;

public class NewPassword extends AppCompatActivity implements View.OnClickListener {
    private Intent intent;
    private ImageButton ib_Return;
    private Button btn_Finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);  //去掉标题栏
        setContentView(R.layout.activity_new_password);

        ib_Return = findViewById(R.id.ib_Return);
        ib_Return.setOnClickListener(this);
        btn_Finish = findViewById(R.id.btn_Finish);
        btn_Finish.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ib_Return:
                //Toast.makeText(this, "aaaaa", Toast.LENGTH_SHORT).show();
                intent = new Intent(this, RetrievePassword.class);
                startActivity(intent);
                break;
            case  R.id.btn_Finish:
                intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
