package com.globallogic.bootcampgl.vehiculo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.bootcampgl.vehiculo.entity.Model;

public interface ModelRepository extends JpaRepository<Model,Long> {

}
