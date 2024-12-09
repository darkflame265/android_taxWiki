package com.example.my_semester_homework;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class SubActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

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




    public void onClick(View view) {
        if(view.getId() == R.id.expandDiv1) {
            View v1 = (View) findViewById(R.id.layout_expand1);
            ImageView arrow1 = (ImageView) findViewById(R.id.down_arrow1);
            if (v1.getVisibility() == View.GONE)
            {
                v1.setVisibility(View.VISIBLE);
                arrow1.animate().setDuration(200).rotation(180f);
            }
            else
            {
                v1.setVisibility(View.GONE);
                arrow1.animate().setDuration(200).rotation(0f);
            }
        }

        if(view.getId() == R.id.expandDiv2) {
            View v2 = (View) findViewById(R.id.layout_expand2);
            ImageView arrow2 = (ImageView) findViewById(R.id.down_arrow2);
            ScrollView scroll1 = findViewById(R.id.scrollView1);
            if (v2.getVisibility() == View.GONE)
            {
                v2.setVisibility(View.VISIBLE);
                arrow2.animate().setDuration(200).rotation(180f);
                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        scroll1.fullScroll(ScrollView.FOCUS_DOWN);
                        scroll1.invalidate();
                    }
                }, 400);// 0.4초 정도 딜레이를 준 후 시작
            }
            else
            {
                v2.setVisibility(View.GONE);
                arrow2.animate().setDuration(200).rotation(0f);
            }
        }

        if(view.getId() == R.id.expandDiv3) {
            View v3 = (View) findViewById(R.id.layout_expand3);
            ImageView arrow3 = (ImageView) findViewById(R.id.down_arrow3);
            ScrollView scroll1 = findViewById(R.id.scrollView1);
            if (v3.getVisibility() == View.GONE)
            {
                v3.setVisibility(View.VISIBLE);
                arrow3.animate().setDuration(200).rotation(180f);
                new Handler().postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        scroll1.fullScroll(ScrollView.FOCUS_DOWN);
                        scroll1.invalidate();
                    }
                }, 400);// 0.4초 정도 딜레이를 준 후 시작
            }
            else
            {
                v3.setVisibility(View.GONE);
                arrow3.animate().setDuration(200).rotation(0f);
            }
        }
    }
}
