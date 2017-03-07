package css.cis3334trace.floormeasure;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {


    String Width;
    String Length;
    TextView tvResult;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        tvResult = (TextView)  findViewById(R.id.textViewResult);

        Bundle extras = getIntent().getExtras();

        Width = extras.getSerializable("Width").toString();
        Length = extras.getSerializable("Length").toString();


        double Width2 = Double.parseDouble("Width");
        double Length2 = Double.parseDouble("Length");
        double total = Width2 * Length2;
        tvResult.setText("with is " + Width2 + " Length is " + Length2 + " your total flooring needed is " + total);
    }

};
