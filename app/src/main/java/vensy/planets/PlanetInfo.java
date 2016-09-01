package vensy.planets;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vensy on 01.09.2016.
 */
public class PlanetInfo extends AppCompatActivity {
    ImageView pic;
    TextView name, diam, dist, period;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planet_info);

        pic = (ImageView) findViewById(R.id.pic);
        name = (TextView) findViewById(R.id.name);
        diam = (TextView) findViewById(R.id.diameter);
        dist = (TextView) findViewById(R.id.distance);
        period = (TextView) findViewById(R.id.period);

        pic.setImageResource(getIntent().getIntExtra("pic", android.R.drawable.ic_menu_help));
        name.setText(getIntent().getStringExtra("name"));
        diam.setText("Диаметр: " + getIntent().getStringExtra("diameter"));
        dist.setText("Расстояние от Солнца: " + getIntent().getStringExtra("distance"));
        period.setText("Период обращения: " + getIntent().getStringExtra("period"));
    }
}
