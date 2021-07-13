package com.example.simplecalci;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public abstract class MainActivity2 extends AppCompatActivity implements OnClickListener {

    private CardView card_1, card_2, card_3, card_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        card_1 = (CardView) findViewById(R.id.add_card);
        card_2 = (CardView) findViewById(R.id.sub_card);
        card_3 = (CardView) findViewById(R.id.mul_card);
        card_4 = (CardView) findViewById(R.id.div_card);

        card_1.setOnClickListener(this);
        card_2.setOnClickListener(this);
        card_3.setOnClickListener(this);
        card_4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent i;

        switch (v.getId())
        {
            case R.id.add_card:
                i = new Intent(this, addition.class);
                startActivity(i);
                break;

            case R.id.sub_card:
                i = new Intent(this, subtraction.class);
                startActivity(i);
                break;

            case R.id.mul_card:
                i = new Intent(this, multiplication.class);
                startActivity(i);
                break;

            case R.id.div_card:
                i = new Intent(this, division.class);
                startActivity(i);
                break;

        }

    }


}