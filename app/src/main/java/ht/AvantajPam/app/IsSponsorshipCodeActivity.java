package ht.AvantajPam.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IsSponsorshipCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is_sponsorship_code);

        Button btnYesAddCode = findViewById(R.id.btnYesAddCode);
        btnYesAddCode.setOnClickListener(view -> onButtonYesNextAction());

        Button btnNoContinue = findViewById(R.id.btnNoContinue);
        btnNoContinue.setOnClickListener(view -> onButtonNoNextAction());

    }
    private void onButtonYesNextAction () {
        startActivity(new Intent(this, AddSponsorshipCodeActivity.class));
    }

    private void onButtonNoNextAction () {
        startActivity(new Intent(this, SMSVerificationActivity.class));
    }
}