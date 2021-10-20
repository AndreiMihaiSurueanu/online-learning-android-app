package com.example.onlinelearningandroidapp.adapter;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    Context context;
    List<PlayList> playLists;

    public CourseAdapter(Context context, List<PlayList> playLists) {
        this.context = context;
        this.playLists = playLists;
    }

    @NonNull
    @Override
    public CourseAdapter.CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapter.CourseViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return playLists.size();
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder {


        public CourseViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
