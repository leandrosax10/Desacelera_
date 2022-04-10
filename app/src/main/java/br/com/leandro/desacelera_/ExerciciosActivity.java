package br.com.leandro.desacelera_;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ExerciciosActivity extends AppCompatActivity {

    private Button BotaoMaisExercicios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicios);

        ImageButton BotaoBackTelaExercicios = (ImageButton) findViewById(R.id.imageButtonBackTelaExercicios);

        BotaoBackTelaExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View back) {
                Intent b = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(b);
            }
        });

        BotaoMaisExercicios = (Button) findViewById(R.id.buttonMaisExercicios);
        BotaoMaisExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=A4tkULKy7RY")));
            }
        });

        //CALL OF PAGES FOOTER
        ImageButton BotaoAjudaMeTelaExercicios = (ImageButton) findViewById(R.id.imageButtonAjudaMenuTelaExercicios);

        BotaoAjudaMeTelaExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnAjuda) {
                Intent i = new Intent(getApplicationContext(), AjudaActivity.class);
                startActivity(i);
            }
        });

        ImageButton BotaoLivroTelaExercicios = (ImageButton) findViewById(R.id.imageButtonLivroMenuTelaExercicios);

        BotaoLivroTelaExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLivro) {
                Intent l = new Intent(getApplicationContext(), LivroActivity.class);
                startActivity(l);
            }
        });

        ImageButton BotaoPlayListTelaExercicios = (ImageButton) findViewById(R.id.imageButtonPlaylistMenuTelaExercicios);

        BotaoPlayListTelaExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), PlayListActivity.class);
                startActivity(p);
            }
        });

        ImageButton BotaoExerciciosTelaExercicios = (ImageButton) findViewById(R.id.imageButtonExercicioMenuTelaExercicios);

        BotaoExerciciosTelaExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), ExerciciosActivity.class);
                startActivity(p);
            }
        });
        ImageButton BotaoCadastreSeTelaExercicios = (ImageButton) findViewById(R.id.imageButtonCadastroMenuTelaExercicios);

        BotaoCadastreSeTelaExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnCadastro) {
                Intent c = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(c);
            }
        });
        ImageButton BotaoLoginTelaExercicios =(ImageButton) findViewById(R.id.imageButtonProfissionaisMenuTelaExercicios);
        BotaoLoginTelaExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLogin) {
                Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(login);
            }
        });


    }
}