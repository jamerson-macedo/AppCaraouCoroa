package caraoucoroa.jmdevelopers.com.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
        private ImageView imageView;
        private ImageView botaovoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=findViewById(R.id.imagemID);
        botaovoltar=findViewById(R.id.botaovoltar);

        botaovoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // destrutir a actibity
                finish();
            }
        });

        Bundle dados=getIntent().getExtras();
        int numero=dados.getInt("numero");
        if(numero==0){
            imageView.setImageResource(R.drawable.moeda_cara);


        }
        else {
            imageView.setImageResource(R.drawable.moeda_coroa);
        }


    }
}
