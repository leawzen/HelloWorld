package my.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Show UI
        //R = resource
        setContentView(R.layout.activity_main);

        //Link UI to program
        textViewMessage = (TextView) findViewById(R.id.textViewMessage);
    }

    public void showMessage(View view) {
        textViewMessage.setText(getText(R.string.app_name) + " " + getText(R.string.my_name));
    }
}
