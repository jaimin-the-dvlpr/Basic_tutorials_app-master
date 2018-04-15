package com.jimmy.androidhub.Adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.jimmy.androidhub.Model.Tutorials_Model;

import com.jimmy.androidhub.R;
import com.jimmy.androidhub.Tutorials_Activitry.Android_Assignment;
import com.jimmy.androidhub.Tutorials_Activitry.Android_Interview_Quetions;
import com.jimmy.androidhub.Tutorials_Activitry.Android_Intoduction;

import com.jimmy.androidhub.Tutorials_Activitry.Android_Layouts;
import com.jimmy.androidhub.Tutorials_Activitry.Tutorials_Android_Kotlin;
import com.jimmy.androidhub.Tutorials_Activitry.Tutorials_Kotlin_ServerSide;
import com.jimmy.androidhub.Tutorials_Android_Quiz.QuestionActivity1;


import java.util.List;

/**
 * Created by Jaimin_Patel on 2/18/2018.
 */

public class Tutorials_Adapter extends RecyclerView.Adapter<Tutorials_Adapter.MyViewHolder> {

    private List<Tutorials_Model> TutorialList;



    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView img;




        public MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.tittle1);
            img = view.findViewById(R.id.img1);





          view.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {



                  if(getAdapterPosition() == 0) {
                      Intent intent = new Intent(view.getContext(), Android_Intoduction.class);
                      view.getContext().startActivity(intent);


                  }
                  else if(getAdapterPosition() == 1){
                      Intent intent = new Intent(view.getContext(), Android_Layouts.class);
                      view.getContext().startActivity(intent);
                  }

                  else if(getAdapterPosition() == 2) {
                      Intent intent = new Intent(view.getContext(), Tutorials_Android_Kotlin.class);
                      view.getContext().startActivity(intent);
                  }
                  else if(getAdapterPosition() == 3) {
                      Intent intent = new Intent(view.getContext(), Tutorials_Kotlin_ServerSide.class);
                      view.getContext().startActivity(intent);
                  }

                  else if(getAdapterPosition() == 4) {
                      Intent intent = new Intent(view.getContext(), Android_Assignment.class);
                      view.getContext().startActivity(intent);
                  }


                  else if(getAdapterPosition() == 5) {
                      Intent intent = new Intent(view.getContext(), Android_Interview_Quetions.class);
                      view.getContext().startActivity(intent);
                  }

                  else if(getAdapterPosition() == 6) {
                      Intent intent = new Intent(view.getContext(), QuestionActivity1.class);
                      view.getContext().startActivity(intent);
                  }

                  else{
                      Toast.makeText(view.getContext(), "Other clicked", Toast.LENGTH_SHORT).show();
                  }

              }


          });




        }


    }


    public Tutorials_Adapter(List<Tutorials_Model> list) {
        this.TutorialList = list;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tutorials_list, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Tutorials_Model tutorials = TutorialList.get(position);
        holder.title.setText(tutorials.getTitle());
        holder.img.setImageResource(tutorials.getImage());



    }

    @Override
    public int getItemCount() {
        return TutorialList.size();
    }
}
