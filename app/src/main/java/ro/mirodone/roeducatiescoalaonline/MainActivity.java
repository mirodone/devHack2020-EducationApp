package ro.mirodone.roeducatiescoalaonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button elevButton = findViewById(R.id.button_elev);
        Button profesorButton = findViewById(R.id.button_profesor);


        elevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, ElevActivity.class);
                startActivity(mainIntent);

            }
        });

        profesorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(MainActivity.this, ProfesorActivity.class);
                startActivity(mainIntent);

            }
        });
    }
}
