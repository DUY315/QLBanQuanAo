/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.HoaDon;
import ViewModel.QLHoaDon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuane_nluzcuo
 */
public interface IHoaDonService {

    List<QLHoaDon> getAllHoaDonCho(int trangThai);

    List<QLHoaDon> getAllHoaDonDatHang();

    HoaDon add(HoaDon hd);

    void uppdateTrangThai(String id, int trangThai);

    void updateHoaDonGiaoHang(HoaDon hd, String id);

    void updateNgayNhan(HoaDon hd, String id);

    void updateHoaDon(HoaDon hd, String id);

    public int demSoLuongHoaDonDTT();

    public int demSoLuongHoaDonCTT();

    public int Tonghoadon();

    QLHoaDon getHoaDonByMa(List<QLHoaDon> list, String ma);
    
    List<QLHoaDon> getAllHD();
    
    List<QLHoaDon> getFilter(String ngayBatDau,String ngayKetThuc);
    
//    List<QLHoaDon> getTrangThai();
    
    List<QLHoaDon> getByName(String name);
    

}
