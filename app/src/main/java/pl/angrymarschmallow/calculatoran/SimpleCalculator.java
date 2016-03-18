package pl.angrymarschmallow.calculatoran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleCalculator extends AppCompatActivity {

    public TextView editText;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button button10;
    public Button button11;
    public Button button12;
    public Button button13;
    public Button button14;
    public Button button15;
    public Button button16;
    public Button button17;
    public Button button18;
    public Button button19;
    public Button button20;
    public Button button21;
    public Button button22;
    public Button button23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);

        this.editText = (TextView) findViewById(R.id.textView);
        this.button1 = (Button) findViewById(R.id.button);
        this.button2 = (Button) findViewById(R.id.button2);
        this.button3 = (Button) findViewById(R.id.button3);
        this.button4 = (Button) findViewById(R.id.button4);

        this.button5 = (Button) findViewById(R.id.button5);
        this.button6 = (Button) findViewById(R.id.button6);
        this.button7 = (Button) findViewById(R.id.button7);
        this.button8 = (Button) findViewById(R.id.button8);
        this.button9 = (Button) findViewById(R.id.button9);

        this.button10 = (Button) findViewById(R.id.button10);
        this.button11 = (Button) findViewById(R.id.button11);
        this.button12 = (Button) findViewById(R.id.button12);
        this.button13 = (Button) findViewById(R.id.button13);

        this.button14 = (Button) findViewById(R.id.button14);
        this.button15 = (Button) findViewById(R.id.button15);
        this.button16 = (Button) findViewById(R.id.button16);
        this.button17 = (Button) findViewById(R.id.button17);

        this.button18 = (Button) findViewById(R.id.button18);
        this.button19 = (Button) findViewById(R.id.button19);
        this.button20 = (Button) findViewById(R.id.button20);
        this.button21 = (Button) findViewById(R.id.button21);

        this.button22 = (Button) findViewById(R.id.button22);
        this.button23 = (Button) findViewById(R.id.button23);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button1, editText);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button2, editText);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button3, editText);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().clearTextView(editText);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button5, editText);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tutaj ktoś będzie musiał zaimplementować swoją metodę która zwróci wynik
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().clearTextView(editText);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button8, editText);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button9, editText);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button10, editText);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button11, editText);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button12, editText);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button13, editText);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button14, editText);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button15, editText);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button16, editText);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button17, editText);
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button18, editText);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button19, editText);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button20, editText);
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button21, editText);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Tu bedzie potrzebna klasa do wyliczeń
                //editText = new ButtonChecker().addToTextView(button22, editText);
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = new ButtonChecker().addToTextView(button23, editText);
            }
        });
    }
}
