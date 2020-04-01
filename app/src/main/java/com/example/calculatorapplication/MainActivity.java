package com.example.calculatorapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button btnCE, btnC, btnBS, btnDiv, btn7, btn8, btn9, btnMul, btn4, btn5, btn6, btnSub, btn1, btn2, btn3, btnAdd,btn0, btnEqual;
    Integer value1, value2;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/DS-DIGI.TTF");
        textView.setTypeface(typeface);

        btn0 = findViewById(R.id.n0);
        btn1 = findViewById(R.id.n1);
        btn2 = findViewById(R.id.n2);
        btn3 = findViewById(R.id.n3);
        btn4 = findViewById(R.id.n4);
        btn5 = findViewById(R.id.n5);
        btn6 = findViewById(R.id.n6);
        btn7 = findViewById(R.id.n7);
        btn8 = findViewById(R.id.n8);
        btn9 = findViewById(R.id.n9);
        btnC = findViewById(R.id.c);
        btnCE = findViewById(R.id.ce);
        btnBS = findViewById(R.id.bs);
        btnAdd = findViewById(R.id.add);
        btnSub = findViewById(R.id.sub);
        btnMul = findViewById(R.id.mul);
        btnDiv = findViewById(R.id.div);
        btnEqual = findViewById(R.id.equal);


        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnCE.setOnClickListener(this);
        btnBS.setOnClickListener(this);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        if(v.getId() == btn0.getId()) {
            textView.setText(textView.getText() + "0");
        }

        if(v.getId() == btn1.getId()) {
            textView.setText(textView.getText() + "1");
        }

        if(v.getId() == btn2.getId()) {
            textView.setText(textView.getText() + "2");
        }

        if(v.getId() == btn3.getId()) {
            textView.setText(textView.getText() + "3");
        }

        if(v.getId() == btn4.getId()) {
            textView.setText(textView.getText() + "4");
        }

        if(v.getId() == btn5.getId()) {
            textView.setText(textView.getText() + "5");
        }

        if(v.getId() == btn6.getId()) {
            textView.setText(textView.getText() + "6");
        }

        if(v.getId() == btn7.getId()) {
            textView.setText(textView.getText() + "7");
        }

        if(v.getId() == btn8.getId()) {
            textView.setText(textView.getText() + "8");
        }

        if(v.getId() == btn9.getId()) {
            textView.setText(textView.getText() + "9");
        }

        if(v.getId() == btnAdd.getId()) {
            try {
                value1 = Integer.parseInt(textView.getText() + "");
                add = true;
                textView.setText(null);
            } catch (Exception e) {
                System.out.println("You haven't put any numbers in yet.");
            }
        }

        if(v.getId() == btnSub.getId()) {
            try {
                value1 = Integer.parseInt(textView.getText() + "");
                sub = true;
                textView.setText(null);
            } catch (Exception e) {
                System.out.println("You haven't put any numbers in yet.");
            }
        }

        if(v.getId() == btnMul.getId()) {
            try {
                value1 = Integer.parseInt(textView.getText() + "");
                mul = true;
                textView.setText(null);
            } catch (Exception e) {
                System.out.println("You haven't put any numbers in yet.");
            }
        }

        if(v.getId() == btnDiv.getId()) {
            try {
                value1 = Integer.parseInt(textView.getText() + "");
                div = true;
                textView.setText(null);
            } catch (Exception e) {
                System.out.println("You haven't put any numbers in yet.");
            }
        }

        if(v.getId() == btnEqual.getId()) {
            try {
                value2 = Integer.parseInt(textView.getText() + "");

                if(add) {
                    textView.setText(value1 + value2 + "");
                    add = false;
                } else if (sub) {
                    textView.setText(value1 - value2 + "");
                    sub = false;
                } else if (mul) {
                    textView.setText(value1 * value2 + "");
                    mul = false;
                } else if (div) {
                    try {
                        textView.setText(value1 / value2 + "");
                        div = false;
                    } catch (ArithmeticException e) {
                        System.out.println("Denominator must not be rezo.");
                    }
                }
            } catch (Exception e) {
                System.out.println("You haven't had second value yet.");
            }
        }

        if(v.getId() == btnC.getId()) {
            textView.setText("");
        }

        if(v.getId() == btnBS.getId()) {
            if(textView.getText().length() <= 1) {
                textView.setText(null);
            } else if (textView.getText().length() > 1) {
                String text = textView.getText().toString();
                textView.setText(text.substring(0, text.length() - 1));
            }
        }

        if(v.getId() == btnCE.getId()) {
            if((value1 != null)) {
                if(add) {
                    textView.setText(null);
                } else if (sub) {
                    textView.setText(null);
                } else if (mul) {
                    textView.setText(null);
                } else {
                    value1 = null;
                    textView.setText(null);
                }
            }

            if((value1 == null)) {
                textView.setText(null);
            }
        }

    }
}
