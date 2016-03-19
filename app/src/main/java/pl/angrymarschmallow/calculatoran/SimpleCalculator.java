package pl.angrymarschmallow.calculatoran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleCalculator extends AppCompatActivity {

    private EditText pole_wpisywania;
    private TextView wynik;
    private Button liczba_1;
    private Button liczba_2;
    private Button liczba_3;
    private Button liczba_4;
    private Button liczba_5;
    private Button liczba_6;
    private Button liczba_7;
    private Button liczba_8;
    private Button liczba_9;
    private Button liczba_0;

    private Button clearOneChar;
    private Button wynik_button;

    private Button lewynawias_button;
    private Button prawynawias_button;

    private Button dodawanie_button;


    ButtonChecker bc;
    SimpleCalculator sc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extended_calculator);

        bc = new ButtonChecker();

        this.wynik = (TextView) findViewById(R.id.wynik);
        this.pole_wpisywania = (EditText) findViewById(R.id.pole_wpisywania);

        // Liczby

        this.liczba_1 = (Button) findViewById(R.id.liczba_1);
        this.liczba_2 = (Button) findViewById(R.id.liczba_2);
        this.liczba_3 = (Button) findViewById(R.id.liczba_3);

        this.liczba_4 = (Button) findViewById(R.id.liczba_4);
        this.liczba_5 = (Button) findViewById(R.id.liczba_5);
        this.liczba_6 = (Button) findViewById(R.id.liczba_6);

        this.liczba_7 = (Button) findViewById(R.id.liczba_7);
        this.liczba_8 = (Button) findViewById(R.id.liczba_8);
        this.liczba_9 = (Button) findViewById(R.id.liczba_9);

        this.liczba_0 = (Button) findViewById(R.id.liczba_0);

        liczba_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.addNumeric(liczba_1, pole_wpisywania);
            }
        });

        liczba_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.addNumeric(liczba_2, pole_wpisywania);
            }
        });

        liczba_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.addNumeric(liczba_3, pole_wpisywania);
            }
        });

        liczba_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.addNumeric(liczba_4, pole_wpisywania);
            }
        });

        liczba_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.addNumeric(liczba_5, pole_wpisywania);

            }
        });

        liczba_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.addNumeric(liczba_6, pole_wpisywania);

            }
        });

        liczba_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.addNumeric(liczba_7, pole_wpisywania);
            }
        });

        liczba_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.addNumeric(liczba_8, pole_wpisywania);

            }
        });

        liczba_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.addNumeric(liczba_9, pole_wpisywania);

            }
        });

        liczba_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.addNumeric(liczba_0, pole_wpisywania);
            }
        });


        // Buttony funkcyjne

        this.lewynawias_button = (Button) findViewById(R.id.lewynawias_button);
        this.prawynawias_button = (Button) findViewById(R.id.prawynawias_button);

        this.dodawanie_button = (Button) findViewById(R.id.dodawanie_button);

        this.wynik_button = (Button) findViewById(R.id.wynik_button);
        this.clearOneChar = (Button) findViewById(R.id.clearOneChar);

        clearOneChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearOneCharacter(pole_wpisywania);
            }
        });

        lewynawias_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        prawynawias_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        dodawanie_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });


        wynik_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
                //Tutaj ktoś będzie musiał zaimplementować swoją metodę która zwróci wynik
                //taki sobie komentarz
            }
        });

    }
}
