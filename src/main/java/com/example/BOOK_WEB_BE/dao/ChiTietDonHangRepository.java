package com.example.BOOK_WEB_BE.dao;

import com.example.BOOK_WEB_BE.entity.ChiTietDonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="chi-tiet-don-hang")
public interface ChiTietDonHangRepository extends JpaRepository <ChiTietDonHang,Long> {
}
