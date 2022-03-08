package com.hcdc.exercise7displayimageinanewactivity_montera;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageView> {

    String Names[];
    String Define[];
    int[] ImageNo;
    Context ImageContext;

    public ImageAdapter(Context context, String[] names, int[] image, String[] define){
        ImageContext = context;
        Names = names;
        ImageNo = image;
        Define = define;
    }

    @NonNull
    @Override
    public ImageView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ImageContext);
        View view = inflater.inflate(R.layout.image_adapt, parent, false);
        return new ImageView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageView holder, int position) {
        holder.nameview.setText(Names[position]);
        holder.imageview.setBackgroundResource(ImageNo[position]);
        holder.button.setOnClickListener(view -> {
            Intent intent = new Intent(ImageContext, secpage.class);
            intent.putExtra("name", holder.nameview.getText().toString());
            intent.putExtra("define", Define[position]);
            intent.putExtra("image", ImageNo[position]);
            ImageContext.startActivity(intent);
            Toast.makeText(ImageContext, holder.nameview.getText().toString(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return Names.length;
    }

    public class ImageView extends RecyclerView.ViewHolder {

        TextView nameview;
        View imageview;
        Button button;

        public ImageView(@NonNull View itemView) {
            super(itemView);
            nameview = itemView.findViewById(R.id.name);
            imageview = itemView.findViewById(R.id.imageView);
            button = itemView.findViewById(R.id.button);

        }


    }
}
