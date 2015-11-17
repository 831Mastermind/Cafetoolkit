package com.example.owner.cafetoolkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class addDelete_user extends AppCompatActivity implements View.OnClickListener{
    private Button buttonAdd, buttonDelete,buttonQuit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_delete_user);


        //sets the button to a variable
        buttonAdd=(Button) findViewById(R.id.adAdd);
        buttonDelete=(Button) findViewById(R.id.adDelete);
        buttonQuit1=(Button) findViewById(R.id.adQuit);
        //sets onclcik listeners
        buttonAdd.setOnClickListener(this);
        buttonDelete.setOnClickListener(this);
        buttonQuit1.setOnClickListener(this);
    }
    public addDelete_user(){
    }

    @Override
    public void onClick(View view){
        int a=view.getId();
        if(a==R.id.adQuit){ //quit button
            Intent intent = new Intent(addDelete_user.this, Function.class);
            startActivity(intent);
        }


        else  Toast.makeText(getApplicationContext(),"This is a toast",Toast.LENGTH_SHORT).show();




    }

}
