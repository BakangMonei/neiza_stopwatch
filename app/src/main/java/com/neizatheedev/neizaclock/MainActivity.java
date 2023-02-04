package com.neizatheedev.neizaclock;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView splashImageView = (ImageView) findViewById(R.id.splashImageView);
        TextView splashTextView = (TextView) findViewById(R.id.splashTextView);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, IndexActivity.class);
                Toast.makeText(MainActivity.this, "Hello User", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            }
        },3000);
    }
}