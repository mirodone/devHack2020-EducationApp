package ro.mirodone.roeducatiescoalaonline;

import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ro.mirodone.roeducatiescoalaonline.adapter.CursuriCardAdapter;
import ro.mirodone.roeducatiescoalaonline.model.Cursuri;

public class CardRecyclerViewActivity extends AppCompatActivity {

    private CursuriCardAdapter adapter;
    private ArrayList<Cursuri> cursuriArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        initView();


    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.reciclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        cursuriArrayList = new ArrayList<>();
        adapter = new CursuriCardAdapter(this, cursuriArrayList);
        recyclerView.setAdapter(adapter);

        createListData();
    }


    private void createListData() {
        Cursuri cursuri;
        cursuri = new Cursuri(getString(R.string.s_zoom), getString(R.string.zoom_descriere), R.drawable.icon_zoom_s);
        cursuriArrayList.add(cursuri);
        cursuri = new Cursuri(getString(R.string.s_mteams), getString(R.string.mteams_descriere), R.drawable.icon_mteams_s);
        cursuriArrayList.add(cursuri);
        cursuri = new Cursuri(getString(R.string.s_google_m), getString(R.string.google_m_descriere), R.drawable.icon_googlem_s);
        cursuriArrayList.add(cursuri);
        cursuri = new Cursuri(getString(R.string.s_google_c), getString(R.string.google_c_descriere), R.drawable.icon_gclass_s);
        cursuriArrayList.add(cursuri);

        adapter.notifyDataSetChanged();
    }

}
