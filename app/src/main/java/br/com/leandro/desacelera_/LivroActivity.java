package br.com.leandro.desacelera_;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LivroActivity extends AppCompatActivity {

    private ImageButton BaixarEbookElsie;
    private ImageButton BaixarebookTatiana;
    private ImageButton BaixarEbookDiego;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livro);

        //button back to home
        ImageButton BotaoBackTelaLivro = (ImageButton) findViewById(R.id.imageButtonBackTelaLivro);

        BotaoBackTelaLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View back) {
                Intent b = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(b);
            }
        });
        //Downloads the ebooks
        BaixarEbookElsie = (ImageButton) findViewById(R.id.imageButtonBaixarEbookElsieHerber);
        BaixarEbookElsie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://ebook.elsieherber.com.br/?utm_source=google-ads3&utm_campaign=ebook-elsie&utm_medium=google-ads3-pesquisa&utm_content=ebook-elsie-pesquisa-ads3&gclid=CjwKCAjw_tWRBhAwEiwALxFPoSQ3f72sn2Xc0MhHqjNiO-aUOgEvmeN8rAEqw6Mg8NuTymgm8okc2RoCDgkQAvD_BwE")));
            }
        });
        BaixarebookTatiana = (ImageButton) findViewById(R.id.imageButtonBaixarEbookTatianaAuler);
        BaixarebookTatiana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.institutoauler.com.br/ebook-ansiedade-gratuito")));
            }
        });
        BaixarEbookDiego = (ImageButton) findViewById(R.id.imageButtonBaixarEbookDiegoFalco);
        BaixarEbookDiego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://terapiacognitivaonline.com/ebook-ansiedade/")));
            }
        });

        //CALL OF PAGES FOOTER
        ImageButton BotaoAjudaMeTelaLivro = (ImageButton) findViewById(R.id.imageButtonAjudaMenuTelaLivro);

        BotaoAjudaMeTelaLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnAjuda) {
                Intent i = new Intent(getApplicationContext(), AjudaActivity.class);
                startActivity(i);
            }
        });

        ImageButton BotaoLivroTelaLivro = (ImageButton) findViewById(R.id.imageButtonLivroMenuTelaLivro);

        BotaoLivroTelaLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLivro) {
                Intent l = new Intent(getApplicationContext(), LivroActivity.class);
                startActivity(l);
            }
        });

        ImageButton BotaoPlayListTelaLivro = (ImageButton) findViewById(R.id.imageButtonPlaylistMenuTelaLivro);

        BotaoPlayListTelaLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), PlayListActivity.class);
                startActivity(p);
            }
        });

        ImageButton BotaoExerciciosTelaLivro = (ImageButton) findViewById(R.id.imageButtonExercicioMenuTelaLivro);

        BotaoExerciciosTelaLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), ExerciciosActivity.class);
                startActivity(p);
            }
        });
        ImageButton BotaoCadastreSeTelaLivro = (ImageButton) findViewById(R.id.imageButtonCadastroMenuTelaLivro);

        BotaoCadastreSeTelaLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnCadastro) {
                Intent c = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(c);
            }
        });
        ImageButton BotaoLoginTelaLivro =(ImageButton) findViewById(R.id.imageButtonProfissionaisMenuTelaLivro);
        BotaoLoginTelaLivro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLogin) {
                Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(login);
            }
        });

    }
}