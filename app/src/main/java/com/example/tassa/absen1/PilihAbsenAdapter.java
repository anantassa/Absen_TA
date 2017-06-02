package com.example.tassa.absen1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Lenovo on 31/05/2017.
 */

public class PilihAbsenAdapter extends BaseAdapter {

    private Context mContext;
    private List<AbsenModel> absenModelList;

    public PilihAbsenAdapter(Context mContext, List<AbsenModel> absenModelList) {
        this.mContext = mContext;
        this.absenModelList = absenModelList;
    }

    @Override
    public int getCount() {
        return absenModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return absenModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView==null)
        {
            convertView= LayoutInflater.from(mContext).inflate(R.layout.list_absen,parent,false);
        }
        TextView tvMatkul = (TextView)convertView.findViewById(R.id.matakuliah);
        TextView tvDosen = (TextView)convertView.findViewById(R.id.dosen);
        TextView tvProdi = (TextView)convertView.findViewById(R.id.prodi);
        TextView tvDesc = (TextView)convertView.findViewById(R.id.detail_matkul);

      //  final AbsenModel s= (AbsenModel) this.getItem(position);
        final String matkul = absenModelList.get(position).getMatkul();
        final String prodi = absenModelList.get(position).getProdi();
        final String dosen = absenModelList.get(position).getDosen();
        final String detail = absenModelList.get(position).getDesc();

        tvMatkul.setText(matkul);
        tvProdi.setText(prodi);
        tvDosen.setText(dosen);
        tvDesc.setText(detail);

       // v.setTag(absenModelList.get(position).getId());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailActivity(matkul, prodi, dosen, detail);
            }
        });
        return convertView;
    }

    //OPEN DETAIL ACTIVITY
    private void openDetailActivity(String matkul,String prodi, String dosen, String detail)
    {
        Intent i=new Intent(mContext, DescriptionActivity.class);
        i.putExtra("MATKUL_KEY",matkul);
        i.putExtra("PRODI_KEY",prodi);
        i.putExtra("DOSEN_KEY",dosen);
        i.putExtra("DETAIL_KEY",detail);


       mContext.startActivity(i);
    }
}
