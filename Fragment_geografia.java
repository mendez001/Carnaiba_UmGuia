package com.example.davi.carnaiba2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class Fragment_geografia extends ListFragment {

    ArrayList<String> teste2=new ArrayList<>();
    ArrayAdapter adapter;

    View view;
    ArrayAdapter arrayAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        adapter=new Adapter(getActivity(), teste2);
        teste2.add("dhdhdhdhdhhd");
        teste2.add("dhdhdhdhdhhd");
        teste2.add("dhdhdhdhdhhd");
        teste2.add("dhdhdhdhdhhd");
        teste2.add("dhdhdhdhdhhd");
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

}