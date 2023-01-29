package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Use private when create available in MainActivity
    private Button btnClickMe;
    private TextView tvName;

    //Sự khác nhau int >< Integer
    int position = 0; //Kiểu số nguyên, không có trường hợp null=không có gì
    Integer index = null; //Có trường hợp null, rất dễ xảy ra crash khi sử dụng

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link biến đến button ở giao diện xml
        btnClickMe = findViewById(R.id.btnClickMe);

        //Link biến đến textView ở giao diện xml
        tvName = findViewById(R.id.tvName);

        //1 button - nút bấm, sự kiện bấm
        btnClickMe.setOnClickListener(view -> {
            //Khi bấm button, set tên vào textView
            //Khi bấm sẽ sử lý sự kiện
            //Set text để ghi dữ liệu vào textView

            //Mỗi lần bấm tăng position lên một đơn vị
//            position++;
            //index = index + 1;
            //Khi biến float, double, int + với string -> kết quả trả về string
//            tvName.setText("Lần bấm thứ : " + position);
//            tvName.setText("Lần bấm thứ : " + position);

            //Xem các lỗi ở logcat

            //Bấm button mở ra màn hình số 2
            //Cần intent
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        });


    }
}