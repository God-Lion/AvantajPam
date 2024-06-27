package ht.AvantajPam.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AddSponsorshipCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_sponsorship_code);
        Button btnContinue = findViewById(R.id.btnContinue);
        btnContinue.setOnClickListener(view -> onButtonNextAction());

    }

    private void onButtonNextAction () {
        startActivity(new Intent(this, SMSVerificationActivity.class));
    }

}