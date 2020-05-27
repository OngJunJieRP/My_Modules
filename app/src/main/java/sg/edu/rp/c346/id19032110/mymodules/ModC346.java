package sg.edu.rp.c346.id19032110.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModC346 extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod_c346);

        tvDisplay = findViewById(R.id.tvDisplay);
        //Intent intentReceived = getIntent();
        tvDisplay.setText("Module Code: C346" +
                "\nModule NAme: Android Programming" +
                "\nAcademic Year: 2020" +
                "\nSemester: 1" +
                "\nModule Credit: 4" +
                "\nVenue: W67R");
    }
}
