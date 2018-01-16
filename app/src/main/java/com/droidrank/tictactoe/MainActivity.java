package com.droidrank.tictactoe;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button block1, block2, block3, block4, block5, block6, block7, block8, block9, restart;
    TextView result;

    int player = 0;
    boolean inProgress = false;

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


        /**
         *
         *
         * setting up working buttons
         *
         *
         */


        block1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (block1.getText().toString().equals("")) {
                    if (player == 0) {
                        player = 1;
                        block1.setText("O");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    } else {
                        player = 0;
                        block1.setText("X");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    }
                }
            }
        });

        block2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (block2.getText().toString().equals("")) {
                    if (player == 0) {
                        player = 1;
                        block2.setText("O");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    } else {
                        player = 0;
                        block2.setText("X");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    }
                }
            }
        });

        block3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (block3.getText().toString().equals("")) {
                    if (player == 0) {
                        player = 1;
                        block3.setText("O");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    } else {
                        player = 0;
                        block3.setText("X");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    }
                }
            }
        });

        block4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (block4.getText().toString().equals("")) {
                    if (player == 0) {
                        player = 1;
                        block4.setText("O");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    } else {
                        player = 0;
                        block4.setText("X");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    }
                }
            }
        });

        block5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (block5.getText().toString().equals("")) {
                    if (player == 0) {
                        player = 1;
                        block5.setText("O");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    } else {
                        player = 0;
                        block5.setText("X");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    }
                }
            }
        });

        block6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (block6.getText().toString().equals("")) {
                    if (player == 0) {
                        player = 1;
                        block6.setText("O");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    } else {
                        player = 0;
                        block6.setText("X");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    }
                }
            }
        });

        block7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (block7.getText().toString().equals("")) {
                    if (player == 0) {
                        player = 1;
                        block7.setText("O");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    } else {
                        player = 0;
                        block7.setText("X");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    }
                }

            }
        });

        block8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (block8.getText().toString().equals("")) {
                    if (player == 0) {
                        player = 1;
                        block8.setText("O");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    } else {
                        player = 0;
                        block8.setText("X");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    }
                }
            }
        });

        block9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (block9.getText().toString().equals("")) {
                    if (player == 0) {
                        player = 1;
                        block9.setText("O");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    } else {
                        player = 0;
                        block9.setText("X");
                        playerWins();
                        inProgress = true;
                        gameInProgress();
                    }
                }
            }
        });


        /**
         *
         *
         * Restarts the game
         *
         * Alert dialog creation
         */
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Tic-Tac-Toe");
                builder.setMessage("Do you want to restart the game?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        resetFunction();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }

    /**
     * Logic of how to win a game
     */

    public void playerWins() {
        if ((block1.getText() == "X" && block2.getText() == "X" && block3.getText() == "X") ||
                (block4.getText() == "X" && block5.getText() == "X" && block6.getText() == "X") ||
                (block7.getText() == "X" && block8.getText() == "X" && block9.getText() == "X") ||
                (block1.getText() == "X" && block4.getText() == "X" && block7.getText() == "X") ||
                (block2.getText() == "X" && block5.getText() == "X" && block8.getText() == "X") ||
                (block3.getText() == "X" && block6.getText() == "X" && block9.getText() == "X") ||
                (block1.getText() == "X" && block5.getText() == "X" && block9.getText() == "X") ||
                (block3.getText() == "X" && block5.getText() == "X" && block7.getText() == "X")) {
            result.setText("Player 2 Wins");
        } else if ((block1.getText() == "O" && block2.getText() == "O" && block3.getText() == "O") ||
                (block4.getText() == "O" && block5.getText() == "O" && block6.getText() == "O") ||
                (block7.getText() == "O" && block8.getText() == "O" && block9.getText() == "O") ||
                (block1.getText() == "O" && block4.getText() == "O" && block7.getText() == "O") ||
                (block2.getText() == "O" && block5.getText() == "O" && block8.getText() == "O") ||
                (block3.getText() == "O" && block6.getText() == "O" && block9.getText() == "O") ||
                (block1.getText() == "O" && block5.getText() == "O" && block9.getText() == "O") ||
                (block3.getText() == "O" && block5.getText() == "O" && block7.getText() == "O")) {
            result.setText("Player 1 Wins");
        } else if (!(block1.getText() == "" || block2.getText() == "" || block3.getText() == "" ||
                block4.getText() == "" || block5.getText() == "" || block6.getText() == "" ||
                block7.getText() == "" || block8.getText() == "" || block9.getText() == "")) {
            result.setText("It's a Tie");
        }
    }

    /**
     * reset button function
     */

    public void resetFunction() {
        block1.setText("");
        block2.setText("");
        block3.setText("");
        block4.setText("");
        block5.setText("");
        block6.setText("");
        block7.setText("");
        block8.setText("");
        block9.setText("");
        result.setText("");
        player = 0;
        inProgress = false;
        restart.setText("Start New Game");
    }

    /**
     * setting the button to the " Restart game mode"
     */

    public void gameInProgress() {
        if (inProgress == true) {
            restart.setText("Restart Game");
        }
    }

}
