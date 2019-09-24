package mrietunjoy.androidbasics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

public class CheckBox extends AppCompatActivity {

    android.widget.CheckBox cb1, cb2;
    Button bu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        Button bu2= (Button)findViewById(R.id.bu2);
        Button bu= (Button)findViewById(R.id.Cal);

        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(CheckBox.this, cal_date.class);
                startActivity(i);

            }
        });

        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cb1 = findViewById(R.id.cb1);
                cb2 = findViewById(R.id.cb2);

                StringBuilder checked=new StringBuilder();
                if(cb1.isChecked()){
                    checked.append("O1 \n");
                }if(cb2.isChecked()){
                    checked.append("O2 \n");
                }

                Toast.makeText(CheckBox.this, checked, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
