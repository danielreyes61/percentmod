package win.crypt.percentmod.percentmod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private AdView mAdView;
    Button btnCalc;
    Button btnReset;
    TextView textResult;
    EditText enterMax;
    EditText enterMin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        btnCalc = (Button)findViewById(R.id.button);
        btnReset = (Button)findViewById(R.id.button2);
        enterMax = (EditText)findViewById(R.id.editTextMax);
        enterMin = (EditText)findViewById(R.id.editText2Min);

        textResult = (TextView)findViewById(R.id.textView);

        btnCalc.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String strMax = enterMax.getText().toString();
                String strMin = enterMin.getText().toString();
                float fMax = Float.parseFloat(strMax);
                float fMin = Float.parseFloat(strMin);
                float diff = fMax - fMin;
                float sum = fMax + fMin;
                float div = diff / sum;
                float result = div * 100;
                textResult.setText(String.valueOf(result));
            }





        });

        btnReset.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                textResult.setText(String.valueOf(""));
                enterMax.setText("");
                enterMin.setText("");
            }





        });




    }
}
