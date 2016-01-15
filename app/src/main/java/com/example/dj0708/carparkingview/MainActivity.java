package com.example.dj0708.carparkingview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
    private ImageView mImageView;
    private Button turnLeftBtn;
    private Button turnRightBtn;
    private Button forwardBtn;
    private Button backBtn;

    private ImageView backLeftOneImg;
    private ImageView backLeftTwoImg;
    private ImageView backLeftThreeImg;
    private ImageView backLeftFourImg;
    private ImageView backLeftFiveImg;
    private ImageView backLeftSixImg;
    private ImageView backLeftSevenImg;
    private ImageView backLeftEightImg;
    private ImageView backLeftNineImg;
    private ImageView backLeftTenImg;

    private int leftCount = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mImageView = (ImageView)this.findViewById(R.id.car_park);
//        mImageView.setImageDrawable(getResources().getDrawable(R.drawable.car_park));

        turnLeftBtn = (Button)findViewById(R.id.turn_left);
        addTurnLeftListener();

        turnRightBtn = (Button)findViewById(R.id.turn_right);
        addTurnRightListener();

        forwardBtn = (Button)findViewById(R.id.forward);
        addForwardListener();

        backBtn = (Button)findViewById(R.id.back);
        addBackListener();

        backLeftOneImg = (ImageView)findViewById(R.id.back_left_one);
        backLeftTwoImg = (ImageView)findViewById(R.id.back_left_two);
        backLeftThreeImg = (ImageView)findViewById(R.id.back_left_three);
        backLeftFourImg = (ImageView)findViewById(R.id.back_left_four);
        backLeftFiveImg = (ImageView)findViewById(R.id.back_left_five);
        backLeftSixImg = (ImageView)findViewById(R.id.back_left_six);
        backLeftSevenImg = (ImageView)findViewById(R.id.back_left_seven);
        backLeftEightImg = (ImageView)findViewById(R.id.back_left_eight);
        backLeftNineImg = (ImageView)findViewById(R.id.back_left_nine);
        backLeftTenImg = (ImageView)findViewById(R.id.back_left_ten);
    }

    private void addTurnLeftListener() {
        turnLeftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backLeftOneImg.setVisibility(View.INVISIBLE);
                backLeftTwoImg.setVisibility(View.INVISIBLE);
                backLeftThreeImg.setVisibility(View.INVISIBLE);
                backLeftFourImg.setVisibility(View.INVISIBLE);
                backLeftFiveImg.setVisibility(View.INVISIBLE);
                backLeftSixImg.setVisibility(View.INVISIBLE);
                backLeftSevenImg.setVisibility(View.INVISIBLE);
                backLeftEightImg.setVisibility(View.INVISIBLE);
                backLeftNineImg.setVisibility(View.INVISIBLE);
                backLeftTenImg.setVisibility(View.INVISIBLE);

                switch (leftCount) {
                    case 1: {
                        backLeftTwoImg.setVisibility(View.VISIBLE);
                        leftCount++;
                        break;
                    }
                    case 2: {
                        backLeftThreeImg.setVisibility(View.VISIBLE);
                        leftCount++;
                        break;
                    }
                    case 3: {
                        backLeftFourImg.setVisibility(View.VISIBLE);
                        leftCount++;
                        break;
                    }
                    case 4: {
                        backLeftFiveImg.setVisibility(View.VISIBLE);
                        leftCount++;
                        break;
                    }
                    case 5: {
                        backLeftSixImg.setVisibility(View.VISIBLE);
                        leftCount++;
                        break;
                    }
                    case 6: {
                        backLeftSevenImg.setVisibility(View.VISIBLE);
                        leftCount++;
                        break;
                    }
                    case 7: {
                        backLeftEightImg.setVisibility(View.VISIBLE);
                        leftCount++;
                        break;
                    }
                    case 8: {
                        backLeftNineImg.setVisibility(View.VISIBLE);
                        leftCount++;
                        break;
                    }
                    case 9: {
                        backLeftTenImg.setVisibility(View.VISIBLE);
                        leftCount++;
                        break;
                    }
                    case 10: {
                        backLeftOneImg.setVisibility(View.VISIBLE);
                        leftCount = 1;
                        break;
                    }
                }
            }
        });
    }

    private void addTurnRightListener() {
        turnRightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backLeftNineImg.setVisibility(View.INVISIBLE);
                backLeftFourImg.setVisibility(View.VISIBLE);
            }
        });
    }

    private void addForwardListener() {
        forwardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });
    }

    private void addBackListener() {
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });
    }
}
