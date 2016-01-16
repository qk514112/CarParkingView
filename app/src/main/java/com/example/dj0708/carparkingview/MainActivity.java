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
    private Button midLeftBtn;
    private Button midRightBtn;

    private Button forwardTurnLeftBtn;
    private Button forwardTurnRightBtn;
    private Button forwardMidLeftBtn;
    private Button forwardMidRightBtn;

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

    private ImageView backMidLeftOneImg;
    private ImageView backMidLeftTwoImg;
    private ImageView backMidLeftThreeImg;
    private ImageView backMidLeftFourImg;
    private ImageView backMidLeftFiveImg;
    private ImageView backMidLeftSixImg;
    private ImageView backMidLeftSevenImg;
    private ImageView backMidLeftEightImg;
    private ImageView backMidLeftNineImg;
    private ImageView backMidLeftTenImg;

    private ImageView backMidRightOneImg;
    private ImageView backMidRightTwoImg;
    private ImageView backMidRightThreeImg;
    private ImageView backMidRightFourImg;
    private ImageView backMidRightFiveImg;
    private ImageView backMidRightSixImg;
    private ImageView backMidRightSevenImg;
    private ImageView backMidRightEightImg;
    private ImageView backMidRightNineImg;
    private ImageView backMidRightTenImg;

    private ImageView backRightOneImg;
    private ImageView backRightTwoImg;
    private ImageView backRightThreeImg;
    private ImageView backRightFourImg;
    private ImageView backRightFiveImg;
    private ImageView backRightSixImg;
    private ImageView backRightSevenImg;
    private ImageView backRightEightImg;
    private ImageView backRightNineImg;
    private ImageView backRightTenImg;




    private ImageView forwardLeftOneImg;
    private ImageView forwardLeftTwoImg;
    private ImageView forwardLeftThreeImg;
    private ImageView forwardLeftFourImg;
    private ImageView forwardLeftFiveImg;
    private ImageView forwardLeftSixImg;
    private ImageView forwardLeftSevenImg;
    private ImageView forwardLeftEightImg;
    private ImageView forwardLeftNineImg;
    private ImageView forwardLeftTenImg;

    private ImageView forwardMidLeftOneImg;
    private ImageView forwardMidLeftTwoImg;
    private ImageView forwardMidLeftThreeImg;
    private ImageView forwardMidLeftFourImg;
    private ImageView forwardMidLeftFiveImg;
    private ImageView forwardMidLeftSixImg;
    private ImageView forwardMidLeftSevenImg;
    private ImageView forwardMidLeftEightImg;
    private ImageView forwardMidLeftNineImg;
    private ImageView forwardMidLeftTenImg;

    private ImageView forwardMidRightOneImg;
    private ImageView forwardMidRightTwoImg;
    private ImageView forwardMidRightThreeImg;
    private ImageView forwardMidRightFourImg;
    private ImageView forwardMidRightFiveImg;
    private ImageView forwardMidRightSixImg;
    private ImageView forwardMidRightSevenImg;
    private ImageView forwardMidRightEightImg;
    private ImageView forwardMidRightNineImg;
    private ImageView forwardMidRightTenImg;

    private ImageView forwardRightOneImg;
    private ImageView forwardRightTwoImg;
    private ImageView forwardRightThreeImg;
    private ImageView forwardRightFourImg;
    private ImageView forwardRightFiveImg;
    private ImageView forwardRightSixImg;
    private ImageView forwardRightSevenImg;
    private ImageView forwardRightEightImg;
    private ImageView forwardRightNineImg;
    private ImageView forwardRightTenImg;

    private int leftCount = 1;
    private int midLeftCount = 1;
    private int midRightCount = 1;
    private int rightCount = 1;

    private int forwardLeftCount = 1;
    private int forwardMidLeftCount = 1;
    private int forwardMidRightCount = 1;
    private int forwardRightCount = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mImageView = (ImageView)this.findViewById(R.id.car_park);
//        mImageView.setImageDrawable(getResources().getDrawable(R.drawable.car_park));

        turnLeftBtn = (Button)findViewById(R.id.turn_left);
        addTurnLeftListener();

        midRightBtn = (Button)findViewById(R.id.mid_right);
        addMidRightListener();

        midLeftBtn = (Button)findViewById(R.id.mid_left);
        addMidLeftListener();

        turnRightBtn = (Button)findViewById(R.id.turn_right);
        addTurnRightListener();

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

        backMidLeftOneImg = (ImageView)findViewById(R.id.back_mid_left_one);
        backMidLeftTwoImg = (ImageView)findViewById(R.id.back_mid_left_two);
        backMidLeftThreeImg = (ImageView)findViewById(R.id.back_mid_left_three);
        backMidLeftFourImg = (ImageView)findViewById(R.id.back_mid_left_four);
        backMidLeftFiveImg = (ImageView)findViewById(R.id.back_mid_left_five);
        backMidLeftSixImg = (ImageView)findViewById(R.id.back_mid_left_six);
        backMidLeftSevenImg = (ImageView)findViewById(R.id.back_mid_left_seven);
        backMidLeftEightImg = (ImageView)findViewById(R.id.back_mid_left_eight);
        backMidLeftNineImg = (ImageView)findViewById(R.id.back_mid_left_nine);
        backMidLeftTenImg = (ImageView)findViewById(R.id.back_mid_left_ten);

        backMidRightOneImg = (ImageView)findViewById(R.id.back_mid_right_one);
        backMidRightTwoImg = (ImageView)findViewById(R.id.back_mid_right_two);
        backMidRightThreeImg = (ImageView)findViewById(R.id.back_mid_right_three);
        backMidRightFourImg = (ImageView)findViewById(R.id.back_mid_right_four);
        backMidRightFiveImg = (ImageView)findViewById(R.id.back_mid_right_five);
        backMidRightSixImg = (ImageView)findViewById(R.id.back_mid_right_six);
        backMidRightSevenImg = (ImageView)findViewById(R.id.back_mid_right_seven);
        backMidRightEightImg = (ImageView)findViewById(R.id.back_mid_right_eight);
        backMidRightNineImg = (ImageView)findViewById(R.id.back_mid_right_nine);
        backMidRightTenImg = (ImageView)findViewById(R.id.back_mid_right_ten);

        backRightOneImg = (ImageView)findViewById(R.id.back_right_one);
        backRightTwoImg = (ImageView)findViewById(R.id.back_right_two);
        backRightThreeImg = (ImageView)findViewById(R.id.back_right_three);
        backRightFourImg = (ImageView)findViewById(R.id.back_right_four);
        backRightFiveImg = (ImageView)findViewById(R.id.back_right_five);
        backRightSixImg = (ImageView)findViewById(R.id.back_right_six);
        backRightSevenImg = (ImageView)findViewById(R.id.back_right_seven);
        backRightEightImg = (ImageView)findViewById(R.id.back_right_eight);
        backRightNineImg = (ImageView)findViewById(R.id.back_right_nine);
        backRightTenImg = (ImageView)findViewById(R.id.back_right_ten);



        forwardTurnLeftBtn = (Button)findViewById(R.id.forward_turn_left);
//        addForwardTurnLeftListener();

        forwardMidRightBtn = (Button)findViewById(R.id.forward_mid_right);
//        addForwardMidRightListener();

        forwardMidLeftBtn = (Button)findViewById(R.id.forward_mid_left);
//        addForwardMidLeftListener();

        forwardTurnRightBtn = (Button)findViewById(R.id.forward_turn_right);
//        addForwardTurnRightListener();

        forwardLeftOneImg = (ImageView)findViewById(R.id.forward_left_one);
        forwardLeftTwoImg = (ImageView)findViewById(R.id.forward_left_two);
        forwardLeftThreeImg = (ImageView)findViewById(R.id.forward_left_three);
        forwardLeftFourImg = (ImageView)findViewById(R.id.forward_left_four);
        forwardLeftFiveImg = (ImageView)findViewById(R.id.forward_left_five);
        forwardLeftSixImg = (ImageView)findViewById(R.id.forward_left_six);
        forwardLeftSevenImg = (ImageView)findViewById(R.id.forward_left_seven);
        forwardLeftEightImg = (ImageView)findViewById(R.id.forward_left_eight);
        forwardLeftNineImg = (ImageView)findViewById(R.id.forward_left_nine);
        forwardLeftTenImg = (ImageView)findViewById(R.id.forward_left_ten);

        backMidLeftOneImg = (ImageView)findViewById(R.id.back_mid_left_one);
        backMidLeftTwoImg = (ImageView)findViewById(R.id.back_mid_left_two);
        backMidLeftThreeImg = (ImageView)findViewById(R.id.back_mid_left_three);
        backMidLeftFourImg = (ImageView)findViewById(R.id.back_mid_left_four);
        backMidLeftFiveImg = (ImageView)findViewById(R.id.back_mid_left_five);
        backMidLeftSixImg = (ImageView)findViewById(R.id.back_mid_left_six);
        backMidLeftSevenImg = (ImageView)findViewById(R.id.back_mid_left_seven);
        backMidLeftEightImg = (ImageView)findViewById(R.id.back_mid_left_eight);
        backMidLeftNineImg = (ImageView)findViewById(R.id.back_mid_left_nine);
        backMidLeftTenImg = (ImageView)findViewById(R.id.back_mid_left_ten);

        backMidRightOneImg = (ImageView)findViewById(R.id.back_mid_right_one);
        backMidRightTwoImg = (ImageView)findViewById(R.id.back_mid_right_two);
        backMidRightThreeImg = (ImageView)findViewById(R.id.back_mid_right_three);
        backMidRightFourImg = (ImageView)findViewById(R.id.back_mid_right_four);
        backMidRightFiveImg = (ImageView)findViewById(R.id.back_mid_right_five);
        backMidRightSixImg = (ImageView)findViewById(R.id.back_mid_right_six);
        backMidRightSevenImg = (ImageView)findViewById(R.id.back_mid_right_seven);
        backMidRightEightImg = (ImageView)findViewById(R.id.back_mid_right_eight);
        backMidRightNineImg = (ImageView)findViewById(R.id.back_mid_right_nine);
        backMidRightTenImg = (ImageView)findViewById(R.id.back_mid_right_ten);

        backRightOneImg = (ImageView)findViewById(R.id.back_right_one);
        backRightTwoImg = (ImageView)findViewById(R.id.back_right_two);
        backRightThreeImg = (ImageView)findViewById(R.id.back_right_three);
        backRightFourImg = (ImageView)findViewById(R.id.back_right_four);
        backRightFiveImg = (ImageView)findViewById(R.id.back_right_five);
        backRightSixImg = (ImageView)findViewById(R.id.back_right_six);
        backRightSevenImg = (ImageView)findViewById(R.id.back_right_seven);
        backRightEightImg = (ImageView)findViewById(R.id.back_right_eight);
        backRightNineImg = (ImageView)findViewById(R.id.back_right_nine);
        backRightTenImg = (ImageView)findViewById(R.id.back_right_ten);
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
                backRightOneImg.setVisibility(View.INVISIBLE);
                backRightTwoImg.setVisibility(View.INVISIBLE);
                backRightThreeImg.setVisibility(View.INVISIBLE);
                backRightFourImg.setVisibility(View.INVISIBLE);
                backRightFiveImg.setVisibility(View.INVISIBLE);
                backRightSixImg.setVisibility(View.INVISIBLE);
                backRightSevenImg.setVisibility(View.INVISIBLE);
                backRightEightImg.setVisibility(View.INVISIBLE);
                backRightNineImg.setVisibility(View.INVISIBLE);
                backRightTenImg.setVisibility(View.INVISIBLE);

                switch (rightCount) {
                    case 1: {
                        backRightTwoImg.setVisibility(View.VISIBLE);
                        rightCount++;
                        break;
                    }
                    case 2: {
                        backRightThreeImg.setVisibility(View.VISIBLE);
                        rightCount++;
                        break;
                    }
                    case 3: {
                        backRightFourImg.setVisibility(View.VISIBLE);
                        rightCount++;
                        break;
                    }
                    case 4: {
                        backRightFiveImg.setVisibility(View.VISIBLE);
                        rightCount++;
                        break;
                    }
                    case 5: {
                        backRightSixImg.setVisibility(View.VISIBLE);
                        rightCount++;
                        break;
                    }
                    case 6: {
                        backRightSevenImg.setVisibility(View.VISIBLE);
                        rightCount++;
                        break;
                    }
                    case 7: {
                        backRightEightImg.setVisibility(View.VISIBLE);
                        rightCount++;
                        break;
                    }
                    case 8: {
                        backRightNineImg.setVisibility(View.VISIBLE);
                        rightCount++;
                        break;
                    }
                    case 9: {
                        backRightTenImg.setVisibility(View.VISIBLE);
                        rightCount++;
                        break;
                    }
                    case 10: {
                        backRightOneImg.setVisibility(View.VISIBLE);
                        rightCount = 1;
                        break;
                    }
                }
            }
        });
    }

    private void addMidLeftListener() {
        midLeftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backMidLeftOneImg.setVisibility(View.INVISIBLE);
                backMidLeftTwoImg.setVisibility(View.INVISIBLE);
                backMidLeftThreeImg.setVisibility(View.INVISIBLE);
                backMidLeftFourImg.setVisibility(View.INVISIBLE);
                backMidLeftFiveImg.setVisibility(View.INVISIBLE);
                backMidLeftSixImg.setVisibility(View.INVISIBLE);
                backMidLeftSevenImg.setVisibility(View.INVISIBLE);
                backMidLeftEightImg.setVisibility(View.INVISIBLE);
                backMidLeftNineImg.setVisibility(View.INVISIBLE);
                backMidLeftTenImg.setVisibility(View.INVISIBLE);

                switch (midLeftCount) {
                    case 1: {
                        backMidLeftTwoImg.setVisibility(View.VISIBLE);
                        midLeftCount++;
                        break;
                    }
                    case 2: {
                        backMidLeftThreeImg.setVisibility(View.VISIBLE);
                        midLeftCount++;
                        break;
                    }
                    case 3: {
                        backMidLeftFourImg.setVisibility(View.VISIBLE);
                        midLeftCount++;
                        break;
                    }
                    case 4: {
                        backMidLeftFiveImg.setVisibility(View.VISIBLE);
                        midLeftCount++;
                        break;
                    }
                    case 5: {
                        backMidLeftSixImg.setVisibility(View.VISIBLE);
                        midLeftCount++;
                        break;
                    }
                    case 6: {
                        backMidLeftSevenImg.setVisibility(View.VISIBLE);
                        midLeftCount++;
                        break;
                    }
                    case 7: {
                        backMidLeftEightImg.setVisibility(View.VISIBLE);
                        midLeftCount++;
                        break;
                    }
                    case 8: {
                        backMidLeftNineImg.setVisibility(View.VISIBLE);
                        midLeftCount++;
                        break;
                    }
                    case 9: {
                        backMidLeftTenImg.setVisibility(View.VISIBLE);
                        midLeftCount++;
                        break;
                    }
                    case 10: {
                        backMidLeftOneImg.setVisibility(View.VISIBLE);
                        midLeftCount = 1;
                        break;
                    }
                }
            }
        });
    }

    private void addMidRightListener() {
        midRightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backMidRightOneImg.setVisibility(View.INVISIBLE);
                backMidRightTwoImg.setVisibility(View.INVISIBLE);
                backMidRightThreeImg.setVisibility(View.INVISIBLE);
                backMidRightFourImg.setVisibility(View.INVISIBLE);
                backMidRightFiveImg.setVisibility(View.INVISIBLE);
                backMidRightSixImg.setVisibility(View.INVISIBLE);
                backMidRightSevenImg.setVisibility(View.INVISIBLE);
                backMidRightEightImg.setVisibility(View.INVISIBLE);
                backMidRightNineImg.setVisibility(View.INVISIBLE);
                backMidRightTenImg.setVisibility(View.INVISIBLE);

                switch (midRightCount) {
                    case 1: {
                        backMidRightTwoImg.setVisibility(View.VISIBLE);
                        midRightCount++;
                        break;
                    }
                    case 2: {
                        backMidRightThreeImg.setVisibility(View.VISIBLE);
                        midRightCount++;
                        break;
                    }
                    case 3: {
                        backMidRightFourImg.setVisibility(View.VISIBLE);
                        midRightCount++;
                        break;
                    }
                    case 4: {
                        backMidRightFiveImg.setVisibility(View.VISIBLE);
                        midRightCount++;
                        break;
                    }
                    case 5: {
                        backMidRightSixImg.setVisibility(View.VISIBLE);
                        midRightCount++;
                        break;
                    }
                    case 6: {
                        backMidRightSevenImg.setVisibility(View.VISIBLE);
                        midRightCount++;
                        break;
                    }
                    case 7: {
                        backMidRightEightImg.setVisibility(View.VISIBLE);
                        midRightCount++;
                        break;
                    }
                    case 8: {
                        backMidRightNineImg.setVisibility(View.VISIBLE);
                        midRightCount++;
                        break;
                    }
                    case 9: {
                        backMidRightTenImg.setVisibility(View.VISIBLE);
                        midRightCount++;
                        break;
                    }
                    case 10: {
                        backMidRightOneImg.setVisibility(View.VISIBLE);
                        midRightCount = 1;
                        break;
                    }
                }
            }
        });
    }
}
