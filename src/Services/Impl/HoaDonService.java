/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import DomainModels.HoaDon;
import Repository.IHoaDonRepository;
import Repository.Impl.HoaDonRepository;
import Repository.Impl.NhanVienRepository;
import Services.IHoaDonService;
import ViewModel.QLHoaDon;
import ViewModel.QLNhanVien;
import java.util.*;

/**
 *
 * @author tuane_nluzcuo
 */
public class HoaDonService implements IHoaDonService {

    private HoaDonRepository hoaDonRepository = new HoaDonRepository();

    @Override
    public HoaDon add(HoaDon hd) {
        return hoaDonRepository.add(hd);
    }
    
      public int doanhThuNgay() {
        return hoaDonRepository.doanhThuNgay();
    }

    public int doanhThuQuy() {
        return hoaDonRepository.doanhThuQuy();
    }

    @Override
    public List<QLHoaDon> getAllHoaDonCho(int trangThai) {
        return hoaDonRepository.getAllHoaDonCho(trangThai);
    }

    @Override
    public void uppdateTrangThai(String id, int trangThai) {
        hoaDonRepository.updateTrangThai(id, trangThai);
    }

    @Override
    public void updateHoaDonGiaoHang(HoaDon hd, String id) {
        hoaDonRepository.updateHoaDonGiaoHang(hd, id);
    }

    @Override
    public List<QLHoaDon> getAllHoaDonDatHang() {
        return hoaDonRepository.getAllHoaDonDatHang();
    }

    @Override
    public void updateHoaDon(HoaDon hd, String id) {
        hoaDonRepository.updateHoaDon(hd, id);
    }

    @Override
    public void updateNgayNhan(HoaDon hd, String id) {
        hoaDonRepository.updateNgayNhan(hd, id);
    }

    @Override
    public int demSoLuongHoaDonCTT() {
        return hoaDonRepository.demSoLuongHoaDonCTT();
    }

    @Override
    public int demSoLuongHoaDonDTT() {
        return hoaDonRepository.demSoLuongHoaDonDTT();
    }

    @Override
    public int Tonghoadon() {
        return hoaDonRepository.TongHD();
    }

    public QLHoaDon getHoaDonByMa(List<QLHoaDon> list, String ma) {
        for (QLHoaDon hd : list) {
            if (hd.getMaHoaDon().equals(ma)) {
                return hd;
            }
        }
        return null;
    }

    @Override
    public List<QLHoaDon> getAllHD() {
          return hoaDonRepository.getAllHD();
    }

    @Override
    public List<QLHoaDon> getFilter(String ngayBatDau, String ngayKetThuc) {
         return hoaDonRepository.getFilter(ngayBatDau, ngayKetThuc);
    }

//    @Override
//    public List<QLHoaDon> getTrangThai() {
//         return hoaDonRepository.getTrangThai();
//    }

    @Override
    public List<QLHoaDon> getByName(String name) {
         return hoaDonRepository.getByName(name);
    }

}
