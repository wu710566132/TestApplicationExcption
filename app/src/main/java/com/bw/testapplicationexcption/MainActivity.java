package com.bw.testapplicationexcption;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView tv;
    /*private TextView textView2;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*tv = (TextView) findViewById(R.id.tv);*/
        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*baocuo();*/
                tv.setText("");
            }
        });

}

    private void baocuo(){
        tv = null;
        tv.setText("倒萨");
    }

}
