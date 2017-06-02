package com.example.tassa.absen1;

/**
 * Created by Lenovo on 31/05/2017.
 */

public class AbsenModel {
    int id;
    String matkul;
     String dosen;
     String prodi;
     String desc;

    public AbsenModel() {
        this.id = id;
        this.matkul = matkul;
        this.dosen = dosen;
        this.prodi = prodi;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getDosen() {
        return dosen;
    }

    public void setDosen(String dosen) {
        this.dosen = dosen;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
