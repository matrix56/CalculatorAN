package pl.angrymarschmallow.calculatoran;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Dariusz on 2016-03-18.
 */
public class ButtonChecker {

    //Sprawdza czy w edicie jest wartość 0.00 jeśli tak to go czyści
    //jeśli nie to zostawia bez zmina
    protected void checkStartValue(Button button, TextView textView) {
        if (textView.getText() == "0.00") {
            textView.setText("");
        }
    }

    public void addToTextView(Button button, TextView textView) {
        this.checkStartValue(button, textView);
        textView.append(button.getText());
    }

}
