package demo.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {
    private EditText editTextMessage;
//    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);

        editTextMessage = findViewById(R.id.editTextMessage);
//        Вызов второй активности с помощью Слушателя(onClickListener)
//        buttonSend = findViewById(R.id.buttonSend);
//
//        buttonSend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String msg = editTextMessage.getText().toString();
//                Intent intent = new Intent(CreateMessageActivity.this, RecievedMessageActivity.class);
//                intent.putExtra("msg", msg);
//                startActivity(intent);
//            }
//        });
    }

    public void onClickMsg(View view) {
        String msg = editTextMessage.getText().toString();
        Intent intent = new Intent(this, RecievedMessageActivity.class);
        intent.putExtra("msg", msg);
        startActivity(intent);
    }
}
