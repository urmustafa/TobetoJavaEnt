package com.rentacar.spring1b.repositories;

import com.rentacar.spring1b.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

//Data JPA
public interface BrandRepositoriy extends JpaRepository<Brand, Integer> {
    //veri erişim katmanı


}
