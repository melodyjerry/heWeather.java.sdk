package com.heweather.api.service;

import com.heweather.api.dto.response.HeWeatherResponse;

/**
 * 城市信息搜索
 * add by djc
 */
public interface HeWeatherLocationService {

    //城市信息搜索（location = 城市名称，key = 用户认证ID;）
    HeWeatherResponse getLocation(String location);

    //城市信息搜索(location = 城市名称，key = 用户认证ID; adm = 城市所属行政区;range = 搜索范围 ;number = 返回城市数量; lang = 语言 )
    HeWeatherResponse getLocation(String location, String adm, String range, Integer number, String lang);

    //城市信息搜索 （location = 城市名称，key = 用户认证ID ； adm = 城市所属行政区;range = 搜索范围 ;）
    HeWeatherResponse getLocation(String location, String adm, String range);

    //热门城市搜索（key = 用户认证ID;）
    HeWeatherResponse getTopLocation();

    //热门城市搜索（key = 用户认证ID; range = 搜索范围 ;number = 返回城市数量; lang = 语言）
    HeWeatherResponse getTopLocation(String range, Integer number, String lang);

    //城市信息搜索 （location = 城市名称，key = 用户认证ID ； lang = 语言; range = 搜索范围 ;）
    HeWeatherResponse getTopLocation(String adm, String range, String lang);

    //poi信息搜索 (location = 城市名称，key = 用户认证ID ；  type = poi类型 ;）
    HeWeatherResponse getLookupPoiLocation(String location, String type);

    //poi信息搜索(location = 城市名称，key = 用户认证ID ；type = poi类型 ; radius = 搜索范围 ；city = 所在城市； number = 返回城市数量 ； lang = 语言; ）
    HeWeatherResponse getLookupPoiLocation(String location,String type, String city, Integer number, String lang);

    //poi范围搜索 (location = 城市名称，key = 用户认证ID ； type = poi类型; ）
    HeWeatherResponse getRangePoiLocation(String location,String type);

    //poi范围搜索 (location = 城市名称，key = 用户认证ID ；type = poi类型 ; radius = 搜索范围 ； number = 返回城市数量 ； lang = 语言;）
    HeWeatherResponse getRangePoiLocation(String location, String type, Integer radius, Integer number, String lang);

}
