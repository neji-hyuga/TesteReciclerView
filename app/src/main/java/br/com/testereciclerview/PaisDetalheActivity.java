package br.com.testereciclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import br.com.testereciclerview.model.Pais;

public class PaisDetalheActivity extends AppCompatActivity {

    private TextView nomePaisTextView;
    private TextView populacaoPaisTextView;
    private TextView idiomaPaisTextView;
    private ImageView bandeiraPaisImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pais_detalhe);

        //pega  a intenção da outra tela
        Intent intent = getIntent();

        //pega o bundle da outra tela
        Bundle bundle = intent.getExtras();

        Pais pais = (Pais) bundle.getSerializable("PAIS");

        nomePaisTextView = findViewById(R.id.nome_pais_text_view);
        populacaoPaisTextView = findViewById(R.id.populacao_text_view);
        idiomaPaisTextView = findViewById(R.id.idioma_pais_text_view);
        bandeiraPaisImageView = findViewById(R.id.flag_image);


        nomePaisTextView.setText(pais.getNome());
        idiomaPaisTextView.setText(pais.getIdioma());
        populacaoPaisTextView.setText(""+pais.getQuantidadeDeHabitantes());
        Picasso.get().load(pais.getBandeira()).into(bandeiraPaisImageView);

    }
}
