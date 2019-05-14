package com.koncheng.weather.job;

import java.util.ArrayList;
import java.util.List;

import com.koncheng.weather.service.WeatherDataCollectionService;
import com.koncheng.weather.vo.City;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;


/**
 * Weather Data Sync Job.
 *
 * @author ChenYong
 * @since 1.0.0 2017年11月23日
 */
public class WeatherDataSyncJob extends QuartzJobBean {

    private final static Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);

    @Autowired
    private WeatherDataCollectionService weatherDataService;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        logger.info("Weather Data Sync Job. Start！");
        // 获取城市ID列表

        // TODO 调用城市服务获取数据
        List<City> cityList = null;

        try {
//			cityList = cityDataService.listCity();
            cityList = new ArrayList<>();
            City city = new City();
            city.setCityId(String.valueOf(101280601));
            cityList.add(city);
        } catch (Exception e) {
            logger.error("Exception!", e);
        }

        // 遍历城市ID获取天气
        for (City city : cityList) {
            String cityId = city.getCityId();
            logger.info("Weather Data Sync Job, cityId:" + cityId);

            weatherDataService.syncDateByCityId(cityId);
        }

        logger.info("Weather Data Sync Job. End！");
    }

}
