package com.koncheng.weather.service;

import com.koncheng.weather.vo.Weather;
import com.koncheng.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Weather Report Service.
 *
 * @author ChenYong
 * @since 1.0.0 2017年11月26日
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Autowired
    private DataClient dataClient;

    @Override
    public Weather getDataByCityId(String cityId) {
        // 改为由天气数据API微服务来提供
        WeatherResponse weatherResponse = dataClient.getDataByCityId(cityId);
        Weather data = weatherResponse.getData();
        return data;
    }

}
