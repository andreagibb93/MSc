package com.example.tutorial1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // grabs the two edit text boxes
                EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
                EditText num2EditText = (EditText) findViewById(R.id.num2EditText);

                TextView resulttextView = (TextView) findViewById(R.id.resulttextView);

                // get the text out edit text box, parse to string
                int num1 = Integer.parseInt(num1EditText.getText().toString());
                int num2 = Integer.parseInt(num2EditText.getText().toString());

                // add the value of num1 and num2
                int result = num1 + num2;

                // 'result' is an interger, "" passes it as a string
                resulttextView.setText(result + "");

                //clear the input of both boxes
                num1EditText.setText("");
                num2EditText.setText("");





            }
        });
    }
}
