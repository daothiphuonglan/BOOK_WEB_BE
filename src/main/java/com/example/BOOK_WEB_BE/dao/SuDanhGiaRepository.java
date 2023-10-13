package com.example.BOOK_WEB_BE.dao;

import com.example.BOOK_WEB_BE.entity.SuDanhGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="su-danh-gia")
public interface SuDanhGiaRepository extends JpaRepository<SuDanhGia,Long> {
}
