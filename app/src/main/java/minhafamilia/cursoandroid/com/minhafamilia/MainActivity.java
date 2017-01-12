package minhafamilia.cursoandroid.com.minhafamilia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoPai;
    private Button botaoMae;
    private Button botaoEu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoPai = (Button) findViewById(R.id.botaopaiID);
        botaoMae = (Button) findViewById(R.id.botaomaeID);
        botaoEu = (Button) findViewById(R.id.botaoeuID);

        botaoPai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //criação de uma variável do tipo Intent com o nome intent e instanciá-la com o new e passando de activity main para a outra
                Intent paiIntent = new Intent(MainActivity.this, paiActivity.class);

                //método putExtra que altera valores na variável intent
                paiIntent.putExtra("name", "Divino Evangelista Aizza");

                //método que apresenta o objeto intent
                startActivity(paiIntent);
            }
        });

        botaoMae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //criação de uma variável do tipo Intent com o nome intent e instanciá-la com o new e passando de activity main para a outra
                Intent maeIntent = new Intent(MainActivity.this, paiActivity.class);

                //método putExtra que altera valores na variável intent
                maeIntent.putExtra("name", "Jocélia Souza Santos Aizza");

                //método que apresenta o objeto intent
                startActivity(maeIntent);
            }
        });

        botaoEu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //criação de uma variável do tipo Intent com o nome intent e instanciá-la com o new e passando de activity main para a outra
                Intent euIntent = new Intent(MainActivity.this, paiActivity.class);

                //método putExtra que altera valores na variável intent
                euIntent.putExtra("name", "Salatiel Aizza Souza Santos");

                //método que apresenta o objeto intent
                startActivity(euIntent);
            }
        });


    }
}
