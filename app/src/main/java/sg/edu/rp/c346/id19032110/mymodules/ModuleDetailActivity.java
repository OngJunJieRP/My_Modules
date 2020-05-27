package sg.edu.rp.c346.id19032110.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView mod346;
    TextView mod349;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        mod346 = findViewById(R.id.tvModC346);
        mod349 = findViewById(R.id.tvModC349);
        tvDisplay = findViewById(R.id.tvDisplay);

        Intent intentReceived = getIntent();
        int modNum = intentReceived.getIntExtra("Mod" , 0);

        if (modNum == 346) {
            tvDisplay.setText("Module Code: C346" +
                    "\nModule Name: Android Programming" +
                    "\nAcademic Year: 2020" +
                    "\nSemester: 1" +
                    "\nModule Credit: 4" +
                    "\nVenue: W66M");
        }

        else if (modNum == 349) {
            tvDisplay.setText("Module Code: C349" +
                    "\nModule Name: iPad Programming" +
                    "\nAcademic Year: 2020" +
                    "\nSemester: 1" +
                    "\nModule Credit: 4" +
                    "\nVenue: W66M");
        }
    }
}
