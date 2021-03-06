package mattnewsom.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter<MyAdapter.ViewHolder> mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i <200; i++){
                data.add("Test" + i);

        }

        mAdapter = new MyAdapter(data);
        mRecyclerView.setAdapter(mAdapter);

    }
}
