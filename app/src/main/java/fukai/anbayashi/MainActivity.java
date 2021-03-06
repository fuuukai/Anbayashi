package fukai.anbayashi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.cardList);

        recyclerView.setHasFixedSize(true);

        LinearLayoutManager llManager = new LinearLayoutManager(this);
        //縦スクロール
        llManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llManager);

        ArrayList<AnbayashiData> anbayashi = new ArrayList<AnbayashiData>();
        for(int i = 0; i <MyData.commentArray.length; i++){
            anbayashi.add(new AnbayashiData(
                    MyData.numberArray[i],
                    MyData.addtionArray[i],
                    MyData.commentArray[i]
            ));
        }

        RecyclerView.Adapter adapter = new AnbayashiAdapter(anbayashi);
        recyclerView.setAdapter(adapter);
        recyclerView.smoothScrollToPosition(anbayashi.size()-1);

    }


}
