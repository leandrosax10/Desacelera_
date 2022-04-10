package br.com.leandro.desacelera_;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import br.com.leandro.desacelera_.database.BancoSQLite;
import br.com.leandro.desacelera_.modelos.Profissional;

public class CadastroProfissionalActivity extends AppCompatActivity {

    EditText EditTextNomeProfissional;
    EditText EditTextSobreNomeProfissional;
    EditText EditTextEmailProfissional;
    EditText EditTextNumeroRegistroCRM;
    EditText EditTextDataNascimentoProfissional;
    EditText EditTextSenhaCadastroProfissional;
    Button BotaoCrieSeuCadastroProfissional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_profissional);

        EditTextNomeProfissional = findViewById(R.id.editTextNomeProfissional);
        EditTextSobreNomeProfissional = findViewById(R.id.editTextSobreNomeProfissional);
        EditTextEmailProfissional = findViewById(R.id.editTextEmailProfissional);
        EditTextNumeroRegistroCRM = findViewById(R.id.editTextNumeroRegistroCRM);
        EditTextDataNascimentoProfissional = findViewById(R.id.editTextDataNascimentoProfissional);
        EditTextSenhaCadastroProfissional = findViewById(R.id.editTextSenhaCadastroProfissional);
        BotaoCrieSeuCadastroProfissional = findViewById(R.id.buttonCrieSeuCadastroProfissional);

        BotaoCrieSeuCadastroProfissional.setOnClickListener(view -> {
            BancoSQLite db = new BancoSQLite(this);

            if(db.inserirProfissional(new Profissional(

                    EditTextNomeProfissional.getText().toString(),
                    EditTextSobreNomeProfissional.getText().toString(),
                    EditTextEmailProfissional.getText().toString(),
                    EditTextNumeroRegistroCRM.getText().toString(),
                    EditTextDataNascimentoProfissional.getText().toString(),
                    EditTextSenhaCadastroProfissional.getText().toString()))
            ){
                Toast.makeText(this, "Cadastrado com sucesso", Toast.LENGTH_SHORT).show();

            }else{
                Toast.makeText(this, "Não foi possível realizar o cadastro", Toast.LENGTH_SHORT).show();
            }

        });

        //button back to home
        ImageButton BotaoBackTelaCadastroProfissional = (ImageButton) findViewById(R.id.imageButtonBackTelaCadastroProfissional);

        BotaoBackTelaCadastroProfissional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View back) {
                Intent b = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(b);
            }
        });

        //CALL OF PAGES FOOTER
        ImageButton BotaoAjudaMeTelaCadastroProfissional = (ImageButton) findViewById(R.id.imageButtonAjudaMenuCadastroProfissional);

        BotaoAjudaMeTelaCadastroProfissional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnAjuda) {
                Intent i = new Intent(getApplicationContext(), AjudaActivity.class);
                startActivity(i);
            }
        });

        ImageButton BotaoLivroTelaCadastroProfissional = (ImageButton) findViewById(R.id.imageButtonLivroMenuCadastroProfissional);

        BotaoLivroTelaCadastroProfissional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLivro) {
                Intent l = new Intent(getApplicationContext(), LivroActivity.class);
                startActivity(l);
            }
        });

        ImageButton BotaoPlayListTelaCadastroProfissional = (ImageButton) findViewById(R.id.imageButtonPlaylistMenuCadastroProfissional);

        BotaoPlayListTelaCadastroProfissional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), PlayListActivity.class);
                startActivity(p);
            }
        });

        ImageButton BotaoExerciciosTelaCadastroProfissional = (ImageButton) findViewById(R.id.imageButtonExercicioMenuCadastroProfissional);

        BotaoExerciciosTelaCadastroProfissional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), ExerciciosActivity.class);
                startActivity(p);
            }
        });

        ImageButton BotaoCadastreSeTelaCadastroProfissional = (ImageButton) findViewById(R.id.imageButtonCadastroMenuCadastroProfissional);

        BotaoCadastreSeTelaCadastroProfissional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnCadastro) {
                Intent c = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(c);
            }
        });

        ImageButton BotaoLoginTelaCadastroProfissional =(ImageButton) findViewById(R.id.imageButtonProfissionaisMenuCadastroProfissional);
        BotaoLoginTelaCadastroProfissional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLogin) {
                Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(login);
            }
        });

    }
}