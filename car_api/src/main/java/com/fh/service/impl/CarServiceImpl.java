package com.fh.service.impl;

import com.fh.dao.CarDao;
import com.fh.entity.Car;
import com.fh.entity.DataTableResult;
import com.fh.entity.QueryCar;
import com.fh.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public void addCar(Car car) {
            carDao.insert(car);
    }

    @Override
    public DataTableResult queryCarList(QueryCar queryCar) {

        List<Car> cars = carDao.queryCarList(queryCar);

        Long aLong = carDao.queryCarCount(queryCar);

        DataTableResult dataTableResult = new DataTableResult(queryCar.getDraw(),aLong,aLong,cars);

        return dataTableResult;
    }
}
