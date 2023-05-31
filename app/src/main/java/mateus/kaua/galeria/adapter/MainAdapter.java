package mateus.kaua.galeria.adapter;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mateus.kaua.galeria.activity.MainActivity;

public class MainAdapter extends RecyclerView.Adapter {
        MainActivity mainActivity;
        List<String> photos;

        public MainAdapter(MainActivity mainActivity, List<String> photos) {
                this.mainActivity = mainActivity;
        }
        this.photos = photos;
}
