package com.example.gpio_sample;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import static java.sql.Types.NULL;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    GpioTest gt = new GpioTest(this);

    public void btnClick_get_gpio_number(View view) {
        Log.d(TAG, "----------");
        Integer number = gt.gpioGetNumber();
        Toast.makeText(this, "get gpio number : " + number, Toast.LENGTH_SHORT).show();
        Log.d(TAG, "----------");
    }

    public void btnClick_gpio0_write_low(View view) {
        Log.d(TAG, "----------");
        Toast.makeText(this, "set gpio0 to low", Toast.LENGTH_SHORT).show();
        gt.gpioDirection(0,1, 0);
        Log.d(TAG, "----------");
    }

    public void btnClick_gpio0_write_high(View view) {
        Log.d(TAG, "----------");
        Toast.makeText(this, "set gpio0 to high", Toast.LENGTH_SHORT).show();
        gt.gpioDirection(0,1, 1);
        Log.d(TAG, "----------");
    }

    public void btnClick_gpio1_write_low(View view) {
        Log.d(TAG, "----------");
        Toast.makeText(this, "set gpio1 to low", Toast.LENGTH_SHORT).show();
        gt.gpioDirection(1,1, 0);
        Log.d(TAG, "----------");
    }

    public void btnClick_gpio1_write_high(View view) {
        Log.d(TAG, "----------");
        Toast.makeText(this, "set gpio1 to high", Toast.LENGTH_SHORT).show();
        gt.gpioDirection(1,1, 1);
        Log.d(TAG, "----------");
    }

    public void btnClick_gpio0_read(View view) {
        Log.d(TAG, "----------");
        //gt.gpioDirection(0,0,0);
        Integer number = gt.gpioRead(0);
        Toast.makeText(this, "get gpio(0) value : " + number, Toast.LENGTH_SHORT).show();
        Log.d(TAG, "----------");
    }

    public void btnClick_gpio1_read(View view) {
        Log.d(TAG, "----------");
        Integer number = gt.gpioRead(1);
        Toast.makeText(this, "get gpio(1) value : " + number, Toast.LENGTH_SHORT).show();
        Log.d(TAG, "----------");
    }

    public void btnClick_door_gpio_reg(View view) {
        Log.d(TAG, "----------");
        gt.gpioRegKeyEvent(9);
        Toast.makeText(this, "door reg" , Toast.LENGTH_SHORT).show();
        Log.d(TAG, "----------");
    }

    public void btnClick_door_gpio_unreg(View view) {
        Log.d(TAG, "----------");
        gt.gpioUnregKeyEvent(9);
        Toast.makeText(this, "door unreg" , Toast.LENGTH_SHORT).show();
        Log.d(TAG, "----------");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}