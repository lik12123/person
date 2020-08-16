package com.fh.controller;

import com.fh.entity.DataTableResult;
import com.fh.entity.QueryCar;
import com.fh.service.CarService;
import com.fh.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("carController")
@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("test")
    @ResponseBody
    public String test(){
        return "hi";
    }

    @RequestMapping("queryCarList")
    @ResponseBody
    @CrossOrigin
    public JsonData queryCarList(QueryCar queryCar){
        DataTableResult carList = carService.queryCarList(queryCar);
        return JsonData.getJsonDataSuccess(carList);
    }


}
