package splash.com.splashscreen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {


    EditText username;
    EditText password;
    Button login_button;
    TextView txt;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = (EditText) findViewById(R.id.txtuname);
        password = (EditText) findViewById(R.id.txtpass);
        login_button = (Button) findViewById(R.id.blogin);
        txt = (TextView) findViewById(R.id.ptext);

        login_button.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                if (username.getText().toString().equals("vipul") && password.getText().toString().equals("vipul")) {
                                                    Toast.makeText(MainActivity.this, "Welcome developer",
                                                            Toast.LENGTH_SHORT).show();
                                                    startActivity(new Intent(MainActivity.this, Menu.class));

                                                } else {
                                                    Toast.makeText(MainActivity.this, "Wrong Credentials",
                                                            Toast.LENGTH_SHORT).show();
                                                }

                                            }
                                        }
        );

    }
}