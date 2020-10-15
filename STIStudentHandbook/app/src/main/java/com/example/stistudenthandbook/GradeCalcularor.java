package com.example.stistudenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GradeCalcularor extends AppCompatActivity {

    EditText PrelimETxt, MidtermETxt, PreFinalsETxt, FinalsETxt;
    Button Clearbtn, Calculatebtn;
    TextView Averagetxt, Gradetxt, Remarktxt;
    Double PrelimGrade, MidtermGrade, PreFinalsGrade, FinalsGrade, AverageGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_calcularor);

        PrelimETxt = findViewById(R.id.etxtPrelim);
        MidtermETxt = findViewById(R.id.etxtMidterm);
        PreFinalsETxt = findViewById(R.id.etxtPreFinals);
        FinalsETxt = findViewById(R.id.etxtFinals);

        Clearbtn = findViewById(R.id.btnClear);
        Calculatebtn = findViewById(R.id.btnCalculate);

        Averagetxt = findViewById(R.id.txtAvegare);
        Gradetxt = findViewById(R.id.txtGrade);
        Remarktxt = findViewById(R.id.txtRemark);

        Calculatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PrelimGrade = Double.parseDouble(PrelimETxt.getText().toString());
                MidtermGrade = Double.parseDouble(MidtermETxt.getText().toString());
                PreFinalsGrade =Double.parseDouble(PreFinalsETxt.getText().toString());
                FinalsGrade = Double.parseDouble(FinalsETxt.getText().toString());

                if((PrelimGrade > 100)||(MidtermGrade > 100)||(PreFinalsGrade > 100)||(FinalsGrade > 100))
                {
                    PrelimETxt.getText().clear();
                    MidtermETxt.getText().clear();
                    PreFinalsETxt.getText().clear();
                    FinalsETxt .getText().clear();
                }
                else {
                    AverageGrade = (PrelimGrade * .20 + MidtermGrade * .20 + PreFinalsGrade * .20 + FinalsGrade * .40);
                    Averagetxt.setText((String.format("%.2f",AverageGrade)));

                    if (AverageGrade >= 97.50) {
                        Gradetxt.setText("1.00");
                        Remarktxt.setText("Exellent");
                    } else if (AverageGrade >= 94.50) {
                        Gradetxt.setText("1.25");
                        Remarktxt.setText("Very Good");
                    } else if (AverageGrade >= 91.50) {
                        Gradetxt.setText("1.50");
                        Remarktxt.setText("Very Good");
                    } else if (AverageGrade >= 88.50) {
                        Gradetxt.setText("1.75");
                        Remarktxt.setText("Very Good");
                    } else if (AverageGrade >= 85.50) {
                        Gradetxt.setText("2.00");
                        Remarktxt.setText("Satisfactory");
                    } else if (AverageGrade >= 82.50) {
                        Gradetxt.setText("2.25");
                        Remarktxt.setText("Satisfactory");
                    } else if (AverageGrade >= 79.50) {
                        Gradetxt.setText("2.50");
                        Remarktxt.setText("Satisfactory");
                    } else if (AverageGrade >= 76.50) {
                        Gradetxt.setText("2.75");
                        Remarktxt.setText("Fair");
                    } else if (AverageGrade >= 74.50) {
                        Gradetxt.setText("3.00");
                        Remarktxt.setText("Fair");
                    } else {
                        Gradetxt.setText("5.00");
                        Remarktxt.setText("Failed");
                    }
                }
            }
        });

        Clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PrelimETxt.getText().clear();
                MidtermETxt.getText().clear();
                PreFinalsETxt.getText().clear();
                FinalsETxt .getText().clear();
                Averagetxt.setText("0.0");
                Gradetxt.setText("0.0");
                Remarktxt.setText("Remarks");
            }
        });

    }
}