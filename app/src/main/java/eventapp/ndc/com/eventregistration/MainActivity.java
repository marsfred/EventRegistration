package eventapp.ndc.com.eventregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton  = (Button)findViewById(R.id.submitbutton);
        final EditText name = (EditText) findViewById(R.id.name);
        final EditText email = (EditText) findViewById(R.id.phone);
        final EditText phone = (EditText) findViewById(R.id.email);

        submitButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                       // TextView name = (TextView) findViewById(R.id.name);
                        //name.setText("Good Job for puttin Name");
                        Intent sender = new Intent(MainActivity.this, SaveActivity.class);

                        Bundle b1 = new Bundle(); //Bundle to wrap all data
                        b1.putString("name", name.getText().toString()); //Adding data to bundle
                        b1.putString("email", email.getText().toString());
                        b1.putString("phone", phone.getText().toString());
                        sender.putExtras(b1); //putExtras method to send the bundle
                        sender.putExtra("phone",phone.getText().toString());
                        startActivity(sender);
                        MainActivity.this.finish(); //Finish form activity to remove it from stack

                    }

                }

        );

        submitButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView name = (TextView) findViewById(R.id.name);
                        name.setText("That was long click!");
                        return true;

                    }

                }

        );


    }




}
