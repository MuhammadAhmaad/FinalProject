package example.example.com.androidjoketeller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeTellerActivity extends AppCompatActivity {

    public static final String JOKE = "joke";
    TextView jokeTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_teller);
        jokeTv = findViewById(R.id.joke_text_view);
        String joke = (String) getIntent().getExtras().get(JOKE);
        jokeTv.setText(joke);
    }
}
