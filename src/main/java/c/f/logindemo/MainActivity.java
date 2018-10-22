package c.f.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login(View view){

        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        EditText usernameEditText = (EditText) findViewById(R.id.userNameEditText);

        Log.i("İnfo" ,"Button pressed!!");
        Log.i("Username" , usernameEditText.getText().toString());
        Log.i("Password" , passwordEditText.getText().toString());
        Toast.makeText(this, "welcome to matrix!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
