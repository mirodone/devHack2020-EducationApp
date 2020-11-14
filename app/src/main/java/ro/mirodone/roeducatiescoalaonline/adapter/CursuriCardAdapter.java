package ro.mirodone.roeducatiescoalaonline.adapter;

import android.content.Context;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;
import ro.mirodone.roeducatiescoalaonline.CursZoom;
import ro.mirodone.roeducatiescoalaonline.R;
import ro.mirodone.roeducatiescoalaonline.model.Cursuri;


public class CursuriCardAdapter extends RecyclerView.Adapter<CursuriCardAdapter.CursuriHolder> {

    private Context context;
    private ArrayList<Cursuri> cursuri1e;

   public CursuriCardAdapter(Context context, ArrayList<Cursuri> cursuri ) {
        this.context = context;
        this.cursuri1e = cursuri;
    }


    @NonNull
    @Override
    public CursuriCardAdapter.CursuriHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_card, parent, false);
        return new CursuriHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CursuriHolder holder, int position) {

        Cursuri curs = cursuri1e.get(position);
        holder.setDetails(curs);
    }

    @Override
    public int getItemCount() {
        return cursuri1e.size();
    }




    class CursuriHolder extends RecyclerView.ViewHolder  implements View.OnClickListener {

        private TextView numeCurs, descriereCurs;
        private ImageView imageView;
        Button startButton;


        CursuriHolder(View itemView) {

            super(itemView);
            numeCurs = itemView.findViewById(R.id.row_title_list);
            descriereCurs = itemView.findViewById(R.id.row_details_list);
            imageView = itemView.findViewById(R.id.row_image_list);
            startButton = itemView.findViewById(R.id.btn_start_list);

            startButton.setOnClickListener(this);
        }

        void setDetails(Cursuri cursuri) {

            numeCurs.setText(cursuri.getNumeCurs());
            descriereCurs.setText(cursuri.getDescriereCurs());
            imageView.setImageResource(cursuri.getImagineCursId());

        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            Cursuri cursuri = cursuri1e.get(position);

            if (v.getId() == R.id.btn_start_list) {

                Toast.makeText(context, cursuri.getNumeCurs(), Toast.LENGTH_SHORT).show();

                Context context = v.getContext();
                Intent intent = new Intent(context, CursZoom.class);
                context.startActivity(intent);
            }

        }

    }


}
