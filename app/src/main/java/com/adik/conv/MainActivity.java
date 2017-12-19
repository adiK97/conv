package com.adik.conv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertt(View view)
    {
        EditText nummm= (EditText) findViewById(R.id.nu);

        Double con=Double.parseDouble(nummm.getText().toString());
        Double val= con * 4;
        Toast.makeText(this, String.format("%.2f",val), Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
