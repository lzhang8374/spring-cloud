package com.aderi.springcloud.serviceprovider.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="SHOP")
public class TShop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name="CODE")
    private String code ;
    @Column(name="NAME")
    private String name ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
