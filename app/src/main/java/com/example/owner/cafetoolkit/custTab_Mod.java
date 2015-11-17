package com.example.owner.cafetoolkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class custTab_Mod extends AppCompatActivity  implements View.OnClickListener {
    private Button buttonAdd2, buttonBack2, buttonDel2, buttonSum2;

    //private EditText editName;
    //String person_name=editName.getText().toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_tab__mod);

        //test a toast
        Toast.makeText(getApplicationContext(), "This is a toast", Toast.LENGTH_SHORT).show();

        //sets the button to a variable
        buttonAdd2 = (Button) findViewById(R.id.tabAdd2);
        buttonBack2 = (Button) findViewById(R.id.tabB2);
        buttonDel2 = (Button) findViewById(R.id.tabDel2);
        buttonSum2 = (Button) findViewById(R.id.tabSum2);
        //sets onclcik listeners
        buttonAdd2.setOnClickListener(this);
        buttonSum2.setOnClickListener(this);
        buttonBack2.setOnClickListener(this);
        buttonDel2.setOnClickListener(this);
    }

    public custTab_Mod() {
    }

    @Override
    public void onClick(View view) {
        int a = view.getId();
        if (a == R.id.tabB2) { //quit button
            Intent intent = new Intent(custTab_Mod.this, custTab_List.class);
            startActivity(intent);
        } else
            Toast.makeText(getApplicationContext(), "Fuck You", Toast.LENGTH_SHORT).show();


    }
}
