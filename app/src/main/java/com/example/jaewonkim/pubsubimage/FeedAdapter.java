package com.example.jaewonkim.pubsubimage;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.LinkedList;

/**
 * Created by nyangkun on 13/11/2016.
 */
public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolder> {

    private LinkedList<FeedPost> mPosts;

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView mCardView;
        ImageView mImage;

        public ViewHolder(CardView cv) {
            super(cv);
            mCardView = cv;
            mImage = (ImageView) cv.findViewById(R.id.feed_image_view);
        }
    }

    public FeedAdapter(LinkedList<FeedPost> posts) {
        mPosts = posts;
    }

    // Create new views. (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Create a new view.
        CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_feed, parent, false);
        // TODO: Set the view parameters here.
        // Create a view holder and return this.
        ViewHolder vh = new ViewHolder(cv);
        return vh;
    }

    // Replace the contents of a view. (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (position >= mPosts.size()) {
            // position is out of range: do some workaround here.
            return;
        }
        FeedPost post = mPosts.get(position);
        // TODO: Replace the contents of the view with this element.
    }

    @Override
    public int getItemCount() {
        return mPosts.size();
    }

}
