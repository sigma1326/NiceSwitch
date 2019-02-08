package com.sigma.niceswitchsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.Toast;

import com.sigma.niceswitch.NiceSwitch;
import com.sigma.niceswitchsample.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NiceSwitch niceSwitch = findViewById(R.id.niceSwitch);


        niceSwitch.setOnCheckedChangedListener(checked -> {
            Toast.makeText(this, checked + "", Toast.LENGTH_SHORT).show();
        });
    }
}
