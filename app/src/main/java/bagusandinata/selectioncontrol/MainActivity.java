package bagusandinata.selectioncontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SwitchCompat switchCompat;
    AppCompatCheckBox checkBox;
    AppCompatRadioButton radioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchCompat = findViewById(R.id.switch_id);
        checkBox = findViewById(R.id.checkbox_id);
        radioButton = findViewById(R.id.radioButton1_id);
        radioGroup = findViewById(R.id.radioGroup_id);

        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(), Boolean.toString(isChecked), Toast.LENGTH_SHORT).show();
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(), Boolean.toString(isChecked), Toast.LENGTH_SHORT).show();
            }
        });

//        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                Toast.makeText(getApplicationContext(), Boolean.toString(isChecked), Toast.LENGTH_SHORT).show();
//            }
//        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){

                    case R.id.radioButton1_id:

                        Toast.makeText(getApplicationContext(), "Radio Button 1 ", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.radioButton2_id:

                        Toast.makeText(getApplicationContext(), "Radio Button 2", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

    }
}
