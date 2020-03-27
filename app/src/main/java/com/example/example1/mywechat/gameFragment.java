package com.example.example1.mywechat;


import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class gameFragment extends Fragment {

    private List<Game> gameList = new ArrayList<>();

    public gameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tab01, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        initPayers();
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        gameAdapter adapter = new gameAdapter(gameList);
        recyclerView.setAdapter(adapter);
        return view;
    }

    private void initPayers() {
        for (int i = 0; i < 10; i++) {
            Game player_bi = new Game(i,R.drawable.game_1,"risk of rain 2");
            gameList.add(player_bi);
            Game player_kb = new Game(i,R.drawable.game_2,"prison");
            gameList.add(player_kb);
            Game player_lbj = new Game(i,R.drawable.game_3,"饥荒");
            gameList.add(player_lbj);
            Game player_sc = new Game(i,R.drawable.game_4,"植物僵尸");
            gameList.add(player_sc);
            Game player_kd = new Game(i,R.drawable.game_5,"消消乐");
            gameList.add(player_kd);
            Game player_dr = new Game(i,R.drawable.game_6,"建岛");
            gameList.add(player_dr);
            Game player_ga = new Game(i,R.drawable.game_7,"分手厨房");
            gameList.add(player_ga);
            Game player_jh = new Game(i,R.drawable.game_8,"谁是卧底");
            gameList.add(player_jh);
            Game player_ad = new Game(i,R.drawable.game_9,"大型魔幻");
            gameList.add(player_ad);
        }
    }
}
