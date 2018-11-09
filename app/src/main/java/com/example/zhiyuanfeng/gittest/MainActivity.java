package com.example.zhiyuanfeng.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void newMethod(){
        Log.d(TAG, "newMethod: "+"这是新方法");
        Log.d(TAG, "newMethod: "+"创建Jim分支");
        Log.d(TAG, "newMethod: "+"创建rick分支");
        Log.d(TAG, "newMethod: "+"合并");
    }
}
