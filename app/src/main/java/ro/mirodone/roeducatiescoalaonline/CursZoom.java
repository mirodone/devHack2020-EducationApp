package ro.mirodone.roeducatiescoalaonline;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CursZoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curs_zoom_activity);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Curs Zoom");
    }

}
