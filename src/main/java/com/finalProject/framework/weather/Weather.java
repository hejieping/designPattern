package com.finalProject.framework.weather;

import java.util.List;
import java.util.Random;

import com.finalProject.applications.Constants;
import com.finalProject.applications.OutputsUtil;
import com.google.common.collect.Lists;

/**
 * 天气，单例模式
 * @author <a href="mailto:jieping.hjp@cainiao.com">jieping.hjp</a>
 * @since 2017/10/20 上午10:33
 */
public class Weather {
    private List<String> weatherType = Lists.newArrayList();
    private Random random = new Random();
    private static class WeatherHoder{
        private static final Weather WEATHER = new Weather();
    }
    private Weather(){
        System.out.println(OutputsUtil.getOutput(this,"weatherSingleton","construct","create weatherSingleton"));
        weatherType.add(Constants.WINTER);
        weatherType.add(Constants.RAINSTORM);
        weatherType.add(Constants.SUMMER);
    }
    public static final Weather getWeather(){
        return WeatherHoder.WEATHER;
    }
    public String nowWeather(){
        int index = random.nextInt(weatherType.size());
        return weatherType.get(index);
    }
}
