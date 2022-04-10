package br.com.leandro.desacelera_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import br.com.leandro.desacelera_.database.BancoSQLite;
import br.com.leandro.desacelera_.modelos.FichaAnamnese;

public class FichaAnamneseActivity extends AppCompatActivity {

    EditText EditTextOqueVoceEstaSentindo, EditTextComoComecou, EditTextFoiRepentino, EditTextQuaisSintomas;
    Button BotaoEnviarFichaAnamnese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ficha_anamnese);

        EditTextOqueVoceEstaSentindo = findViewById(R.id.editTextOqueVoceEstaSentindo);
        EditTextComoComecou = findViewById(R.id.editTextComoComecou);
        EditTextFoiRepentino = findViewById(R.id.editTextFoiRepentino);
        EditTextQuaisSintomas = findViewById(R.id.editTextQuaisSintomas);
        BotaoEnviarFichaAnamnese = findViewById(R.id.buttonEnviarFichaAnamnese);

        BotaoEnviarFichaAnamnese.setOnClickListener(view -> {
            BancoSQLite db = new BancoSQLite(this);

            if(db.inserirFicha(new FichaAnamnese(
                    EditTextOqueVoceEstaSentindo.getText().toString(),
                    EditTextComoComecou.getText().toString(),
                    EditTextFoiRepentino.getText().toString(),
                    EditTextQuaisSintomas.getText().toString() ))

            ){
                Toast.makeText(this,"Enviado com sucesso!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Preencha a ficha para prosseguir.", Toast.LENGTH_LONG).show();
            }
        });

        //back to the home
        ImageButton BotaoBackFichaAnamnese = (ImageButton) findViewById(R.id.imageButtonBackTelaFichaAnamnese);

        BotaoBackFichaAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View back) {
                Intent b = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(b);
            }
        });

        //CALL OF PAGES FOOTER
        ImageButton BotaoAjudaMeTelaFichaAnamnese = (ImageButton) findViewById(R.id.imageButtonAjudaMenuTelaFichaAnamnese);

        BotaoAjudaMeTelaFichaAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnAjuda) {
                Intent i = new Intent(getApplicationContext(), AjudaActivity.class);
                startActivity(i);
            }
        });

        ImageButton BotaoLivroTelaFichaAnamnese = (ImageButton) findViewById(R.id.imageButtonLivroMenuTelaFichaAnamnese);

        BotaoLivroTelaFichaAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLivro) {
                Intent l = new Intent(getApplicationContext(), LivroActivity.class);
                startActivity(l);
            }
        });

        ImageButton BotaoPlayListTelaFichaAnamnese = (ImageButton) findViewById(R.id.imageButtonPlaylistMenuTelaFichaAnamnese);

        BotaoPlayListTelaFichaAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), PlayListActivity.class);
                startActivity(p);
            }
        });

        ImageButton BotaoExerciciosTelaFichaAnamnese = (ImageButton) findViewById(R.id.imageButtonExercicioMenuTelaFichaAnamnese);

        BotaoExerciciosTelaFichaAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), ExerciciosActivity.class);
                startActivity(p);
            }
        });
        ImageButton BotaoCadastreSeTelaFichaAnamnese = (ImageButton) findViewById(R.id.imageButtonCadastroMenuTelaFichaAnamnese);

        BotaoCadastreSeTelaFichaAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnCadastro) {
                Intent c = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(c);
            }
        });
        ImageButton BotaoLoginTelaFichaAnamnese =(ImageButton) findViewById(R.id.imageButtonProfissionaisMenuTelaFichaAnamnese);
        BotaoLoginTelaFichaAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLogin) {
                Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(login);
            }
        });
    }
}