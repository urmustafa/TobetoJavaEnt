package com.rentacar.spring1b.repositories;

import com.rentacar.spring1b.entities.Brand;
import com.rentacar.spring1b.services.dtos.responses.brand.GetBrandListResponse;
import com.rentacar.spring1b.services.dtos.responses.brand.GetBrandResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Data JPA
public interface BrandRepositoriy extends JpaRepository<Brand, Integer> {
    //veri erişim katmanı



    List<Brand> findByNameLikeOrIdEquals(String name,int id);

    @Query("select b from Brand b WHERE b.name =:name")
    List<Brand> search(String name);

    @Query(value="select * from brands where name like %:name%",nativeQuery = true)
    List<Brand> search2(String name);

    @Query("select new com.rentacar.spring1b.services.dtos.responses.brand.GetBrandListResponse(b.name) " +
            "from Brand b WHERE b.name =:name")
    List<GetBrandListResponse> search3(String name);
}
