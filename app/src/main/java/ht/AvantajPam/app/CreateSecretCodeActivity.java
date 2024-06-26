package ht.AvantajPam.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import ht.AvantajPam.app.fragment.ButtonNumberPad;
import ht.AvantajPam.app.fragment.NumberPadListener;

public class CreateSecretCodeActivity extends AppCompatActivity implements NumberPadListener {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_secret_code);

        Log.d("DEBUG", getResources().getConfiguration().orientation + "");
        if (savedInstanceState == null) {
            ButtonNumberPad firstFragment = new ButtonNumberPad();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.fragment_container_view, firstFragment);
            ft.commit();
        }
    }

    public void onNumberClicked(String number) {
        Log.i("CreateSecretCodeActivity", "Number clicked: " + number);
        if (number.equals("ok"))
            startActivity(new Intent(this, SecretCodeVerificationActivity.class));
    }
}