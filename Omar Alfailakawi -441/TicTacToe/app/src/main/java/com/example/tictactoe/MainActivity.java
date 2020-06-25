package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean xTurn = true;


int[] xArray = new int[9];
int[] oArray = new int[9];
TextView Turn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Turn = findViewById(R.id.Turn);

        final Button Zero = findViewById(R.id.button0);
        final Button One = findViewById(R.id.button1);
        final Button Two = findViewById(R.id.button2);
        final Button Three = findViewById(R.id.button3);
        final Button Four = findViewById(R.id.button4);
        final  Button Five = findViewById(R.id.button5);
        final Button Six = findViewById(R.id.button6);
        final Button Seven = findViewById(R.id.button7);
        final  Button Eight = findViewById(R.id.button8);

        final Button StartAsO = findViewById(R.id.StartAsO);
        final Button StartAsX = findViewById(R.id.StartAsX);

        final Button PlayAgain = findViewById(R.id.PlayAgain);


        PlayAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Zero.setText(" ");
                One.setText(" ");
                Two.setText(" ");
                Three.setText(" ");
                Four.setText(" ");
                Five.setText(" ");
                Six.setText(" ");
                Seven.setText(" ");
                Eight.setText(" ");
                for (int i = 0; i < xArray.length; i++) {
                    xArray[i] = 0;
                }
                for (int i = 0; i < oArray.length; i++) {
                    oArray[i] = 0;
                }
                };
                                     });

        StartAsO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Turn.setText("O Turn");
                xTurn = false;
            }
        });



        StartAsX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Turn.setText("X Turn");
                xTurn = true;
            }
        });





        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn) {
                    Zero.setText("X");
                    xArray [0] = 1;
                    CheckXWin();

                } else{
                        Zero.setText("O");
                    oArray [0] = 1;
                        CheckOWin();

                    }
                }



            });
        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn) {
                    One.setText("X");
                    xArray [1] = 1;
                    CheckXWin();

                } else{
                    One.setText("O");
                    oArray [1] = 1;
                    CheckOWin();

                }
            }



        });
        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn) {
                    Two.setText("X");
                    xArray [2] = 1;
                    CheckXWin();

                } else{
                    Two.setText("O");
                    oArray [2] = 1;
                    CheckOWin();

                }
            }



        });
        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn) {
                    Three.setText("X");
                    xArray [3] = 1;
                    CheckXWin();

                } else{
                    Three.setText("O");
                    oArray [3] = 1;
                    CheckOWin();

                }
            }



        });
        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn) {
                    Four.setText("X");
                    xArray [4] = 1;
                    CheckXWin();

                } else{
                    Four.setText("O");
                    oArray [4] = 1;
                    CheckOWin();

                }
            }



        });
        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn) {
                    Five.setText("X");
                    xArray [5] = 1;
                    CheckXWin();

                } else{
                    Five.setText("O");
                    oArray [5] = 1;
                    CheckOWin();

                }
            }



        });
        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn) {
                    Six.setText("X");
                    xArray [6] = 1;
                    CheckXWin();

                } else{
                    Six.setText("O");
                    oArray [6] = 1;
                    CheckOWin();

                }
            }



        });
        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn) {
                    Seven.setText("X");
                    xArray [7] = 1;
                    CheckXWin();

                } else{
                    Seven.setText("O");
                    oArray [7] = 1;
                    CheckOWin();

                }
            }



        });Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(xTurn) {
                    Eight.setText("X");
                    xArray [8] = 1;
                    CheckXWin();

                } else{
                    Eight.setText("O");
                    oArray [8] = 1;
                    CheckOWin();

                }
            }




        });

        };

public void CheckXWin (){
xTurn = false;
Turn.setText("O Turn");
if(xArray [0]==1 && xArray[1]==1 && xArray [2]==1){
    Toast.makeText(MainActivity.this,"X Won!!!",Toast.LENGTH_SHORT).show();
}
    else if(xArray [3]==1 && xArray[4]==1 && xArray [5]==1){
        Toast.makeText(MainActivity.this,"X Won!!!",Toast.LENGTH_SHORT).show();
    }
   else if(xArray [6]==1 && xArray[7]==1 && xArray [8]==1){
        Toast.makeText(MainActivity.this,"X Won!!!",Toast.LENGTH_SHORT).show();
    }
    if(xArray [0]==1 && xArray[3]==1 && xArray [6]==1){
        Toast.makeText(MainActivity.this,"X Won!!!",Toast.LENGTH_SHORT).show();
    }
    if(xArray [1]==1 && xArray[4]==1 && xArray [7]==1){
        Toast.makeText(MainActivity.this,"X Won!!!",Toast.LENGTH_SHORT).show();
    }
    if(xArray [2]==1 && xArray[5]==1 && xArray [8]==1){
        Toast.makeText(MainActivity.this,"X Won!!!",Toast.LENGTH_SHORT).show();
    }
    if(xArray [0]==1 && xArray[4]==1 && xArray [8]==1){
        Toast.makeText(MainActivity.this,"X Won!!!",Toast.LENGTH_SHORT).show();
    }
    if(xArray [2]==1 && xArray[4]==1 && xArray [6]==1){
        Toast.makeText(MainActivity.this,"X Won!!!",Toast.LENGTH_SHORT).show();
    }

}

public void CheckOWin () {
    xTurn = true;
    Turn.setText("X Turn");
    if (oArray[0] == 1 && oArray[1] == 1 && oArray[2] == 1) {
        Toast.makeText(MainActivity.this, "O Won!!!", Toast.LENGTH_SHORT).show();
    }
    if (oArray[3] == 1 && oArray[4] == 1 && oArray[5] == 1) {
        Toast.makeText(MainActivity.this, "O Won!!!", Toast.LENGTH_SHORT).show();
    }
    if (oArray[6] == 1 && oArray[7] == 1 && oArray[8] == 1) {
        Toast.makeText(MainActivity.this, "O Won!!!", Toast.LENGTH_SHORT).show();
    }
    if (oArray[0] == 1 && oArray[3] == 1 && oArray[6] == 1) {
        Toast.makeText(MainActivity.this, "O Won!!!", Toast.LENGTH_SHORT).show();
    }
    if (oArray[1] == 1 && oArray[4] == 1 && oArray[7] == 1) {
        Toast.makeText(MainActivity.this, "O Won!!!", Toast.LENGTH_SHORT).show();
    }
    if (oArray[2] == 1 && oArray[5] == 1 && oArray[8] == 1) {
        Toast.makeText(MainActivity.this, "O Won!!!", Toast.LENGTH_SHORT).show();
    }
    if (oArray[0] == 1 && oArray[4] == 1 && oArray[8] == 1) {
        Toast.makeText(MainActivity.this, "O Won!!!", Toast.LENGTH_SHORT).show();
    }
    if (oArray[2] == 1 && oArray[4] == 1 && oArray[6] == 1) {
        Toast.makeText(MainActivity.this, "O Won!!!", Toast.LENGTH_SHORT).show();

    }


}
;}




