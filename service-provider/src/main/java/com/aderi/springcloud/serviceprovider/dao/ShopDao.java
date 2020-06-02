package com.aderi.springcloud.serviceprovider.dao;

import com.aderi.springcloud.serviceprovider.entity.TShop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopDao extends JpaRepository<TShop,Long> {

}