package com.example.android.system.runtimepermissions;

import android.nfc.Tag;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class add_contact extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
    }

    public void addContact (View view){
        //primero obtenemos los valores los input text
        EditText name = (EditText) findViewById(R.id.nameText);
        EditText phone = (EditText) findViewById(R.id.phoneText);

        //Si estan vacios se muestra un toast
        if(name.getText().length() == 0 || phone.getText().length() == 0)
            Toast.makeText(this, "The fields can't be empty!", Toast.LENGTH_LONG).show();
        else {
            Log.i("Name", name.getText().toString());
            Log.i("Phone", phone.getText().toString());
            Toast.makeText(this, "Contact successfully added!", Toast.LENGTH_LONG).show();
        }

    }
}
