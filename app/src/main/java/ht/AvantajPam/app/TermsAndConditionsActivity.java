package ht.AvantajPam.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TermsAndConditionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_conditions);
        Button btnContinue = findViewById(R.id.btnContinue);
        btnContinue.setOnClickListener(view -> onButtonNextAction());
    }
    private void onButtonNextAction () {
        startActivity(new Intent(this, IsSponsorshipCodeActivity.class));
    }
}
