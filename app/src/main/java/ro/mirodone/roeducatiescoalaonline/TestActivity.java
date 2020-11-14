package ro.mirodone.roeducatiescoalaonline;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {


    public int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
    }


    public void question_1() {

        RadioButton c = findViewById(R.id.radio_c);

        if (c.isChecked()) {
            score += 1;
        }
    }

    public void question_2() {

        RadioButton a = findViewById(R.id.radio_false);

        if (a.isChecked()) {
            score += 1;
        }
    }

    private void question_three() {

        EditText question_answer = findViewById(R.id.question_response_text);
        String answer = question_answer.getText().toString();
        if (answer.equalsIgnoreCase("Da")) {
            score += 1;
        }
    }





    private void finalScore() {
        score = 0;
        question_1();
        question_2();
        question_three();

    }

    public void submitAnswers(View view) {

        finalScore();
        //Get user's name
       // EditText nameField = findViewById(R.id.name_field_text);
      //  String userName = nameField.getText().toString();
        Toast toast = Toast.makeText(this,  "your score is: " + score + "/3", Toast.LENGTH_LONG);
        toast.show();
    }


}
