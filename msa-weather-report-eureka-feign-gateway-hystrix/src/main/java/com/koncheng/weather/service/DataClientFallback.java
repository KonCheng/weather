package com.koncheng.weather.service;

import com.koncheng.weather.vo.City;
import com.koncheng.weather.vo.WeatherResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenYong
 * @version 2019-5-14
 */
@Component
public class DataClientFallback implements DataClient {
    @Override
    public List<City> listCity() throws Exception {
        List<City> cityList = new ArrayList<>();
        City city = new City();
        city.setCityId("101280601");
        city.setCityName("深圳");
        cityList.add(city);

        City city2 = new City();
        city2.setCityId("101280301");
        city2.setCityName("惠州");
        cityList.add(city2);
        return cityList;
    }

    @Override
    public WeatherResponse getDataByCityId(String cityId) {
        return null;
    }
}
