package com.example.BOOK_WEB_BE.dao;

import com.example.BOOK_WEB_BE.entity.Quyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuyenRepository  extends JpaRepository<Quyen,Integer> {
}
