package ht.AvantajPam.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CreateSecretCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_secret_code);

        Button btnOk = findViewById(R.id.btnOk);
        btnOk.setOnClickListener(view -> onButtonNextAction());
    }
    private void onButtonNextAction () {
        startActivity(new Intent(this, SecretCodeVerificationActivity.class));
    }
}