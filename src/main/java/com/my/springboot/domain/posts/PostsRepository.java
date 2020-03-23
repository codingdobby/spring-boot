package com.my.springboot.domain.posts;

import javafx.geometry.Pos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts,Long> {


    @Query("Select p from Posts p order by p.id DESC")
    List<Posts> findAllDesc();

}
