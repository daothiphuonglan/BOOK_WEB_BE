package com.example.BOOK_WEB_BE.dao;

import com.example.BOOK_WEB_BE.entity.HinhThucGiaoHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="hinh-thuc-giao-hang")
public interface HinhThucGiaoHangRepository extends JpaRepository<HinhThucGiaoHang,Integer> {
}
