package com.example.tassa.absen1;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by Lenovo on 31/05/2017.
 */

public class DescriptionActivity extends AppCompatActivity implements View.OnClickListener {
    TextView matkulTxt, prodiTxt, dosenTxt, descTxt;
    Button bfecha;
    EditText efecha;
    private  int dia,mes,ano,hora,minutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_activity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        matkulTxt = (TextView) findViewById(R.id.matakuliahdetail);
        prodiTxt= (TextView) findViewById(R.id.prodi_detail);
        dosenTxt = (TextView) findViewById(R.id.dosen_detail);
        descTxt = (TextView) findViewById(R.id.detail_matkul_desc);


        //GET INTENT
        Intent i=this.getIntent();


        //RECEIVE DATA
        String matkul=i.getExtras().getString("MATKUL_KEY");
        String prodi=i.getExtras().getString("PRODI_KEY");
        String dosen=i.getExtras().getString("DOSEN_KEY");
        String detail=i.getExtras().getString("DETAIL_KEY");

        //BIND DATA
        matkulTxt.setText(matkul);
        prodiTxt.setText(prodi);
        dosenTxt.setText(dosen);
        descTxt.setText(detail);

       Spinner staticSpinner = (Spinner) findViewById(R.id.spinner);

        // Create an ArrayAdapter using the string array and a default spinner
       ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                .createFromResource(this, R.array.pertemuan,
                       android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
 staticAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
       staticSpinner.setAdapter(staticAdapter);
        bfecha=(Button)findViewById(R.id.bfecha);
        efecha=(EditText)findViewById(R.id.efecha);
        bfecha.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == bfecha) {
            final Calendar c = Calendar.getInstance();
            dia = c.get(Calendar.DAY_OF_MONTH);
            mes = c.get(Calendar.MONTH);
            ano = c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    efecha.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                }
            }
                    , dia, mes, ano);
            datePickerDialog.show();
        }
    }
}
