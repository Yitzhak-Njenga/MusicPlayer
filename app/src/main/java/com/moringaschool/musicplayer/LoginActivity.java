package com.moringaschool.musicplayer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class LoginActivity extends AppCompatActivity {

    EditText LoginPhone,LoginPassword;
    Button LoginButton;
    String Phone,Password; // to store phone and store password that user enters
    String userPassword; // to store actual password from database

    ProgressDialog LoadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LoadingBar = new ProgressDialog(this);
        LoginPhone = (EditText)findViewById(R.id.login_number);
        LoginPassword =(EditText)findViewById(R.id.login_password);
        LoginButton =(Button)findViewById(R.id.login_btn);

        LoadingBar.setTitle("Login Account");
        LoadingBar.setMessage("Please wait we are checking credentials in your in our database");
        LoadingBar.setCanceledOnTouchOutside(false);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Phone = LoginPhone.getText().toString();
                Password = LoginPassword.getText().toString();
                LoginAccount(Phone,Password);

            }
        });


    }

    private void LoginAccount(String phone, String password) {

        if(TextUtils.isEmpty(phone))
        {
            Toast.makeText(this,"Please Enter you phone number",Toast.LENGTH_LONG).show();
        }
        else if (TextUtils.isEmpty(password))
        {
            Toast.makeText(this,"PLease enter you password",Toast.LENGTH_LONG).show();
        }
        else
        {
            LoadingBar.show();

            final DatabaseReference mRef;

            mRef = FirebaseDatabase.getInstance().getReference();

            mRef.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    if (snapshot.child("Users").child(Phone).exists())
                    {
                        userPassword = snapshot.child("Users").child(Phone).child("password").getValue().toString();

                        if (Password.equals(userPassword))
                        {
                            //if the users  credentials are correct, will be directed on home activity
                            LoadingBar.dismiss();
                            Intent intent = new Intent(LoginActivity.this,AlbumLibrary.class);
                            startActivity(intent);


                        }
                        else
                        {   /// Checking if user the password is correct
                            LoadingBar.dismiss();
                            Toast.makeText(LoginActivity.this,"Please enter the correct password",Toast.LENGTH_LONG).show();

                        }
                    }
                    else
                    {
                        // Checking if the user is existing
                        LoadingBar.dismiss();
                        Toast.makeText(LoginActivity.this,"User with this number does not exist",Toast.LENGTH_LONG).show();
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }


    }

}