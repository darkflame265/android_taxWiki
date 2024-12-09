package com.example.my_semester_homework;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //뒤로가기 버튼 생성
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            //뒤로가기 버튼 눌렀을 때, 발동.
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }


    public void onClickSource(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        if(view.getId() == R.id.sourceAuthor0) {
            intent.setData(Uri.parse("https://www.flaticon.com/kr/authors/flowicon"));
        } else if(view.getId() == R.id.sourceAuthor1 || view.getId() == R.id.sourceAuthor2 ||
                view.getId() == R.id.sourceAuthor3 || view.getId() == R.id.sourceAuthor4 ||
                view.getId() == R.id.sourceAuthor5 || view.getId() == R.id.sourceAuthor6 ||
                view.getId() == R.id.sourceAuthor7 || view.getId() == R.id.sourceAuthor8) {
            intent.setData(Uri.parse("https://icons8.com"));
        } else if(view.getId() == R.id.source0) {
            intent.setData(Uri.parse("https://www.flaticon.com/kr/free-icon/irs_10918105"));
        } else if(view.getId() == R.id.source1) {
            intent.setData(Uri.parse("https://icons8.com/icon/24836/euro-money"));
        } else if(view.getId() == R.id.source2) {
            intent.setData(Uri.parse("https://icons8.com/icon/25317/business-building"));
        } else if(view.getId() == R.id.source3) {
            intent.setData(Uri.parse("https://icons8.com/icon/76948/cash"));
        } else if(view.getId() == R.id.source4) {
            intent.setData(Uri.parse("https://icons8.com/icon/164/down"));
        } else if(view.getId() == R.id.source5) {
            intent.setData(Uri.parse("https://icons8.com/icon/25994/property"));
        } else if(view.getId() == R.id.source6) {
            intent.setData(Uri.parse("https://icons8.com/icon/12666/car"));
        } else if(view.getId() == R.id.source7) {
            intent.setData(Uri.parse("https://icons8.com/icon/9671/shopping-cart"));
        } else if(view.getId() == R.id.source8) {
            intent.setData(Uri.parse("https://icons8.com/icon/xMc8jgZMX7FZ/test-results"));
        }
        if (intent != null)
            startActivity(intent);
    }
}
