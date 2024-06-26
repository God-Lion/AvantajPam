package ht.AvantajPam.app;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner countryCodeSpinner = findViewById(R.id.country_code_spinner);
        String[] countryCodeArray = this.getResources().getStringArray(R.array.country_codes);
        ArrayList<String> countryCodes = new ArrayList<>();
        Collections.addAll(countryCodes, countryCodeArray);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, countryCodes);
        countryCodeSpinner.setAdapter(adapter);
        countryCodeSpinner.setSelection(0);
        Button BtnConnection = findViewById(R.id.BtnConnection);
        BtnConnection.setOnClickListener(view -> onButtonNextAction());
    }

    private void onButtonNextAction () {
        startActivity(new Intent(this, TermsAndConditionsActivity.class));
    }
}
