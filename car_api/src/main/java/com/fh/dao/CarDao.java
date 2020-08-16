package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.entity.Car;
import com.fh.entity.QueryCar;

import java.util.List;

public interface CarDao extends BaseMapper<Car> {

    List<Car> queryCarList(QueryCar queryCar);

    Long queryCarCount(QueryCar queryCar);

    void addCar(Car car);

}
