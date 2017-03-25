package eventapp.ndc.com.eventregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SaveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        Bundle userinfo = getIntent().getExtras();
        StringBuilder display = new StringBuilder();
        display.append("\n").append(userinfo.getString("name"));
        display.append("\n").append(userinfo.getString("phone"));
        display.append("\n").append(userinfo.getString("email"));
        TextView displayText = (TextView) findViewById(R.id.display);
        displayText.setText(display.toString());
    }
}
