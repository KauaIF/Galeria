package mateus.kaua.galeria.adapter;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
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
                this.photos = photos;
        }

        @NonNull
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return null;
        }

        @Override
        public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {

                ImageView imPhoto = holder.itemView.findViewById(R.id.imPhoto);
                int w = (int)mainActivity.getResources().getDimension(R.dimen.itemWidth);
                int h = (int)mainActivity.getResources().getDimension(R.dimen.itemHeight);
                Bitmap bitmap = mateus.kaua.applista.activity.util.Util.getBitmap(photos.get(position),w,h);
                imPhoto.setImageBitmap(bitmap);
                imPhoto.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                mainActivity.startPhotoActivity(photos.get(position));
                        }
                });
        }

        @Override
        public int getItemCount() {
                return 0;
        }
}

