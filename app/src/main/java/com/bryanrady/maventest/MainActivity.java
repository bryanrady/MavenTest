package com.bryanrady.maventest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bryanrady.library_nexus.NexusTestUtil;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //snapshot 命令刷新依赖缓存
        //windows gradlew build --refresh-dependencies
        //mac ./gradlew build --refresh-dependencies
        NexusTestUtil.testNexusAar();
        NexusTestUtil.testNexusRefresh();


    }
}