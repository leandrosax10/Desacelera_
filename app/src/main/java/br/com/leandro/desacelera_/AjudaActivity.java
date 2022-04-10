package br.com.leandro.desacelera_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AjudaActivity extends AppCompatActivity {

    ImageButton BotaoBackTelaAjuda, BotaoAjudaMeTelaAjudaMe,  BotaoLivroTelaAjuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajuda);

        //button back to home
        BotaoBackTelaAjuda = findViewById(R.id.imageButtonBackTelaAjuda);
        BotaoBackTelaAjuda.setOnClickListener(evt-> proximaTela(MainActivity.class));

        //CALL OF PAGES FOOTER
        BotaoAjudaMeTelaAjudaMe = findViewById(R.id.imageButtonAjudaMenuTelaAjuda);
        BotaoAjudaMeTelaAjudaMe.setOnClickListener(evt -> proximaTela(AjudaActivity.class));

        BotaoLivroTelaAjuda = findViewById(R.id.imageButtonLivroMenuTelaAjuda);
        BotaoLivroTelaAjuda.setOnClickListener(evt-> proximaTela(LivroActivity.class));


        ImageButton BotaoPlayListTelaAjuda = (ImageButton) findViewById(R.id.imageButtonPlaylistMenuTelaAjuda);

        BotaoPlayListTelaAjuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), PlayListActivity.class);
                startActivity(p);
            }
        });

        ImageButton BotaoExerciciosTelaAjuda = (ImageButton) findViewById(R.id.imageButtonExerciciosMenuTelaAjuda);

        BotaoExerciciosTelaAjuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), ExerciciosActivity.class);
                startActivity(p);
            }
        });

        ImageButton BotaoCadastreSeTelaAjuda = (ImageButton) findViewById(R.id.imageButtonCadastroMenuTelaAjuda);

        BotaoCadastreSeTelaAjuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnCadastro) {
                Intent c = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(c);
            }
        });

        ImageButton BotaoLoginTelaAjuda = (ImageButton) findViewById(R.id.imageButtonProfissionaisMenuTelaAjuda);
        BotaoLoginTelaAjuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLogin) {
                Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(login);
            }
        });

    }

    //aqui entra o metodo do lambda

    public void proximaTela(Class x){
        Intent it = new Intent(getApplicationContext(),x);
        startActivity(it);

    }

}