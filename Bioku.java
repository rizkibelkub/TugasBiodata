package com.example.appbiodata;

import android.os.Parcel;
import android.os.Parcelable;

public class bioku implements Parcelable {

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    private String nim;
    private String nama;
    private String kelas;
    private String tanggal;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nim);
        dest.writeString(this.nama);
        dest.writeString(this.kelas);
        dest.writeString(this.tanggal);
    }

    public bioku() {
    }

    protected bioku(Parcel in) {
        this.nim = in.readString();
        this.nama = in.readString();
        this.kelas = in.readString();
        this.tanggal = in.readString();
    }

    public static final Parcelable.Creator<bioku> CREATOR = new Parcelable.Creator<bioku>() {
        @Override
        public bioku createFromParcel(Parcel source) {
            return new bioku(source);
        }

        @Override
        public bioku[] newArray(int size) {
            return new bioku[size];
        }
    };
}
