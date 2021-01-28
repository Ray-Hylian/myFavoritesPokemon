package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button validateButton;
    private EditText emailEdit;
    private EditText passwordEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initClickListener();
    }

    private void initView() {
        validateButton = findViewById(R.id.validateButton);
        emailEdit = findViewById(R.id.emailEdit);
        passwordEdit = findViewById(R.id.passwordEdit);
    }

    private void initClickListener() {
        validateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emailEdit.getText().toString().isEmpty() || passwordEdit.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), getString(R.string.empty_field), Toast.LENGTH_SHORT).show();
                }
                else if(!emailEdit.getText().toString().equals("admin@admin.com") || !passwordEdit.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(), getString(R.string.wrong_id), Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

}
