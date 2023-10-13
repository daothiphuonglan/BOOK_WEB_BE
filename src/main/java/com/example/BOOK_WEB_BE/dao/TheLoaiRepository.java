package com.example.BOOK_WEB_BE.dao;

import com.example.BOOK_WEB_BE.entity.TheLoai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="the-loai")
public interface TheLoaiRepository extends JpaRepository<TheLoai,Integer> {
}
