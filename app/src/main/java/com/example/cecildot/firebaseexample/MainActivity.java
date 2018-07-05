package com.example.cecildot.firebaseexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText rollnumber,name;
    Button btnsave;
    TextView tv;
DatabaseReference dbref = FirebaseDatabase.getInstance().getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollnumber = (EditText) findViewById(R.id.ename);
        name = (EditText) findViewById(R.id.edtpass);
        tv=(TextView) findViewById(R.id.tv);
        btnsave = (Button) findViewById(R.id.btnclick);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StudentInfo studentInfo = new StudentInfo(rollnumber.getText().toString(),name.getText().toString());
               String key = dbref.push().getKey();
               dbref.child(key).setValue(studentInfo).addOnSuccessListener(new OnSuccessListener<Void>() {
                   @Override
                   public void onSuccess(Void aVoid) {
                       tv.setText("DATA INSERTED SUCESSFULLY");
                   }
               });
            }


        });
    }
}
