package mrietunjoy.androidbasics;

import android.app.DatePickerDialog;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class cal_date extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    TextView date;
    Button pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        pd = (Button)findViewById(R.id.pd);
        pd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datepicker = new mrietunjoy.androidbasics.DatePicker();
                datepicker.show(getSupportFragmentManager(), "date picker");

            }
        });
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);

        String dateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        date = (TextView)findViewById(R.id.date);
        date.setText(dateString);
    }
}
