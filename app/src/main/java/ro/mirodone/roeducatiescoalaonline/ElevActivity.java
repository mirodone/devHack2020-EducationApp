package ro.mirodone.roeducatiescoalaonline;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

public class ElevActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curs_zoom_part11);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Cursuri Elev");
    }

}
