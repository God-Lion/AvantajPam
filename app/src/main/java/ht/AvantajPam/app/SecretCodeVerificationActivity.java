package ht.AvantajPam.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecretCodeVerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret_code_verification);

        Button btnOk = findViewById(R.id.btnOk);
        btnOk.setOnClickListener(view -> onButtonNextAction());
    }
    private void onButtonNextAction () {
        startActivity(new Intent(this, HomeActivity.class));
    }
}