package com.app.theleaderinyou;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class IndexBookAdapter extends RecyclerView.Adapter<IndexBookAdapter.Book_VH> {
    ArrayList<Index_item_list> list_item;

    public IndexBookAdapter(ArrayList<Index_item_list> list_item) {
        this.list_item = list_item;
    }

    @NonNull
    @Override
    public Book_VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.index_of_book, viewGroup, false);
        return new Book_VH(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Book_VH book_vh, final int i) {
        book_vh.chapter_num.setText(list_item.get(i).getChapter_num());
        book_vh.chapter_name.setText(list_item.get(i).getChapter_name());

        //settinng on click listner in recycler-view list
        book_vh.constraint_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (i) {
                    case 0:
                        Intent intent = new Intent(v.getContext(), IntroductionActivity.class);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        Intent one = new Intent(v.getContext(), ChapterOneActivity.class);
                        v.getContext().startActivity(one);
                        break;
                    case 2:
                        Intent two = new Intent(v.getContext(), ChapterTwoActivity.class);
                        v.getContext().startActivity(two);
                        break;
                    case 3:
                        Intent three = new Intent(v.getContext(),ChapterThreeActivity.class);
                        v.getContext().startActivity(three);
                        break;
                    case 4:
                        Intent four = new Intent(v.getContext(),ChapterFourActivity.class);
                        v.getContext().startActivity(four);
                        break;
                    case 5:
                        Intent five = new Intent(v.getContext(),ChapterFiveActivity.class);
                        v.getContext().startActivity(five);
                        break;
                    case 6:
                        Intent six = new Intent(v.getContext(),ChapterSixActivity.class);
                        v.getContext().startActivity(six);
                        break;
                        case 7:
                        Intent seven = new Intent(v.getContext(),ChapterSevenActivity.class);
                        v.getContext().startActivity(seven);
                        break;
                    case 8:
                        Intent eight = new Intent(v.getContext(),ChapterEightActivity.class);
                        v.getContext().startActivity(eight);
                        break;
                    case 9:
                        Intent nine = new Intent(v.getContext(),ChapterNineActivity.class);
                        v.getContext().startActivity(nine);
                        break;
                    case 10:
                        Intent ten = new Intent(v.getContext(),ChapterTenActivity.class);
                        v.getContext().startActivity(ten);
                        break;
                    case 11:
                        Intent eleven = new Intent(v.getContext(),ChapterElevenActivity.class);
                        v.getContext().startActivity(eleven);
                        break;
                    case 12:
                        Intent twelve = new Intent(v.getContext(),ChapterTwelveActivity.class);
                        v.getContext().startActivity(twelve);
                        break;
                    case 13:
                        Intent thirteen = new Intent(v.getContext(),ChapterThirteenActivity.class);
                        v.getContext().startActivity(thirteen);
                        break;
                    case 14:
                        Intent fourteen  = new Intent(v.getContext(),ChapterForteenActivity.class);
                        v.getContext().startActivity(fourteen);
                        break;
                    case 15:
                        Intent fifteen = new Intent(v.getContext(),ChapterFifteenActivity.class);
                        v.getContext().startActivity(fifteen);
                        break;
                    case 16:
                        Intent sixteen = new Intent(v.getContext(),ChapterSixteenActivity.class);
                        v.getContext().startActivity(sixteen);
                        break;
                    case 17:
                        Intent seventeen = new Intent(v.getContext(),ChapterSeventeenActivity.class);
                        v.getContext().startActivity(seventeen);
                        break;

                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return list_item.size();
    }

    class Book_VH extends RecyclerView.ViewHolder {
        TextView chapter_num, chapter_name;
        ConstraintLayout constraint_layout;

        public Book_VH(@NonNull View itemView) {
            super(itemView);
            chapter_name = itemView.findViewById(R.id.chapter_name);
            chapter_num = itemView.findViewById(R.id.chapter_num);
            constraint_layout = itemView.findViewById(R.id.constraint_layout);

        }
    }
}
