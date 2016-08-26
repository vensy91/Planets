package vensy.planets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView RecView;
    private RecyclerAdapter Adapter;
    private RecyclerView.LayoutManager LayoutManager;
    private List<Planet> planets = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecView = (RecyclerView) findViewById(R.id.recycler_view);

        RecView.setHasFixedSize(true);

        LayoutManager = new LinearLayoutManager(this);
        RecView.setLayoutManager(LayoutManager);

        Adapter = new RecyclerAdapter(loadData());
        RecView.setAdapter(Adapter);

        Adapter.SetOnItemClickListener(new RecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getApplicationContext(), "Расстояние до Солнца: " + planets.get(position).getDist(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<Planet> loadData(){
        planets.add(new Planet(R.drawable.mercury, "Меркурий", "4 879 км", "57 910 000 км"));
        planets.add(new Planet(R.drawable.venus, "Венера", "12 104 км", "108 200 000 км"));
        planets.add(new Planet(R.drawable.earth, "Земля", "12 742 км", "149 600 000 км"));
        planets.add(new Planet(R.drawable.mars, "Марс", "6 779 км", "227 900 000 км"));
        planets.add(new Planet(R.drawable.jupiter, "Юпитер", "139 822 км", "778 500 000 км"));
        planets.add(new Planet(R.drawable.saturn, "Сатурн", "116 464 км", "1,429E9 км"));
        planets.add(new Planet(R.drawable.uranus, "Уран", "50 724 км", "2,877E9 км"));
        planets.add(new Planet(R.drawable.neptune, "Нептун", "49 244 км", "4,498E9 км"));
        planets.add(new Planet(R.drawable.pluto, "Плутон", "2 374 км", "5,906E9 км"));
        return planets;
    }
}
