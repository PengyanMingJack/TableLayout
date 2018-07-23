package allvideo.pym.com.tablelayout;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.flexbox.FlexboxLayoutManager;

import java.util.ArrayList;
import java.util.List;

import allvideo.pym.com.tablelayout.databinding.FragmentBinding;


/**
 * Created by Administrator on 2018/7/5.
 */

public class MyFragment extends Fragment {

    private FragmentBinding inflate;
    private List<String> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        inflate = DataBindingUtil.inflate(inflater, R.layout.fragment, container, false);
        return inflate.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        inflate.recycleview.setLayoutManager(new FlexboxLayoutManager(getActivity()));
        inflate.recycleview.setAdapter(new MyAdapter());
        list = new ArrayList<>();
        for (int i = 0; i < 59; i++) {
            if (i % 10 == 1) {
                list.add("哈");
            } else if (i % 5 == 2) {
                list.add("哈哈");
            } else if (i % 5 == 3) {
                list.add("哈哈哈");
            } else if (i % 5 == 4) {
                list.add("哈哈哈哈");
            } else if (i % 5 == 0) {
                list.add("哈哈哈哈哈");
            } else if (i % 6 == 0) {
                list.add("哈哈哈哈哈哈哈哈哈哈哈");
            } else {
                list.add("哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
            }
        }

    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyViewHolder(LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false));
        }

        @Override
        public void onBindViewHolder(MyViewHolder viewHolder, int position) {
            viewHolder.lable.setText(list.get(position));
            viewHolder.lable.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewHolder.lable.setSelected(!viewHolder.lable.isSelected());
                }
            });

        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        class MyViewHolder extends RecyclerView.ViewHolder {

            private final TextView lable;
            private final ImageView ivDel;

            public MyViewHolder(View itemView) {
                super(itemView);
                lable = itemView.findViewById(R.id.lable);
                ivDel = itemView.findViewById(R.id.ivDel);
            }
        }
    }
}
