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
    AppCompatRadioButton radioButton1;
    AppCompatRadioButton radioButton2;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchCompat = findViewById(R.id.switch_id);
        checkBox = findViewById(R.id.checkbox_id);
        radioButton1 = findViewById(R.id.radioButton1_id);
        radioButton2 = findViewById(R.id.radioButton2_id);
        radioGroup = findViewById(R.id.radioGroup_id);

        lisSwitchCompact();

        lisCheckbox();

        //please select the listener to use (listener radio button or listener radio group
        //lisRadioButton();
        lisRadioGroup();



    }

    //listener switch compat
    private void lisSwitchCompact(){
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(), Boolean.toString(isChecked), Toast.LENGTH_SHORT).show();
            }
        });
    }

    //listener checkbox
    private void lisCheckbox(){
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //get true false checked
//                Toast.makeText(getApplicationContext(), Boolean.toString(isChecked), Toast.LENGTH_SHORT).show();

                //get text checkbox
                final String showText = checkBox.getText().toString().trim();
                Toast.makeText(getApplicationContext(), showText, Toast.LENGTH_SHORT).show();
            }
        });
    }

    //listener radio button
    private void lisRadioButton(){
        radioButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(), Boolean.toString(isChecked), Toast.LENGTH_SHORT).show();
            }
        });

        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(getApplicationContext(), Boolean.toString(isChecked), Toast.LENGTH_SHORT).show();
            }
        });
    }

    //listener radio group
    private void lisRadioGroup(){
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                final String showText;

                switch (checkedId){

                    case R.id.radioButton1_id:

                        showText = radioButton1.getText().toString();
                        //get text radio button
                        Toast.makeText(getApplicationContext(), showText, Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.radioButton2_id:

                        showText = radioButton2.getText().toString();
                        //get text radio button
                        Toast.makeText(getApplicationContext(), showText, Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });
    }


}
