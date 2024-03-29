/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Impl;

import Repository.IHoaDonChiTietRepository;
import Repository.Impl.HoaDonChiTietRepository;
import Services.IHoaDonChiTietService;
import ViewModel.QLHoaDonChiTiet;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class HoaDonChiTietService implements IHoaDonChiTietService {

    private IHoaDonChiTietRepository hoaDonChiTietRepository = new HoaDonChiTietRepository();

    @Override
    public List<QLHoaDonChiTiet> getListInvoices(String id) {
        return hoaDonChiTietRepository.getAllInvoiceDetails(id);
    }

    @Override
    public String addListInvoice(List<QLHoaDonChiTiet> list) {
        if (hoaDonChiTietRepository.addListInvoiceDetails(list)) {
            return "Thanh toán thành công";
        }
        return "Thanh toán thất bại";
    }

    @Override
    public Double totalMoneyOfInvoice(List<QLHoaDonChiTiet> list) {
        Double total = 0.0;
        for (QLHoaDonChiTiet hdct : list) {
            total = total + hdct.getTotal();
        }
        return total;
    }

    @Override
    public int doanhthu() {
        return hoaDonChiTietRepository.doanhthu();
    }

    public QLHoaDonChiTiet getHoaDonChiTietByMa(String ma, List<QLHoaDonChiTiet> list) {
        for (QLHoaDonChiTiet hdct : list) {
            if (hdct.getMaSP().equals(ma)) {
                return hdct;
            }
        }
        return null;
    }

    @Override
    public void update(Map<QLHoaDonChiTiet, String> hdct) {
        hdct.forEach(
                (k, v) -> {
                    hoaDonChiTietRepository.updateListInvoiceDetails(k.getIdCTSP(), v);
                }
        );

    }

    @Override
    public List<QLHoaDonChiTiet> getAllHDCT() {
        return hoaDonChiTietRepository.getAllHDCT();
    }



}
