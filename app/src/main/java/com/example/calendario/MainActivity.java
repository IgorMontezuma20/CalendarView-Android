package com.example.calendario;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import com.example.calendario.databinding.ActivityMainBinding;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;
import com.prolificinteractive.materialcalendarview.OnMonthChangedListener;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        /*binding.calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                Log.i("data: ","valor: " + dayOfMonth + "/" + month + "/"+year);
            }
        }); */

//        binding.calendarView.setOnDateChangedListener(new OnDateSelectedListener() {
//            @Override
//            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
//                Log.i("data: ","valor: " + date);
//            }
//        });

//        binding.calendarView.state().edit()
//                        .setMinimumDate(CalendarDay.from(2015,1, 1))
//                        .setMaximumDate(CalendarDay.from(2022, 12, 31))
//                        .commit();

        CharSequence meses[] = {"Janeiro", "Fevreiro", "Março", "Abril", "Maio", "Junho", "Julho",
        "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        CharSequence semanas[] = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab"};


        binding.calendarView.setTitleMonths(meses);
        binding.calendarView.setWeekDayLabels(semanas);

        binding.calendarView.setOnMonthChangedListener(new OnMonthChangedListener() {
            @Override
            public void onMonthChanged(MaterialCalendarView widget, CalendarDay date) {
                Log.i("data: ","valor: " + (date.getMonth()+1) +"/" + date.getYear());
            }
        });

    }
}