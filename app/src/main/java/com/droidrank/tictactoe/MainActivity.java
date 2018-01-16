package com.droidrank.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{



    Button block1, block2, block3, block4, block5, block6, block7, block8, block9, restart;
    TextView result;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        block1 = (Button) findViewById(R.id.bt_block1);
        block2 = (Button) findViewById(R.id.bt_block2);
        block3 = (Button) findViewById(R.id.bt_block3);
        block4 = (Button) findViewById(R.id.bt_block4);
        block5 = (Button) findViewById(R.id.bt_block5);
        block6 = (Button) findViewById(R.id.bt_block6);
        block7 = (Button) findViewById(R.id.bt_block7);
        block8 = (Button) findViewById(R.id.bt_block8);
        block9 = (Button) findViewById(R.id.bt_block9);
        result = (TextView) findViewById(R.id.tv_show_result);
        restart = (Button) findViewById(R.id.bt_restart_game);

        block1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(block1.getText().toString().equals("")){
                    if(count == 0){
                        count = 1;
                        block1.setText("O");
                    } else {
                        count = 0;
                        block1.setText("X");
                    }
                }
            }
        });

        block2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(block2.getText().toString().equals("")){
                    if(count == 0){
                        count = 1;
                        block2.setText("O");
                    } else {
                        count = 0;
                        block2.setText("X");
                    }
                }
            }
        });

        block3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(block3.getText().toString().equals("")){
                    if(count == 0){
                        count = 1;
                        block3.setText("O");
                    } else {
                        count = 0;
                        block3.setText("X");
                    }
                }
            }
        });

        block4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(block4.getText().toString().equals("")){
                    if(count == 0){
                        count = 1;
                        block4.setText("O");
                    } else {
                        count = 0;
                        block4.setText("X");
                    }
                }
            }
        });

        block5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(block5.getText().toString().equals("")){
                    if(count == 0){
                        count = 1;
                        block5.setText("O");
                    } else {
                        count = 0;
                        block5.setText("X");
                    }
                }
            }
        });

        block6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(block6.getText().toString().equals("")){
                    if(count == 0){
                        count = 1;
                        block6.setText("O");
                    } else {
                        count = 0;
                        block6.setText("X");
                    }
                }
            }
        });

        block7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(block7.getText().toString().equals("")){
                    if(count == 0){
                        count = 1;
                        block7.setText("O");
                    } else {
                        count = 0;
                        block7.setText("X");
                    }
                }

            }
        });

        block8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(block8.getText().toString().equals("")){
                    if(count == 0){
                        count = 1;
                        block8.setText("O");
                    } else {
                        count = 0;
                        block8.setText("X");
                    }
                }
            }
        });

        block9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(block9.getText().toString().equals("")){
                    if(count == 0){
                        count = 1;
                        block9.setText("O");
                    } else {
                        count = 0;
                        block9.setText("X");
                    }
                }
            }
        });




        



        /**
         * Restarts the game
         */
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }

}
