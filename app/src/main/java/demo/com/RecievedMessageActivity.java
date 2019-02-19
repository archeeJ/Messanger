package demo.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class RecievedMessageActivity extends AppCompatActivity {

    private TextView textViewRecievedMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved_message);

        textViewRecievedMsg = findViewById(R.id.textViewRecievedMsg);

        Intent intent = getIntent();
        String msg = intent.getStringExtra("msg");
        textViewRecievedMsg.setText(msg);
    }
}
