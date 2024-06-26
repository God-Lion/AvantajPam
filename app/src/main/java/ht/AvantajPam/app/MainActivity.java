package ht.AvantajPam.app;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner countryCodeSpinner = findViewById(R.id.country_code_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.country_codes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        countryCodeSpinner.setAdapter(adapter);
        Button BtnConnection = findViewById(R.id.BtnConnection);
        BtnConnection.setOnClickListener(view -> onAddNewFlashCard());
    }

    private void onAddNewFlashCard () {
        startActivity(new Intent(this, TermsAndConditionsActivity.class));
//        overridePendingTransition(R.anim.right_in, R.anim.left_out);
    }
}
