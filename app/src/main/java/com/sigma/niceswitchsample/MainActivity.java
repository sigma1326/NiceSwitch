package com.sigma.niceswitchsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.Toast;

import com.sigma.niceswitch.NiceSwitch;
import com.sigma.niceswitch.NiceSwitchRound;
import com.sigma.niceswitchsample.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NiceSwitch niceSwitch = findViewById(R.id.niceSwitch);
        NiceSwitchRound niceSwitchRound = findViewById(R.id.niceSwitchRound);

        niceSwitch.setOnCheckedChangedListener(checked -> {
            Toast.makeText(this, checked + "", Toast.LENGTH_SHORT).show();
        });

        niceSwitch.setChecked(false);
        niceSwitchRound.setChecked(false);
    }
}
