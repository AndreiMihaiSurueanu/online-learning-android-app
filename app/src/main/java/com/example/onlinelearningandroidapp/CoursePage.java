package com.example.onlinelearningandroidapp;

import androidx.appcompat.app.AppCompatActivity;

public class CoursePage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        call.enqueue(new Callback<List<Course>>() {
            @Override
            public void onResponse(Call<List<Course>> call, Response<List<Course>> response) {
            }

            @Override
            public void onFailure(Call<List<Course>> call, Throwable t) {
                Toast.makeText(CoursePage.this, "No response from server", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
