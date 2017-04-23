package css.cis3334trace.floormeasure;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {


   
    TextView tvResult;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        tvResult = (TextView)  findViewById(R.id.textViewResult);

        Intent intent = getIntent();
        String width = intent.getExtras().getString("Width");
        String length = intent.getExtras().getString("Length");



        double Width2 = Double.parseDouble(width);
        double Length2 = Double.parseDouble(length);
        double total = Width2 * Length2;
        tvResult.setText("width is " + Width2 + " Length is " + Length2 + " your total flooring needed is " + total);
    }

};
