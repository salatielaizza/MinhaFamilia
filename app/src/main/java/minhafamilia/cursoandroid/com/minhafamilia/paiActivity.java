package minhafamilia.cursoandroid.com.minhafamilia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class paiActivity extends AppCompatActivity {

    private TextView textoPai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pai);

        textoPai = (TextView) findViewById(R.id.textoPaiID);

        //método que recupera o intente e o método extra
        Bundle recuperationPai = getIntent().getExtras();

        //verifica se o extra está vazio, caso contrário  apresenta o texto
        if(recuperationPai != null) {
            String textoAlterado = recuperationPai.getString("name");
            textoPai.setText(textoAlterado);
        }

    }
}
