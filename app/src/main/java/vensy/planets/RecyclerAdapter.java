package vensy.planets;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vensy on 26.08.2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private List<Planet> planets;
    OnItemClickListener icl;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView pic;
        TextView name;

        public ViewHolder(View v) {
            super(v);
            pic = (ImageView) v.findViewById(R.id.planet_pic);
            name = (TextView) v.findViewById(R.id.planet_name);
            v.setOnClickListener(this);
            }

        @Override
        public void onClick(View v) {
            if (icl != null) {
                icl.onItemClick(v, getPosition());
            }
        }
    }

    public RecyclerAdapter(List<Planet> planets) {
        this.planets = planets;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.pic.setImageResource(planets.get(position).getPic());
        holder.name.setText(planets.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return planets.size();
    }

    public interface OnItemClickListener {
        void onItemClick(View view , int position);
    }

    public void SetOnItemClickListener(final OnItemClickListener icl) {
        this.icl = icl;
    }
}
