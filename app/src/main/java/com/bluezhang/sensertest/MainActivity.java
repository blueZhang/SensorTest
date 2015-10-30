package com.bluezhang.sensertest;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * 列举手机中所有的传感器 所有的床干起都是由sensorManager获取
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SensorManager manager =
                (SensorManager)getSystemService(SENSOR_SERVICE);
        //1、获取所有的传感器
        List<Sensor> list = manager.getSensorList(Sensor.TYPE_ALL);

        //主要就是描述没法设置 主要就是看看
        for (Sensor sensor  : list) {

        }



    }


}
