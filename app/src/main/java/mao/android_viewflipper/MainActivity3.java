package mao.android_viewflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ViewFlipper viewFlipper = findViewById(R.id.ViewFlipper);

        viewFlipper.setInAnimation(this, R.anim.right_in);
        viewFlipper.setOutAnimation(this, R.anim.right_out);

        View view1 = LayoutInflater.from(this).inflate(R.layout.item_1,null);
        View view2 = LayoutInflater.from(this).inflate(R.layout.item_2,null);
        View view3 = LayoutInflater.from(this).inflate(R.layout.item_3,null);
        View view4 = LayoutInflater.from(this).inflate(R.layout.item_4,null);
        View view5 = LayoutInflater.from(this).inflate(R.layout.item_5,null);

        viewFlipper.setFlipInterval(2000);
        viewFlipper.addView(view1);
        viewFlipper.addView(view2);
        viewFlipper.addView(view3);
        viewFlipper.addView(view4);
        viewFlipper.addView(view5);
        viewFlipper.startFlipping();

    }
}