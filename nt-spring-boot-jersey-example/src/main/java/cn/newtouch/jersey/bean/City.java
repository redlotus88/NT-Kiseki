package cn.newtouch.jersey.bean;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by dragon on 2018/2/13.
 */
public class City {

    private Long id;

    private String cityName;

    private String cityCode;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}
