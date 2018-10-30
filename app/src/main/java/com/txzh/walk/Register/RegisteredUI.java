package com.txzh.walk.Register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.txzh.walk.R;

public class RegisteredUI extends AppCompatActivity implements View.OnClickListener {
    private ImageButton ib_Return;
    private Button btn_Registered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered_ui);

        ib_Return = findViewById(R.id.ib_Return);
        ib_Return.setOnClickListener(this);
        btn_Registered = findViewById(R.id.btn_Registered);
        btn_Registered.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ib_Return:
                //Toast.makeText(this, "aaaaa", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, RetrievePassword.class);
                startActivity(intent);
                break;
            case  R.id.btn_Registered:
                Toast.makeText(this, "cccc", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
