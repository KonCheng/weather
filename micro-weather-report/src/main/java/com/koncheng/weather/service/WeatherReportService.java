package com.koncheng.weather.service;

import com.koncheng.weather.vo.Weather;

/**
 * Weather Report Service.
 * 
 * @since 1.0.0 2017年11月24日
 * @author ChenYong
 */
public interface WeatherReportService {

	/**
	 * 根据城市ID查询天气信息
	 * @param cityId
	 * @return
	 */
	Weather getDataByCityId(String cityId);
}
