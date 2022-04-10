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
import br.com.leandro.desacelera_.modelos.Usuario;

public class CadastroUsuarioActivity extends AppCompatActivity {

    EditText EditextNomeUsuario;
    EditText EditextSobrenomeUsuario;
    EditText EditTextEmailUsuario;
    EditText EditTextDataNascimentoUsuario;
    EditText EditTextTelefoneUsuario;
    EditText EditTextSenhaCadastroUsuario;
    Button BotaoCrieSeuCadastroUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        EditextNomeUsuario = findViewById(R.id.editTextNomeUsuario);
        EditextSobrenomeUsuario = findViewById(R.id.editTextSobrenomeUsuario);
        EditTextEmailUsuario = findViewById(R.id.editTextEmailUsuario);
        EditTextDataNascimentoUsuario = findViewById(R.id.editTextDataNascimentoUsuario);
        EditTextTelefoneUsuario = findViewById(R.id.editTextTelefoneUsuario);
        EditTextSenhaCadastroUsuario = findViewById(R.id.editTextSenhaCadastroUsuario);
        BotaoCrieSeuCadastroUsuario = findViewById(R.id.buttonCrieSeuCadastroUsuario);

        BotaoCrieSeuCadastroUsuario.setOnClickListener(view -> {
            BancoSQLite db = new BancoSQLite(this);

            if(db.inserirUsuario(new Usuario(

                    EditextNomeUsuario.getText().toString(),
                    EditextSobrenomeUsuario.getText().toString(),
                    EditTextEmailUsuario.getText().toString(),
                    EditTextDataNascimentoUsuario.getText().toString(),
                    EditTextTelefoneUsuario.getText().toString(),
                    EditTextSenhaCadastroUsuario.getText().toString()))

            ){
                Toast.makeText(this,"Usuario cadastrado com sucesso!", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Não foi possível realizar o cadastro", Toast.LENGTH_LONG).show();
            }

        });

        //função back to home
        ImageButton BotaoBackTelaCadastroUsuario = (ImageButton) findViewById(R.id.imageButtonBackTelaCadastroUsuario);

        BotaoBackTelaCadastroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View back) {
                Intent b = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(b);
            }
        });

        //CALL OF PAGES FOOTER
        ImageButton BotaoAjudaMeTelaCadastroUsuario = (ImageButton) findViewById(R.id.imageButtonAjudaMenuTelaCadastroUsuario);

        BotaoAjudaMeTelaCadastroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnAjuda) {
                Intent i = new Intent(getApplicationContext(), AjudaActivity.class);
                startActivity(i);
            }
        });

        ImageButton BotaoLivroTelaCadastroUsuario = (ImageButton) findViewById(R.id.imageButtonLivroMenuTelaCadastroUsuario);

        BotaoLivroTelaCadastroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLivro) {
                Intent l = new Intent(getApplicationContext(), LivroActivity.class);
                startActivity(l);
            }
        });

        ImageButton BotaoPlayListTelaCadastroUsuario = (ImageButton) findViewById(R.id.imageButtonPlaylistMenuTelaCadastroUsuario);

        BotaoPlayListTelaCadastroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), PlayListActivity.class);
                startActivity(p);
            }
        });

        ImageButton BotaoExerciciosTelaCadastroUsuario = (ImageButton) findViewById(R.id.imageButtonExercicioMenuTelaCadastroUsuario);

        BotaoExerciciosTelaCadastroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnPlay) {
                Intent p = new Intent(getApplicationContext(), ExerciciosActivity.class);
                startActivity(p);
            }
        });
        ImageButton BotaoCadastreSeTelaCadastroUsuario = (ImageButton) findViewById(R.id.imageButtonCadastroMenuTelaCadastroUsuario);

        BotaoCadastreSeTelaCadastroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnCadastro) {
                Intent c = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(c);
            }
        });

        ImageButton BotaoLoginTelaCadastroUsuario =(ImageButton) findViewById(R.id.imageButtonProfissionaisMenuTelaCadastroUsuario);
        BotaoLoginTelaCadastroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View btnLogin) {
                Intent login = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(login);
            }
        });

    }
}