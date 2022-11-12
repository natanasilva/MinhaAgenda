package xyz.natanet.minhaagenda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.Nullable;


public class MainActivity extends Activity {

    protected void onCreate(@Nullable Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        Toast.makeText(this, "Natan Aguiar", Toast.LENGTH_LONG).show();
    }
}
