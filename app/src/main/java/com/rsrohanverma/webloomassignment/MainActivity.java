package com.rsrohanverma.webloomassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

//        GridLayoutManager layoutManager = new GridLayoutManager(this, 4);
//        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
//            @Override
//            public int getSpanSize(int position) {
//                if (position == 3 || position == 4)
//                    return 1;
//                else
//                    return 2;
//            }
//        });

        StaggeredGridLayoutManager lm =
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(lm);

        ArrayList<String> dps = new ArrayList<>();
        dps.add("https://cdn.britannica.com/98/199398-050-BE0D4074/Brie-Larson-title-character-Captain-Marvel.jpg");
        dps.add("https://cdnb.artstation.com/p/assets/images/images/016/373/827/large/buyansanjaa-sharaid-iron-man-mark-85-render-6.jpg?1551910814");
        dps.add("https://c8.alamy.com/comp/2BHE6F7/jerry-the-mouse-tom-and-jerry-1966-2BHE6F7.jpg");
        dps.add("https://i.pinimg.com/originals/36/7b/f6/367bf6ad729c686da04d95ad6e912a8f.jpg");
        dps.add("https://i.pinimg.com/originals/01/e8/aa/01e8aa52b1fed0eaa3840d105c328fed.jpg");
        dps.add("https://i.pinimg.com/originals/2c/3f/d7/2c3fd77862947349f29dc9a08d66ce7f.jpg");
        dps.add("https://i.pinimg.com/736x/f0/84/92/f0849211207ae5b3c4c5ed3e844bda7e.jpg");
        dps.add("https://vignette.wikia.nocookie.net/xmenmovies/images/9/94/Deadpool_Textless.jpg/revision/latest?cb=20200608174908");
        dps.add("https://cdn.britannica.com/98/199398-050-BE0D4074/Brie-Larson-title-character-Captain-Marvel.jpg");
        dps.add("https://cdnb.artstation.com/p/assets/images/images/016/373/827/large/buyansanjaa-sharaid-iron-man-mark-85-render-6.jpg?1551910814");
        dps.add("https://c8.alamy.com/comp/2BHE6F7/jerry-the-mouse-tom-and-jerry-1966-2BHE6F7.jpg");
        dps.add("https://i.pinimg.com/originals/36/7b/f6/367bf6ad729c686da04d95ad6e912a8f.jpg");
        dps.add("https://i.pinimg.com/originals/01/e8/aa/01e8aa52b1fed0eaa3840d105c328fed.jpg");
        dps.add("https://i.pinimg.com/736x/f0/84/92/f0849211207ae5b3c4c5ed3e844bda7e.jpg");
        dps.add("https://vignette.wikia.nocookie.net/xmenmovies/images/9/94/Deadpool_Textless.jpg/revision/latest?cb=20200608174908");
        dps.add("https://cdn.britannica.com/98/199398-050-BE0D4074/Brie-Larson-title-character-Captain-Marvel.jpg");
        dps.add("https://cdnb.artstation.com/p/assets/images/images/016/373/827/large/buyansanjaa-sharaid-iron-man-mark-85-render-6.jpg?1551910814");
        dps.add("https://c8.alamy.com/comp/2BHE6F7/jerry-the-mouse-tom-and-jerry-1966-2BHE6F7.jpg");
        dps.add("https://i.pinimg.com/originals/36/7b/f6/367bf6ad729c686da04d95ad6e912a8f.jpg");
        dps.add("https://i.pinimg.com/originals/01/e8/aa/01e8aa52b1fed0eaa3840d105c328fed.jpg");
        dps.add("https://i.pinimg.com/originals/2c/3f/d7/2c3fd77862947349f29dc9a08d66ce7f.jpg");
        dps.add("https://i.pinimg.com/736x/f0/84/92/f0849211207ae5b3c4c5ed3e844bda7e.jpg");
        dps.add("https://vignette.wikia.nocookie.net/xmenmovies/images/9/94/Deadpool_Textless.jpg/revision/latest?cb=20200608174908");

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(getApplicationContext(), dps);

        recyclerView.setAdapter(recyclerAdapter);
    }
}