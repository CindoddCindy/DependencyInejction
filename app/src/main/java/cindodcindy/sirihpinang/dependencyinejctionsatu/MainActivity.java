package cindodcindy.sirihpinang.dependencyinejctionsatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textView_view_di;

    public Button button_view_di;

    String namaPedang="api";
    String namaTombak="air";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_view_di=findViewById(R.id.tv_di);
        button_view_di=findViewById(R.id.btn_viewdi);

        final Senjata senjata= new Senjata(namaPedang, namaTombak);

        final LightKnight lightKnight= new LightKnight(senjata);
        final DarkKnight darkKnight = new DarkKnight(senjata);



        button_view_di.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView_view_di.setText(lightKnight.setEquip());
                textView_view_di.setText(darkKnight.setEquip());

            }
        });
    }
}
