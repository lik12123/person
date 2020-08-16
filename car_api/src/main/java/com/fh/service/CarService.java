package com.fh.service;

import com.fh.entity.Car;
import com.fh.entity.DataTableResult;
import com.fh.entity.QueryCar;

public interface CarService {

    void addCar(Car car);

    DataTableResult queryCarList(QueryCar queryCar);

}
