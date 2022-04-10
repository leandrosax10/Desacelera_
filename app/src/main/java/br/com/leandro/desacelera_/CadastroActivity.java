package br.com.leandro.desacelera_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        //Back to the home
        ImageButton BotaoBackTelaCadastro = (ImageButton) findViewById(R.id.imageButtonBackTelaCadastro);

        BotaoBackTelaCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View back) {
                Intent b = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(b);
            }
        });
        //Call pages User and profile
        Button BotaoCadastroUsuario = (Button) findViewById(R.id.buttonCadastroUsuario);

        BotaoCadastroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnCadastro) {
                Intent cadastro = new Intent(getApplicationContext(), CadastroUsuarioActivity.class);
                startActivity(cadastro);
            }
        });

        Button BotaoCadastroProfissional = (Button) findViewById(R.id.buttonCadastroProfissional);

        BotaoCadastroProfissional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnCadastroP) {
                Intent cadastroP = new Intent(getApplicationContext(), CadastroProfissionalActivity.class);
                startActivity(cadastroP);
            }
        });

        //CALL OF PAGES FOOTER
        ImageButton BotaoAjudaMeTelaCadastro = (ImageButton) findViewById(R.id.imageButtonAjudaMenuTelaCadastro);

        BotaoAjudaMeTelaCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnAjuda) {
                Intent i = new Intent(getApplicationContext(), AjudaActivity.class);
                startActivity(i);
            }
        });

        ImageButton BotaoLivroTelaCadastro = (ImageButton) findViewById(R.id.imageButtonLivroMenuTelaCadastro);

        BotaoLivroTelaCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLivro) {
                Intent l = new Intent(getApplicationContext(), LivroActivity.class);
                startActivity(l);
            }
        });

        ImageButton BotaoPlayListTelaCadastro = (ImageButton) findViewById(R.id.imageButtonPlaylistMenuTelaCadastro);

        BotaoPlayListTelaCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), PlayListActivity.class);
                startActivity(p);
            }
        });

        ImageButton BotaoExerciciosTelaCadastro = (ImageButton) findViewById(R.id.imageButtonExercicioMenuTelaCadastro);

        BotaoExerciciosTelaCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), ExerciciosActivity.class);
                startActivity(p);
            }
        });
        ImageButton BotaoCadastreSeTelaCadastro = (ImageButton) findViewById(R.id.imageButtonCadastroMenuTelaCadastro);

        BotaoCadastreSeTelaCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnCadastro) {
                Intent c = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(c);
            }
        });
        ImageButton BotaoLoginTelaCadastro =(ImageButton) findViewById(R.id.imageButtonProfissionaisMenuTelaCadastro);
        BotaoLoginTelaCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLogin) {
                Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(login);
            }
        });
    }
}