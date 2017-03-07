package css.cis3334trace.floormeasure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText etWidth;
    EditText etLength;
    Button btnResult;



    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);

        etWidth = (EditText) findViewById(R.id.editTextWidth);
        etLength = (EditText) findViewById(R.id.editTextLength);
        btnResult = (Button) findViewById(R.id.buttonResult);}


            public void onClickResult(View view) {


                String Width = etWidth.getText().toString();
                String Length = etLength.getText().toString();

                Intent secActIntent = new Intent (this, ResultActivity.class);
                secActIntent.putExtra("Width", Width);
                secActIntent.putExtra("Length", Length);
                startActivity(secActIntent);
            }


            }