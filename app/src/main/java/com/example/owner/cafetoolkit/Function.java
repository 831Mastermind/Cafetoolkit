package com.example.owner.cafetoolkit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Function extends AppCompatActivity  implements View.OnClickListener{
private Button buttonAddDelete, buttonInventory,buttonTab,buttonQuit;
    //private EditText editName;
    //String person_name=editName.getText().toString();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function);

        //test a toast
        Toast.makeText(getApplicationContext(),"This is a toast",Toast.LENGTH_SHORT).show();

        //sets the button to a variable
        buttonAddDelete=(Button) findViewById(R.id.button1);
        buttonInventory=(Button) findViewById(R.id.button2);
        buttonTab=(Button)findViewById(R.id.button3);
        buttonQuit=(Button) findViewById(R.id.button4);
        //sets onclcik listeners
        buttonAddDelete.setOnClickListener( this);
        buttonInventory.setOnClickListener( this);
        buttonTab.setOnClickListener(this);
        buttonQuit.setOnClickListener( this);
    }
    public Function(){
    }

    @Override
    public void onClick(View view){
        int a=view.getId();
        if(a==R.id.button4){ //quit button
            Log.i("test", "Exiting");
            finish();
        }
        else if(a==R.id.button2) {
           Intent intent = new Intent(Function.this, invList_activity.class);
            startActivity(intent);
        }
        else if(a==R.id.button1) {
            Intent intent = new Intent(Function.this, addDelete_user.class);
            startActivity(intent);
        }
        else if(a==R.id.button3) {
            Intent intent = new Intent(Function.this, custTab_List.class);
            startActivity(intent);
        }

        else  Toast.makeText(getApplicationContext(),"This is a toast",Toast.LENGTH_SHORT).show();




    }
   /*Override
    public void onAttatch(Context ctx){
        super.onAttach(ctx);
    }*/
}

