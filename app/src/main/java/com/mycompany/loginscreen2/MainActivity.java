package com.mycompany.loginscreen2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edittext1,edittext2;
    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        edittext1=(EditText)findViewById(R.id.editText);
        edittext2=(EditText)findViewById(R.id.editText2);
        button=(Button)findViewById(R.id.button);
        Toast.makeText(getApplicationContext(), "Login successfully", Toast.LENGTH_SHORT).show();
        textView=(TextView)findViewById(R.id.textView);
    }
}
