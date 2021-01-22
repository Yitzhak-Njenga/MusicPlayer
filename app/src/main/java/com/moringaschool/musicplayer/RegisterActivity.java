package com.moringaschool.musicplayer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;

public class RegisterActivity extends AppCompatActivity {

    EditText RegisterPhone,RegisterPassword,RegisterName;
    String Phone, Password, Name;      //to save phone no,password, and user input
    Button RegisterButton;
    ProgressDialog LoadingBar; // for loading bar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);




        RegisterPhone = (EditText)findViewById(R.id.register_phone);
        RegisterPassword =(EditText)findViewById(R.id.register_password);
        RegisterName = (EditText)findViewById(R.id.register_name);

        RegisterButton = (Button)findViewById(R.id.register_btn);

        LoadingBar = new ProgressDialog(this);

        LoadingBar.setTitle("Creating Account");
        LoadingBar.setMessage("Please Wait,while we are checking your password");
        LoadingBar.setCanceledOnTouchOutside(false);


        RegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //validating if the user have any empty text entry
                //save text entries in string from the user

                Phone = RegisterPhone.getText().toString();
                Password = RegisterName.getText().toString();
                Name = RegisterName.getText().toString();

                CreateNewAccount (Phone,Password,Name);

            }
        });

    }

    private void CreateNewAccount(String phone, String password, String name) {

        if(TextUtils.isEmpty(phone))
        {
            Toast.makeText(this,"Please enter your Phone number",Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(password))
        {
            Toast.makeText(this,"Please enter your password",Toast.LENGTH_LONG).show();
        }
        else  if (TextUtils.isEmpty(name))
        {
            Toast.makeText(this,"Please enter your name",Toast.LENGTH_LONG).show();
        }
        else {

        }

        LoadingBar.show();
        final DatabaseReference mRef;
        mRef = FirebaseDatabase.getInstance().getReference();
        mRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // check number that user entries is present in our database
                if (! snapshot.child("Users").child(phone).exists())
                {
                    //if the does not not exist we create new account in database
                    HashMap<String,Object> userdata = new  HashMap<>();
                    userdata.put("phone",phone);
                    userdata.put("password",password);
                    userdata.put("name",name);


                    mRef.child("Users").child(phone).updateChildren(userdata)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {

                                    if (task.isSuccessful())
                                    {
                                        LoadingBar.dismiss();
                                        Toast.makeText(RegisterActivity.this,"Registration Successful",Toast.LENGTH_LONG).show();
                                    }
                                    else
                                    {   LoadingBar.dismiss();
                                        Toast.makeText(RegisterActivity.this,"PLease Try After Sometime",Toast.LENGTH_LONG).show();
                                    }
                                }
                            });
                }
                else
                {   LoadingBar.dismiss();
                    Toast.makeText(RegisterActivity.this,"User with this number already exists",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}