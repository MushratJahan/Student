package com.example.urms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.urms.ui.home.HomeFragment;

public class LogInPage extends AppCompatActivity {
    TextView StudentID, IdPassword;
    EditText ID;
    EditText Password;
    Button Login, CreateNewAccount, ForgotPassword;
    DBHelper DB;
    private Object View;
    private View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        StudentID = (TextView) findViewById(R.id.student_ID);
        ID = (EditText) findViewById(R.id.studentID);
        IdPassword = (TextView) findViewById(R.id.Id_password);
        Password = (EditText) findViewById(R.id.password);
        CreateNewAccount = (Button) findViewById(R.id.crateNew_account);
        Login = (Button) findViewById(R.id.logIN);
        ForgotPassword = (Button) findViewById(R.id.forgot_password);
        DB = new DBHelper(this);


        Bundle bundle = getIntent().getExtras();
        String id = bundle.getString("ID");
        String password = bundle.getString("Password");


        final String S_id = ID.getText().toString();
        final String S_password = Password.getText().toString();


    }
    public void buttonClicked (View view){

        if (view.getId() == R.id.crateNew_account) {

            Intent intent = new Intent(LogInPage.this, CreateNewAccount.class);
            startActivity(intent);
        } else if (view.getId() == R.id.logIN) {


            Intent intent = new Intent(LogInPage.this, HomeFragment.class);
            startActivity(intent);
        } else if (view.getId() == R.id.forgot_password) {
            Intent intent = new Intent(LogInPage.this, Forgot_Password.class);
            startActivity(intent);
        }

    }


}
