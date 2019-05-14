package com.koncheng.weather.service;

import com.koncheng.weather.vo.City;

import java.util.List;

/**
 * City Data Service.
 * 
 * @since 1.0.0 2017年11月23日
 * @author ChenYong
 */
public interface CityDataService {

	/**
	 * 获取City列表
	 * @return
	 * @throws Exception
	 */
	List<City> listCity() throws Exception;
}
