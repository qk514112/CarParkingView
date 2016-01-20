package com.example.dj0708.carparkingview;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
    private Button turnLeftBtn;
    private Button turnRightBtn;
    private Button midLeftBtn;
    private Button midRightBtn;
    private Button radianBtn;

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

    private ImageView leftRadian_40;
    private ImageView midRadian;
    private ImageView rightRadian_40;

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
    private int radianCount = 1;

    private int forwardLeftCount = 1;
    private int forwardMidLeftCount = 1;
    private int forwardMidRightCount = 1;
    private int forwardRightCount = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        turnLeftBtn = (Button)findViewById(R.id.turn_left);
        addTurnLeftListener();

        midRightBtn = (Button)findViewById(R.id.mid_right);
        addMidRightListener();

        midLeftBtn = (Button)findViewById(R.id.mid_left);
        addMidLeftListener();

        turnRightBtn = (Button)findViewById(R.id.turn_right);
        addTurnRightListener();

        radianBtn = (Button)findViewById(R.id.radian_btn);
        addMidRadianListener();

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

        leftRadian_40 = (ImageView)findViewById(R.id.left_radian_40);
        midRadian = (ImageView)findViewById(R.id.mid_radian);
        rightRadian_40 = (ImageView)findViewById(R.id.right_radian_40);

        forwardTurnLeftBtn = (Button)findViewById(R.id.forward_turn_left);
        addForwardTurnLeftListener();

        forwardMidRightBtn = (Button)findViewById(R.id.forward_mid_right);
        addForwardMidRightListener();

        forwardMidLeftBtn = (Button)findViewById(R.id.forward_mid_left);
        addForwardMidLeftListener();

        forwardTurnRightBtn = (Button)findViewById(R.id.forward_turn_right);
        addForwardTurnRightListener();

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

        forwardMidLeftOneImg = (ImageView)findViewById(R.id.forward_mid_left_one);
        forwardMidLeftTwoImg = (ImageView)findViewById(R.id.forward_mid_left_two);
        forwardMidLeftThreeImg = (ImageView)findViewById(R.id.forward_mid_left_three);
        forwardMidLeftFourImg = (ImageView)findViewById(R.id.forward_mid_left_four);
        forwardMidLeftFiveImg = (ImageView)findViewById(R.id.forward_mid_left_five);
        forwardMidLeftSixImg = (ImageView)findViewById(R.id.forward_mid_left_six);
        forwardMidLeftSevenImg = (ImageView)findViewById(R.id.forward_mid_left_seven);
        forwardMidLeftEightImg = (ImageView)findViewById(R.id.forward_mid_left_eight);
        forwardMidLeftNineImg = (ImageView)findViewById(R.id.forward_mid_left_nine);
        forwardMidLeftTenImg = (ImageView)findViewById(R.id.forward_mid_left_ten);

        forwardMidRightOneImg = (ImageView)findViewById(R.id.forward_mid_right_one);
        forwardMidRightTwoImg = (ImageView)findViewById(R.id.forward_mid_right_two);
        forwardMidRightThreeImg = (ImageView)findViewById(R.id.forward_mid_right_three);
        forwardMidRightFourImg = (ImageView)findViewById(R.id.forward_mid_right_four);
        forwardMidRightFiveImg = (ImageView)findViewById(R.id.forward_mid_right_five);
        forwardMidRightSixImg = (ImageView)findViewById(R.id.forward_mid_right_six);
        forwardMidRightSevenImg = (ImageView)findViewById(R.id.forward_mid_right_seven);
        forwardMidRightEightImg = (ImageView)findViewById(R.id.forward_mid_right_eight);
        forwardMidRightNineImg = (ImageView)findViewById(R.id.forward_mid_right_nine);
        forwardMidRightTenImg = (ImageView)findViewById(R.id.forward_mid_right_ten);

        forwardRightOneImg = (ImageView)findViewById(R.id.forward_right_one);
        forwardRightTwoImg = (ImageView)findViewById(R.id.forward_right_two);
        forwardRightThreeImg = (ImageView)findViewById(R.id.forward_right_three);
        forwardRightFourImg = (ImageView)findViewById(R.id.forward_right_four);
        forwardRightFiveImg = (ImageView)findViewById(R.id.forward_right_five);
        forwardRightSixImg = (ImageView)findViewById(R.id.forward_right_six);
        forwardRightSevenImg = (ImageView)findViewById(R.id.forward_right_seven);
        forwardRightEightImg = (ImageView)findViewById(R.id.forward_right_eight);
        forwardRightNineImg = (ImageView)findViewById(R.id.forward_right_nine);
        forwardRightTenImg = (ImageView)findViewById(R.id.forward_right_ten);
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

    private void addMidRadianListener() {
        radianBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftRadian_40.setVisibility(View.INVISIBLE);
                midRadian.setVisibility(View.INVISIBLE);
                rightRadian_40.setVisibility(View.INVISIBLE);

                switch (radianCount) {
                    case 1: {
                        midRadian.setVisibility(View.VISIBLE);
                        radianCount++;
                        break;
                    }
                    case 2: {
                        rightRadian_40.setVisibility(View.VISIBLE);
                        radianCount++;
                        break;
                    }
                    case 3: {
                        leftRadian_40.setVisibility(View.VISIBLE);
                        radianCount = 1;
                        break;
                    }
                }
            }
        });
    }

    private void addForwardTurnLeftListener() {
        forwardTurnLeftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwardLeftOneImg.setVisibility(View.INVISIBLE);
                forwardLeftTwoImg.setVisibility(View.INVISIBLE);
                forwardLeftThreeImg.setVisibility(View.INVISIBLE);
                forwardLeftFourImg.setVisibility(View.INVISIBLE);
                forwardLeftFiveImg.setVisibility(View.INVISIBLE);
                forwardLeftSixImg.setVisibility(View.INVISIBLE);
                forwardLeftSevenImg.setVisibility(View.INVISIBLE);
                forwardLeftEightImg.setVisibility(View.INVISIBLE);
                forwardLeftNineImg.setVisibility(View.INVISIBLE);
                forwardLeftTenImg.setVisibility(View.INVISIBLE);

                switch (forwardLeftCount) {
                    case 1: {
                        forwardLeftTwoImg.setVisibility(View.VISIBLE);
                        forwardLeftCount++;
                        break;
                    }
                    case 2: {
                        forwardLeftThreeImg.setVisibility(View.VISIBLE);
                        forwardLeftCount++;
                        break;
                    }
                    case 3: {
                        forwardLeftFourImg.setVisibility(View.VISIBLE);
                        forwardLeftCount++;
                        break;
                    }
                    case 4: {
                        forwardLeftFiveImg.setVisibility(View.VISIBLE);
                        forwardLeftCount++;
                        break;
                    }
                    case 5: {
                        forwardLeftSixImg.setVisibility(View.VISIBLE);
                        forwardLeftCount++;
                        break;
                    }
                    case 6: {
                        forwardLeftSevenImg.setVisibility(View.VISIBLE);
                        forwardLeftCount++;
                        break;
                    }
                    case 7: {
                        forwardLeftEightImg.setVisibility(View.VISIBLE);
                        forwardLeftCount++;
                        break;
                    }
                    case 8: {
                        forwardLeftNineImg.setVisibility(View.VISIBLE);
                        forwardLeftCount++;
                        break;
                    }
                    case 9: {
                        forwardLeftTenImg.setVisibility(View.VISIBLE);
                        forwardLeftCount++;
                        break;
                    }
                    case 10: {
                        forwardLeftOneImg.setVisibility(View.VISIBLE);
                        forwardLeftCount = 1;
                        break;
                    }
                }
            }
        });
    }

    private void addForwardTurnRightListener() {
        forwardTurnRightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwardRightOneImg.setVisibility(View.INVISIBLE);
                forwardRightTwoImg.setVisibility(View.INVISIBLE);
                forwardRightThreeImg.setVisibility(View.INVISIBLE);
                forwardRightFourImg.setVisibility(View.INVISIBLE);
                forwardRightFiveImg.setVisibility(View.INVISIBLE);
                forwardRightSixImg.setVisibility(View.INVISIBLE);
                forwardRightSevenImg.setVisibility(View.INVISIBLE);
                forwardRightEightImg.setVisibility(View.INVISIBLE);
                forwardRightNineImg.setVisibility(View.INVISIBLE);
                forwardRightTenImg.setVisibility(View.INVISIBLE);

                switch (forwardRightCount) {
                    case 1: {
                        forwardRightTwoImg.setVisibility(View.VISIBLE);
                        forwardRightCount++;
                        break;
                    }
                    case 2: {
                        forwardRightThreeImg.setVisibility(View.VISIBLE);
                        forwardRightCount++;
                        break;
                    }
                    case 3: {
                        forwardRightFourImg.setVisibility(View.VISIBLE);
                        forwardRightCount++;
                        break;
                    }
                    case 4: {
                        forwardRightFiveImg.setVisibility(View.VISIBLE);
                        forwardRightCount++;
                        break;
                    }
                    case 5: {
                        forwardRightSixImg.setVisibility(View.VISIBLE);
                        forwardRightCount++;
                        break;
                    }
                    case 6: {
                        forwardRightSevenImg.setVisibility(View.VISIBLE);
                        forwardRightCount++;
                        break;
                    }
                    case 7: {
                        forwardRightEightImg.setVisibility(View.VISIBLE);
                        forwardRightCount++;
                        break;
                    }
                    case 8: {
                        forwardRightNineImg.setVisibility(View.VISIBLE);
                        forwardRightCount++;
                        break;
                    }
                    case 9: {
                        forwardRightTenImg.setVisibility(View.VISIBLE);
                        forwardRightCount++;
                        break;
                    }
                    case 10: {
                        forwardRightOneImg.setVisibility(View.VISIBLE);
                        forwardRightCount = 1;
                        break;
                    }
                }
            }
        });
    }

    private void addForwardMidLeftListener() {
        forwardMidLeftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwardMidLeftOneImg.setVisibility(View.INVISIBLE);
                forwardMidLeftTwoImg.setVisibility(View.INVISIBLE);
                forwardMidLeftThreeImg.setVisibility(View.INVISIBLE);
                forwardMidLeftFourImg.setVisibility(View.INVISIBLE);
                forwardMidLeftFiveImg.setVisibility(View.INVISIBLE);
                forwardMidLeftSixImg.setVisibility(View.INVISIBLE);
                forwardMidLeftSevenImg.setVisibility(View.INVISIBLE);
                forwardMidLeftEightImg.setVisibility(View.INVISIBLE);
                forwardMidLeftNineImg.setVisibility(View.INVISIBLE);
                forwardMidLeftTenImg.setVisibility(View.INVISIBLE);

                switch (forwardMidLeftCount) {
                    case 1: {
                        forwardMidLeftTwoImg.setVisibility(View.VISIBLE);
                        forwardMidLeftCount++;
                        break;
                    }
                    case 2: {
                        forwardMidLeftThreeImg.setVisibility(View.VISIBLE);
                        forwardMidLeftCount++;
                        break;
                    }
                    case 3: {
                        forwardMidLeftFourImg.setVisibility(View.VISIBLE);
                        forwardMidLeftCount++;
                        break;
                    }
                    case 4: {
                        forwardMidLeftFiveImg.setVisibility(View.VISIBLE);
                        forwardMidLeftCount++;
                        break;
                    }
                    case 5: {
                        forwardMidLeftSixImg.setVisibility(View.VISIBLE);
                        forwardMidLeftCount++;
                        break;
                    }
                    case 6: {
                        forwardMidLeftSevenImg.setVisibility(View.VISIBLE);
                        forwardMidLeftCount++;
                        break;
                    }
                    case 7: {
                        forwardMidLeftEightImg.setVisibility(View.VISIBLE);
                        forwardMidLeftCount++;
                        break;
                    }
                    case 8: {
                        forwardMidLeftNineImg.setVisibility(View.VISIBLE);
                        forwardMidLeftCount++;
                        break;
                    }
                    case 9: {
                        forwardMidLeftTenImg.setVisibility(View.VISIBLE);
                        forwardMidLeftCount++;
                        break;
                    }
                    case 10: {
                        forwardMidLeftOneImg.setVisibility(View.VISIBLE);
                        forwardMidLeftCount = 1;
                        break;
                    }
                }
            }
        });
    }

    private void addForwardMidRightListener() {
        forwardMidRightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                forwardMidRightOneImg.setVisibility(View.INVISIBLE);
                forwardMidRightTwoImg.setVisibility(View.INVISIBLE);
                forwardMidRightThreeImg.setVisibility(View.INVISIBLE);
                forwardMidRightFourImg.setVisibility(View.INVISIBLE);
                forwardMidRightFiveImg.setVisibility(View.INVISIBLE);
                forwardMidRightSixImg.setVisibility(View.INVISIBLE);
                forwardMidRightSevenImg.setVisibility(View.INVISIBLE);
                forwardMidRightEightImg.setVisibility(View.INVISIBLE);
                forwardMidRightNineImg.setVisibility(View.INVISIBLE);
                forwardMidRightTenImg.setVisibility(View.INVISIBLE);

                switch (forwardMidRightCount) {
                    case 1: {
                        forwardMidRightTwoImg.setVisibility(View.VISIBLE);
                        forwardMidRightCount++;
                        break;
                    }
                    case 2: {
                        forwardMidRightThreeImg.setVisibility(View.VISIBLE);
                        forwardMidRightCount++;
                        break;
                    }
                    case 3: {
                        forwardMidRightFourImg.setVisibility(View.VISIBLE);
                        forwardMidRightCount++;
                        break;
                    }
                    case 4: {
                        forwardMidRightFiveImg.setVisibility(View.VISIBLE);
                        forwardMidRightCount++;
                        break;
                    }
                    case 5: {
                        forwardMidRightSixImg.setVisibility(View.VISIBLE);
                        forwardMidRightCount++;
                        break;
                    }
                    case 6: {
                        forwardMidRightSevenImg.setVisibility(View.VISIBLE);
                        forwardMidRightCount++;
                        break;
                    }
                    case 7: {
                        forwardMidRightEightImg.setVisibility(View.VISIBLE);
                        forwardMidRightCount++;
                        break;
                    }
                    case 8: {
                        forwardMidRightNineImg.setVisibility(View.VISIBLE);
                        forwardMidRightCount++;
                        break;
                    }
                    case 9: {
                        forwardMidRightTenImg.setVisibility(View.VISIBLE);
                        forwardMidRightCount++;
                        break;
                    }
                    case 10: {
                        forwardMidRightOneImg.setVisibility(View.VISIBLE);
                        forwardMidRightCount = 1;
                        break;
                    }
                }
            }
        });
    }
}
