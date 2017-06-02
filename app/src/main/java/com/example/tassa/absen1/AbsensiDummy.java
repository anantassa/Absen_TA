package com.example.tassa.absen1;

import java.util.ArrayList;

/**
 * Created by Lenovo on 02/06/2017.
 */

public class AbsensiDummy {

    public static ArrayList<AbsenModel> getAbsenDummy(){
        ArrayList<AbsenModel> absenModels = new ArrayList<>();
        AbsenModel absenModel= null;

        absenModel = new AbsenModel();
        absenModel.setId(1);
        absenModel.setMatkul("Arsitektur Komputer");
        absenModel.setProdi("Ilmu Komputer");
        absenModel.setDosen("M. Eka Suryana");
        absenModel.setDesc("Senin Jam ke 1, Ruang 513");
        absenModels.add(absenModel);

        return absenModels;
    }
}
