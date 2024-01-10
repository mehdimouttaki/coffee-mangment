package com.coffeemanagement.repository;

import com.coffeemanagement.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Long> {

    Optional<Menu> findByMenuIgnoreCase(String menu);
}
