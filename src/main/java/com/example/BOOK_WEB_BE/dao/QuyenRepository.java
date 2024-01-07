package com.example.BOOK_WEB_BE.dao;

import com.example.BOOK_WEB_BE.entity.Quyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="quyen")
public interface QuyenRepository  extends JpaRepository<Quyen,Integer> {
   public Quyen findByTenQuyen (String tenQuyen);
}
