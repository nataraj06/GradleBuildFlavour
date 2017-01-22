package productflavour.android.com.gradleproductflavour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Pointing to the corresponding url based on app variant
        Toast.makeText(this, "Service url from gradle" + BuildConfig.SERVICE_URL, Toast.LENGTH_LONG).show();
    }
}
