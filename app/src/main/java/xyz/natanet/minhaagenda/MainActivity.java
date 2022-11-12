package xyz.natanet.minhaagenda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends Activity {

    protected void onCreate(@Nullable Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> alunos = new ArrayList<>(Arrays.asList("Alex", "Fran", "Jose"));
        TextView primeiroAluno = findViewById(R.id.nomeAluno1);
        TextView segundoAluno = findViewById(R.id.nomeAluno2);
        TextView terceiroAluno = findViewById(R.id.nomeAluno3);

        primeiroAluno.setText(alunos.get(0));
        segundoAluno.setText(alunos.get(1));
        terceiroAluno.setText(alunos.get(2));

    }
}
