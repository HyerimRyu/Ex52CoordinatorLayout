package kr.co.teada.ex52coordinatorlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.
        Toolbar toolbar=findViewById(R.id.toolbar); //서포트버전 주의
        setSupportActionBar(toolbar);
    }
}

