package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 黄功元 on 2019/2/2.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
