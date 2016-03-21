package pl.angrymarschmallow.calculatoran;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonChecker {

    /**
     * Dodaje kolejną liczbę do sekwencji w polu wprowadzania.
     * @param button wciśnięty button
     * @param editText pole wprowadzania
     */
    public void addNumeric(Button button, EditText editText) {
        editText.append(button.getText());
    }

    public void clearTextView(EditText editText) {
       editText.setText("");
    }

    public void clearOneCharacter(EditText editText) {
        String text = editText.getText().toString();
        // Zapobiega crashowaniu apki gdy nie było znaków.
        if(text.length() > 0) {
            text = text.substring(0, text.length() - 1);
            editText.setText(text);
        }
    }

}
