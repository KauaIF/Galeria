package mateus.kaua.galeria.adapter;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mateus.kaua.galeria.R;
import mateus.kaua.galeria.activity.MainActivity;

public class MainAdapter extends RecyclerView.Adapter {
        MainActivity mainActivity;
        List<String> photos;

        public MainAdapter(MainActivity mainActivity, List<String> photos) {
                this.mainActivity = mainActivity;
        }
        this.photos = photos;

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
                ImageView imPhoto = holder.itemView.findViewById(R.id.imPhoto);
                int w = (int)mainActivity.getResources().getDimension(R.dimen.itemWidth);
                int h = (int)mainActivity.getResources().getDimension(R.dimen.itemHeight);
                Bitmap bitmap = Utils.getBitmap(photos.get(position)),w,h);
                imPhoto.setImageBitmap(bitmap);
                imPhoto.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                mainActivity.startActivity(photos.get(position));
                        }
                });
        }
}

