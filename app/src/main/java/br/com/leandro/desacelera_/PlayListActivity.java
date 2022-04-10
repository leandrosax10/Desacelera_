package br.com.leandro.desacelera_;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PlayListActivity extends AppCompatActivity {

    private ImageButton BotaoPlayListGospel;
    private ImageButton BotaoPlayListInstrumental;
    private ImageButton BotaoPlayListSonsNatureza;
    private ImageButton BotaoPlaylistInternacional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);

        //button back to home
        ImageButton BotaoBackTelaPlaylist = (ImageButton) findViewById(R.id.imageButtonBackTelaPlaylist);

        BotaoBackTelaPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View back) {
                Intent b = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(b);
            }
        });

        //Playlists in youtube
        BotaoPlayListGospel= (ImageButton) findViewById(R.id.imageButtonPlaylistGospel);
        BotaoPlayListGospel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=FKGp5q8ada8")));
            }
        });

        BotaoPlayListInstrumental= (ImageButton) findViewById(R.id.imageButtonPlaylistInstrumental);
        BotaoPlayListInstrumental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JsWE_jxhyoc")));
            }
        });

        BotaoPlayListSonsNatureza= (ImageButton) findViewById(R.id.imageButtonPlaylistSonsDaNatureza);
        BotaoPlayListSonsNatureza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=hp_LiPnWFQo")));
            }
        });

        BotaoPlaylistInternacional= (ImageButton) findViewById(R.id.imageButtonPlaylistInternacional);
        BotaoPlaylistInternacional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Rk3s2JScC44")));
            }
        });

        //CALL OF PAGES FOOTER
        ImageButton BotaoAjudaMeTelaPlaylist = (ImageButton) findViewById(R.id.imageButtonAjudaMenuTelaPlaylist);

        BotaoAjudaMeTelaPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnAjuda) {
                Intent i = new Intent(getApplicationContext(), AjudaActivity.class);
                startActivity(i);
            }
        });

        ImageButton BotaoLivroTelaPlaylist = (ImageButton) findViewById(R.id.imageButtonLivroMenuTelaPlaylist);

        BotaoLivroTelaPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLivro) {
                Intent l = new Intent(getApplicationContext(), LivroActivity.class);
                startActivity(l);
            }
        });

        ImageButton BotaoPlayListTelaPlaylist = (ImageButton) findViewById(R.id.imageButtonPlaylistMenuTelaPlaylist);

        BotaoPlayListTelaPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), PlayListActivity.class);
                startActivity(p);
            }
        });

        ImageButton BotaoExerciciosTelaPlaylist = (ImageButton) findViewById(R.id.imageButtonExercicioMenuTelaPlaylist);

        BotaoExerciciosTelaPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), ExerciciosActivity.class);
                startActivity(p);
            }
        });
        ImageButton BotaoCadastreSeTelaPlaylist = (ImageButton) findViewById(R.id.imageButtonCadastroMenuTelaPlaylist);

        BotaoCadastreSeTelaPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnCadastro) {
                Intent c = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(c);
            }
        });
        ImageButton BotaoLoginTelaPlaylist =(ImageButton) findViewById(R.id.imageButtonProfissionaisMenuTelaPlaylist);
        BotaoLoginTelaPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLogin) {
                Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(login);
            }
        });
    }
}