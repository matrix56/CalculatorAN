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
    protected TextView checkStartValue(TextView textView) {
        if (textView.getText().equals("0.00")) {
            textView.setText("");
        }
        return textView;
    }

    public TextView addToTextView(Button button, TextView textView) {
        textView = this.checkStartValue(textView);
        textView.append(button.getText());
        return textView;
    }

    public TextView clearTextView(TextView textView) {
       textView.setText("");
        return textView;
    }

    public TextView clearOneCharacter(TextView textView) {
        String text = textView.getText().toString();
        text = text.substring(0, text.length() - 2);
        textView.setText(text);
        return textView;
    }

}
