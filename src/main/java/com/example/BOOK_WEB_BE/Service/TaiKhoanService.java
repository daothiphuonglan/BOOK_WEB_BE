package com.example.BOOK_WEB_BE.Service;


import com.example.BOOK_WEB_BE.dao.NguoiDungRepository;
import com.example.BOOK_WEB_BE.entity.NguoiDung;
import com.example.BOOK_WEB_BE.entity.ThongBao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TaiKhoanService {
     @Autowired
     private NguoiDungRepository nguoiDungRepository;

    public ResponseEntity<?> dangKyNguoiDung(NguoiDung nguoiDung){
        // Kiểm tra tên đăng nhập đã tồn tại chưa?
        if(nguoiDungRepository.existsByTenDangNhap(nguoiDung.getTenDangNhap())){
            return ResponseEntity.badRequest().body(new ThongBao("Tên đăng nhập đã tồn tại."));
        }

        // Kiểm traemail đã tồn tại chưa?
        if(nguoiDungRepository.existsByEmail(nguoiDung.getEmail())){
            return ResponseEntity.badRequest().body(new ThongBao("Email đã tồn tại."));
        }

        // Lưu người dùng người dùng vào DB
        NguoiDung nguoiDung_daDangKy = nguoiDungRepository.save(nguoiDung);
        return ResponseEntity.ok("Đăng ký thành công");
    }

}
