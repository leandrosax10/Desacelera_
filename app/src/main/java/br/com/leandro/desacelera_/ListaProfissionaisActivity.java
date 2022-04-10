package br.com.leandro.desacelera_;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import br.com.leandro.desacelera_.database.BancoSQLite;

public class ListaProfissionaisActivity extends AppCompatActivity {

    TextView TextViewListaNomeProfissional1, TextViewListaNomeProfissional2, TextViewListaNomeProfissional3;
    TextView TextViewListaNcRmProfissional1, TextViewListaNcRmProfissional2, TextViewListaNcRmProfissional3;
    TextView TextViewListaEmailProfissional1, TextViewListaEmailProfissional2, TextViewListaEmailProfissional3;
    Button SelecionaProfissional1, SelecionaProfissional2, SelecionaProfissional3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_profissionais);

        TextViewListaNomeProfissional1 = findViewById(R.id.textViewListaNomeProfissional1);
        TextViewListaNomeProfissional2 = findViewById(R.id.textViewListaNomeProfissional2);
        TextViewListaNomeProfissional3 = findViewById(R.id.textViewListaNomeProfissional3);

        TextViewListaNcRmProfissional1 = findViewById(R.id.textViewListaNcRmProfissional1);
        TextViewListaNcRmProfissional2 = findViewById(R.id.textViewListaNcRmProfissional2);
        TextViewListaNcRmProfissional3 = findViewById(R.id.textViewListaNcRmProfissional3);

        TextViewListaEmailProfissional1 = findViewById(R.id.textViewListaEmailProfissional1);
        TextViewListaEmailProfissional2 = findViewById(R.id.textViewListaEmailProfissional2);
        TextViewListaEmailProfissional3 = findViewById(R.id.textViewListaEmailProfissional3);

        SelecionaProfissional1 = findViewById(R.id.buttonSelecionaProfissional1);
        SelecionaProfissional2 = findViewById(R.id.buttonSelecionaProfissional2);
        SelecionaProfissional3 = findViewById(R.id.buttonSelecionaProfissional3);

        //Listar os profissionais
        BancoSQLite db = new BancoSQLite(this);
        Cursor cursor = db.listaProfissionais();
        cursor.moveToFirst();
        TextViewListaNomeProfissional1.setText(cursor.getString(1).toString());
        TextViewListaNcRmProfissional1.setText(cursor.getString(4).toString());
        TextViewListaEmailProfissional1.setText(cursor.getString(3).toString());
        cursor.moveToPosition(1);
        TextViewListaNomeProfissional2.setText(cursor.getString(1).toString());
        TextViewListaNcRmProfissional2.setText(cursor.getString(4).toString());
        TextViewListaEmailProfissional2.setText(cursor.getString(3).toString());
        cursor.moveToPosition(2);
        TextViewListaNomeProfissional3.setText(cursor.getString(1).toString());
        TextViewListaNcRmProfissional3.setText(cursor.getString(4).toString());
        TextViewListaEmailProfissional3.setText(cursor.getString(3).toString());

        //Abre a ficha de anamnese
       SelecionaProfissional1.setOnClickListener(evt-> proximaTela(FichaAnamneseActivity.class));
       SelecionaProfissional2.setOnClickListener(evt-> proximaTela(FichaAnamneseActivity.class));
       SelecionaProfissional3.setOnClickListener(evt-> proximaTela(FichaAnamneseActivity.class));



        //Botão de logoff
        ImageButton BotaoSairTelaListaProfissionais = (ImageButton) findViewById(R.id.imageButtonSairTelaLista);

        BotaoSairTelaListaProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View back) {
                Intent b = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(b);
            }
        });

        //back to the home
        ImageButton BotaoBackTelaListaProfissionais = (ImageButton) findViewById(R.id.imageButtonBackTelaLista);

        BotaoBackTelaListaProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View back) {
                Intent b = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(b);
            }
        });

        //CALL OF PAGES FOOTER
        ImageButton BotaoAjudaMeTelaLista = (ImageButton) findViewById(R.id.imageButtonAjudaMenuTelaLista);

        BotaoAjudaMeTelaLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnAjuda) {
                Intent i = new Intent(getApplicationContext(), AjudaActivity.class);
                startActivity(i);
            }
        });

        ImageButton BotaoLivroTelaLista = (ImageButton) findViewById(R.id.imageButtonLivroMenuTelaLista);

        BotaoLivroTelaLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLivro) {
                Intent l = new Intent(getApplicationContext(), LivroActivity.class);
                startActivity(l);
            }
        });

        ImageButton BotaoPlayListTelaLista = (ImageButton) findViewById(R.id.imageButtonPlaylistMenuTelaLista);

        BotaoPlayListTelaLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), PlayListActivity.class);
                startActivity(p);
            }
        });

        ImageButton BotaoExerciciosTelaLista = (ImageButton) findViewById(R.id.imageButtonExercicioMenuTelaLista);

        BotaoExerciciosTelaLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), ExerciciosActivity.class);
                startActivity(p);
            }
        });
        ImageButton BotaoCadastreSeTelaLista = (ImageButton) findViewById(R.id.imageButtonCadastroMenuTeLalista);

        BotaoCadastreSeTelaLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnCadastro) {
                Intent c = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(c);
            }
        });
        ImageButton BotaoLoginTelaLista =(ImageButton) findViewById(R.id.imageButtonProfissionaisMenuTelaLista);
        BotaoLoginTelaLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLogin) {
                Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(login);
            }
        });

    }

    public void proximaTela(Class x){
        Intent it = new Intent(getApplicationContext(),x);
        startActivity(it);

    }
}