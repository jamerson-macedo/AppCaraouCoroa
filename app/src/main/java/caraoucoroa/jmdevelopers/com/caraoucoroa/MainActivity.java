package caraoucoroa.jmdevelopers.com.caraoucoroa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button botaojogar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaojogar= findViewById(R.id.botaojogar);
        botaojogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                // passar dados
                int numero=new Random().nextInt(2);
                intent.putExtra("numero",numero);

                startActivity(intent);

            }
        });

    }
}
