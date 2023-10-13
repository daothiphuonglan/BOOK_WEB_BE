package com.example.BOOK_WEB_BE.dao;

import com.example.BOOK_WEB_BE.entity.DonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="don-hang")
public interface DonHangRepository extends JpaRepository<DonHang,Integer> {
}
