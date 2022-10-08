package mao.android_viewflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ViewFlipper;

public class MainActivity2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ViewFlipper viewFlipper = findViewById(R.id.ViewFlipper);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.startFlipping();
    }
}