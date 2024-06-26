package ht.AvantajPam.app;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import ht.AvantajPam.app.fragment.ButtonNumberPad;

public class SecretCodeVerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret_code_verification);

        Log.d("DEBUG", getResources().getConfiguration().orientation + "");
        if (savedInstanceState == null) {
            ButtonNumberPad firstFragment = new ButtonNumberPad();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.fragment_container_view, firstFragment);
            ft.commit();
        }
    }
    private void onButtonNextAction () {
        startActivity(new Intent(this, HomeActivity.class));
    }
}