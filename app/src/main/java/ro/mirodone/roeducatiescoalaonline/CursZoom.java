package ro.mirodone.roeducatiescoalaonline;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CursZoom extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.curs_zoom_activity);


        Button btn_1,btn_2,btn_3,btn_4;
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Curs Zoom");

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_1:
                showAlertBtn1();
                break;
            case R.id.btn_2:
                showAlertBtn2();
                break;
            case R.id.btn_3:
                showAlertBtn3();
                break;
            case R.id.btn_4:
                showAlertBtn4();
                break;
            default:
                break;
        }

    }

    public void showAlertBtn1() {
        AlertDialog.Builder builderSingle = new AlertDialog.Builder(CursZoom.this);
        builderSingle.setIcon(R.drawable.icon_zoom_s);
        builderSingle.setTitle("Selecteaza tutorial:");

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(CursZoom.this, android.R.layout.select_dialog_singlechoice);
        arrayAdapter.add("1. Cum creezi un cont Zoom pe un PC cu Windows sau pe un Mac");
        arrayAdapter.add("2. Cum creezi un cont Zoom pe un dispozitiv cu Android sau pe un iPhone/iPad");


        builderSingle.setNegativeButton("Inchide", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builderSingle.setAdapter(arrayAdapter, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String strName = arrayAdapter.getItem(which);
                AlertDialog.Builder builderInner = new AlertDialog.Builder(CursZoom.this);
                builderInner.setMessage(strName);
                builderInner.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog,int which) {

                        Intent mainIntent = new Intent(CursZoom.this, ElevActivity.class);
                        startActivity(mainIntent);

                        dialog.dismiss();
                    }
                });
                builderInner.show();
            }
        });
        builderSingle.show();
    }

    public void showAlertBtn2() {
        AlertDialog.Builder builderSingle = new AlertDialog.Builder(CursZoom.this);
        builderSingle.setIcon(R.drawable.icon_zoom_s);
        builderSingle.setTitle("Selecteaza tutorial:");

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(CursZoom.this, android.R.layout.select_dialog_singlechoice);
        arrayAdapter.add("1. ID sedinta si parola");
        arrayAdapter.add("2. Cum intri într-o conferință Zoom din aplicația Zoom Cloud Meetings, de pe un PC cu Windows sau Mac ");
        arrayAdapter.add("3. Cum intri într-o conferință Zoom dintr-un browser web pe un PC cu Windows PC sau Mac, când ai clientul desktop Zoom instalat");
        arrayAdapter.add("4. Cum intri într-o ședință Zoom dintr-un browser web pe un PC cu Windows sau pe un Mac, fără a instala clientul desktop ZoomID sedinta si parola");
        arrayAdapter.add("5. Cum intri într-o conferință Zoom de pe un dispozitiv cu Android sau de pe un iPhone/iPad");
        arrayAdapter.add("6. Invitarea participantilor");
        arrayAdapter.add("7. Cum intri într-o ședință Zoom dacă ești deja online în aplicația Zoom, pe orice platformă");
        arrayAdapter.add("8. Cum intri într-o conferință Zoom doar prin telefon");


        builderSingle.setNegativeButton("Inchide", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builderSingle.setAdapter(arrayAdapter, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String strName = arrayAdapter.getItem(which);
                AlertDialog.Builder builderInner = new AlertDialog.Builder(CursZoom.this);
                builderInner.setMessage(strName);
                builderInner.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog,int which) {


                        dialog.dismiss();
                    }
                });
                builderInner.show();
            }
        });
        builderSingle.show();
    }

    public void showAlertBtn3() {
        AlertDialog.Builder builderSingle = new AlertDialog.Builder(CursZoom.this);
        builderSingle.setIcon(R.drawable.icon_zoom_s);
        builderSingle.setTitle("Selecteaza tutorial:");

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(CursZoom.this, android.R.layout.select_dialog_singlechoice);
        arrayAdapter.add("1. Mute/oprire sunet");
        arrayAdapter.add("2. Share/partajeaza");
        arrayAdapter.add("3. Chat");
        arrayAdapter.add("4. Breakout rooms/ Partajare Camere");
        arrayAdapter.add("5. Record/ Inregistrare");
        arrayAdapter.add("6. Video");


        builderSingle.setNegativeButton("Inchide", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builderSingle.setAdapter(arrayAdapter, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String strName = arrayAdapter.getItem(which);
                AlertDialog.Builder builderInner = new AlertDialog.Builder(CursZoom.this);
                builderInner.setMessage(strName);
                builderInner.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog,int which) {
                        dialog.dismiss();
                    }
                });
                builderInner.show();
            }
        });
        builderSingle.show();
    }

    public void showAlertBtn4() {

        Intent mainIntent = new Intent(CursZoom.this, TestActivity.class);
        startActivity(mainIntent);


    }

}
