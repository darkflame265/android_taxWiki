package com.example.my_semester_homework;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // id가 'home'인 뒤로가기 버튼 생성(android.R.id.home)
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_top, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if (item.getItemId() == android.R.id.home) {
//            //뒤로가기 버튼 눌렀을 때, 발동.
//            onBackPressed();
//        } else

        if (item.getItemId() == R.id.goSource) {
            Intent intent = null;
            intent = new Intent(MainActivity.this, SourceActivity.class);

            if (intent != null)
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        Intent intent = null;

        if(view.getId() == R.id.button1) {
            intent = new Intent(MainActivity.this, SubActivity1.class);
        } else if (view.getId() == R.id.button2) {
            intent = new Intent(MainActivity.this, SubActivity2.class);
        } else if (view.getId() == R.id.button3) {
            intent = new Intent(MainActivity.this, SubActivity3.class);
        } else if (view.getId() == R.id.button4) {
            intent = new Intent(MainActivity.this, SubActivity4.class);
        } else if (view.getId() == R.id.button5) {
            intent = new Intent(MainActivity.this, SubActivity5.class);
        } else if (view.getId() == R.id.button6) {
            intent = new Intent(MainActivity.this, SubActivity6.class);
        } else if (view.getId() == R.id.button7) {
            intent = new Intent(MainActivity.this, SubActivity7.class);
        } else if (view.getId() == R.id.button8) {
            intent = new Intent(MainActivity.this, SubActivity8.class);
            //intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hometax.go.kr/"));
        }
        if (intent != null)
            startActivity(intent);
    }
}