package com.example.techrappandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.os.Bundle;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button headsetsbutton;
    Button micebutton;
    Button keyboardbutton;
    Button motherboardbutton;
    Button cpubutton;
    Button gpubutton;
    Button psubutton;
    Button ssdhddbutton;
    Button acessoriesbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        keyboardbutton = findViewById(R.id.keyboardbutton);
        headsetsbutton = findViewById(R.id.headsetsbutton);
        micebutton = findViewById(R.id.micebutton);
        motherboardbutton = findViewById(R.id.motherboardbutton);
        cpubutton = findViewById(R.id.cpubutton);
        gpubutton = findViewById(R.id.gpubutton);
        psubutton = findViewById(R.id.psubutton);
        ssdhddbutton = findViewById(R.id.ssdhddbutton);
        acessoriesbutton = findViewById(R.id.acessoriesbutton);

        keyboardbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTokeyboardpage();
            }
        });
        micebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTomicepage();
            }
        });
    }
    public void goTokeyboardpage() {

        Intent Tokeyboardpage = new Intent(this, keyboardpage.class);
        startActivity(Tokeyboardpage);
    }
    public void goTomicepage() {
        Intent Tomicepage = new Intent(this, micepage.class);
        startActivity(Tomicepage);
    }
}