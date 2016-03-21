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
    private Button odejmowanie_button;
    private Button mnozenie_button;
    private Button dzielenie_button;
    private Button mod_button;
    private Button doskonala_button;
    private Button pierwsza_button;
    private Button decimal_binar_button;
    private Button binar_decimal_button;
    private Button decimal_hexadecimal_button;
    private Button hexadecimal_decimal_button;
    private Button nwd_button;
    private Button silnia_button;
    private Button fx_button;
    private Button sin_button;
    private Button cos_button;
    private Button tg_button;
    private Button ctg_button;
    private Button hexa_A_button;
    private Button hexa_B_button;
    private Button hexa_C_button;
    private Button hexa_D_button;
    private Button hexa_E_button;
    private Button hexa_F_button;
    private Button memory_button;
    private Button clear_button;
    private Button potega_button;
    private Button pierwiastek_button;
    private Button przecinek_button;

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
        this.odejmowanie_button = (Button) findViewById(R.id.odejmowanie_button);
        this.mnozenie_button = (Button) findViewById(R.id.mnozenie_button);
        this.dzielenie_button = (Button) findViewById(R.id.dzielenie_button);
        this.mod_button = (Button) findViewById(R.id.mod_button);
        this.doskonala_button = (Button) findViewById(R.id.doskonala_button);
        this.pierwsza_button = (Button) findViewById(R.id.pierwsza_button);
        this.decimal_binar_button = (Button) findViewById(R.id.decimal_binar_button);
        this.binar_decimal_button = (Button) findViewById(R.id.binar_decimal_button);
        this.decimal_hexadecimal_button = (Button) findViewById(R.id.decimal_hexadecimal_button);
        this.hexadecimal_decimal_button = (Button) findViewById(R.id.hexadecimal_decimal_button);
        this.nwd_button = (Button) findViewById(R.id.nwd_button);
        this.silnia_button = (Button) findViewById(R.id.silnia_button);
        this.fx_button = (Button) findViewById(R.id.fx_button);
        this.sin_button = (Button) findViewById(R.id.sin_button);
        this.cos_button = (Button) findViewById(R.id.cos_button);
        this.tg_button = (Button) findViewById(R.id.tg_button);
        this.ctg_button = (Button) findViewById(R.id.ctg_button);
        this.hexa_A_button = (Button) findViewById(R.id.hexa_A_button);
        this.hexa_B_button = (Button) findViewById(R.id.hexa_B_button);
        this.hexa_C_button = (Button) findViewById(R.id.hexa_C_button);
        this.hexa_D_button = (Button) findViewById(R.id.hexa_D_button);
        this.hexa_E_button = (Button) findViewById(R.id.hexa_E_button);
        this.hexa_F_button = (Button) findViewById(R.id.hexa_F_button);
        this.memory_button = (Button) findViewById(R.id.memory_button);
        this.clear_button = (Button) findViewById(R.id.clear_button);
        this.potega_button = (Button) findViewById(R.id.potega_button);
        this.pierwiastek_button = (Button) findViewById(R.id.pierwiastek_button);
        this.przecinek_button = (Button) findViewById(R.id.przecinek_button);
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

        odejmowanie_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        mnozenie_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        dzielenie_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        mod_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        doskonala_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        pierwsza_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        decimal_binar_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        binar_decimal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        decimal_hexadecimal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        hexadecimal_decimal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        nwd_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        silnia_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        fx_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        sin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        cos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        tg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        ctg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        hexa_A_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        hexa_B_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        hexa_C_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        hexa_D_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        hexa_E_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        hexa_F_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        memory_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        potega_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        pierwiastek_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bc.clearTextView(pole_wpisywania);
            }
        });

        przecinek_button.setOnClickListener(new View.OnClickListener() {
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
