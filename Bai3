/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;

/**
 *
 * @author dangt
 */
class QuanLySinhVien {
    private final ArrayList<SinhVien> danhSachSinhVien;

    public QuanLySinhVien() {
        danhSachSinhVien = new ArrayList<>();
    }

    public ArrayList<SinhVien> getDanhSachSinhVien() {
        return danhSachSinhVien;
    }

    public void themSinhVien(SinhVien sinhVien) {
        danhSachSinhVien.add(sinhVien);
    }

    public void xoaSinhVien(String ma) {
        for (int i = 0; i < danhSachSinhVien.size(); i++) {
            if (danhSachSinhVien.get(i).getMa().equals(ma)) {
                danhSachSinhVien.remove(i);
                break;
            }
        }
    }

    public void capNhatSinhVien(String ma, String hoTen, int namSinh) {
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getMa().equals(ma)) {
                sinhVien.hoTen = hoTen;
                sinhVien.namSinh = namSinh;
                break;
            }
        }
    }

    public SinhVien timSinhVienTheoMa(String ma) {
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getMa().equals(ma)) {
                return sinhVien;
            }
        }
        return null;
    }

    public ArrayList<SinhVien> timSinhVienTheoTen(String ten) {
        ArrayList<SinhVien> ketQua = new ArrayList<>();
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getHoTen().contains(ten)) {
                ketQua.add(sinhVien);
            }
        }
        return ketQua;
    }

    public void sapXepDanhSachTheoMa() {
        danhSachSinhVien.sort((s1, s2) -> s1.getMa().compareToIgnoreCase(s2.getMa()));
    }

  

}
