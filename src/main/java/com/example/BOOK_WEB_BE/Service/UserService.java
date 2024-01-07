package com.example.BOOK_WEB_BE.Service;

import com.example.BOOK_WEB_BE.entity.NguoiDung;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    public NguoiDung findByUsername(String tenDangNhap);
}
