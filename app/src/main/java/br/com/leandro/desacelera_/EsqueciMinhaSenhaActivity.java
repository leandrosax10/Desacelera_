package br.com.leandro.desacelera_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class EsqueciMinhaSenhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci_minha_senha);

        //back to the home
        ImageButton BotaoBackTelaEsqueciSenha = (ImageButton) findViewById(R.id.imageButtonBackTelaEsqueciSenha);

        BotaoBackTelaEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View back) {
                Intent b = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(b);
            }
        });

        //CALL OF PAGES FOOTER
        ImageButton BotaoAjudaMeTelaEsqueciSenha = (ImageButton) findViewById(R.id.imageButtonAjudaMenuTelaEsqueciSenha);

        BotaoAjudaMeTelaEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnAjuda) {
                Intent i = new Intent(getApplicationContext(), AjudaActivity.class);
                startActivity(i);
            }
        });

        ImageButton BotaoLivroTelaEsqueciSenha = (ImageButton) findViewById(R.id.imageButtonLivroMenuTelaEsqueciSenha);

        BotaoLivroTelaEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLivro) {
                Intent l = new Intent(getApplicationContext(), LivroActivity.class);
                startActivity(l);
            }
        });

        ImageButton BotaoPlayListTelaEsqueciSenha = (ImageButton) findViewById(R.id.imageButtonPlaylistMenuTelaEsqueciSenha);

        BotaoPlayListTelaEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), PlayListActivity.class);
                startActivity(p);
            }
        });

        ImageButton BotaoExerciciosTelaEsqueciSenha = (ImageButton) findViewById(R.id.imageButtonExercicioMenuTelaEsqueciSenha);

        BotaoExerciciosTelaEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), ExerciciosActivity.class);
                startActivity(p);
            }
        });
        ImageButton BotaoCadastreSeTelaEsqueciSenha = (ImageButton) findViewById(R.id.imageButtonCadastroMenuTelaEsqueciSenha);

        BotaoCadastreSeTelaEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnCadastro) {
                Intent c = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(c);
            }
        });
        ImageButton BotaoLoginTelaEsqueciSenha =(ImageButton) findViewById(R.id.imageButtonProfissionaisMenuTelaEsqueciSenha);
        BotaoLoginTelaEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLogin) {
                Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(login);
            }
        });



    }
}