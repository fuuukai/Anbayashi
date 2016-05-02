package fukai.anbayashi;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by fukai on 16/04/30.
 */
public class AnbayashiAdapter extends RecyclerView.Adapter<AnbayashiViewHolder>{
    private ArrayList<AnbayashiData> rouletteDataSet;
    public AnbayashiAdapter(ArrayList<AnbayashiData> roulette){
        this.rouletteDataSet = roulette;
    }

    @Override
    public AnbayashiViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        return new AnbayashiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final AnbayashiViewHolder holder, final int listPositon){
        holder.textViewNumber.setText(rouletteDataSet.get(listPositon).getNumber()+"本");
        holder.textViewComment.setText(rouletteDataSet.get(listPositon).getComment());
        holder.base.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){

                Toast.makeText(v.getContext(), "おまけ" +
                rouletteDataSet.get(listPositon).getAddition() + "本", Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount(){
        return rouletteDataSet.size();
    }


}
