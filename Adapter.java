package com.example.davi.carnaiba2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<String> {
private  final Context context;
private final ArrayList<String> lista;

public Adapter(Context context, ArrayList<String> lista) {
        super(context, R.layout.modelo_linha, lista);
        this.context = context;
        this.lista = lista;
        }

@Override
public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.modelo_linha, parent, false);

        TextView tvNomePalavra = rowView.findViewById(R.id.tv_titulo);
        ImageView ivlocal = rowView.findViewById(R.id.imageView2);


        lista.add("Biblioteca Pública");

        tvNomePalavra.setText(lista.get(position));
        ivlocal.setImageResource(R.mipmap.biblioteca);

        return rowView;
        }

}
