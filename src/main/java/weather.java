import java.util.Date;

public class weather {
//    "nums":226, //今日实时请求次数
//            "cityid":"101120101", //城市ID
//            "city":"济南",
//            "date":"2022-05-05",
//            "week":"星期四",
//            "update_time":"22:38", //更新时间
//            "wea":"多云", //天气情况
//            "wea_img":"yun", //天气标识
//            "tem":"25", //实况温度
//            "tem_day":"30", //白天温度(高温)
//            "tem_night":"23", //夜间温度(低温)
//            "win":"南风", //风向
//            "win_speed":"3级", //风力
//            "win_meter":"19km\/h", //风速
//            "air":"53", //空气质量
//            "pressure":"987", //气压
//            "humidity":"27%" //湿度
        private String cityId; //城市ID
        private String city;//城市
        private String date;//日期
        private String week;//星期
        private String update_tim;//更新时间
        private String wea;//天气情况
        private String wea_img;//天气标识
        private String tem;//实况温度
        private String tem_day;//白天温度
        private String tem_night;//夜间温度
        private String win;//风向
        private String win_speed;//风力
        private String win_meter;//风速
        private String air;//空气质量
        private String pressure;//气压
        private String humidity;//湿度

    public weather() {
    }

    public weather(String cityId, String city, String date, String week, String update_tim, String wea, String wea_img, String tem, String tem_day, String tem_night, String win, String win_speed, String win_meter, String air, String pressure, String humidity) {
        this.cityId = cityId;
        this.city = city;
        this.date = date;
        this.week = week;
        this.update_tim = update_tim;
        this.wea = wea;
        this.wea_img = wea_img;
        this.tem = tem;
        this.tem_day = tem_day;
        this.tem_night = tem_night;
        this.win = win;
        this.win_speed = win_speed;
        this.win_meter = win_meter;
        this.air = air;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "weather{" +
                "cityId='" + cityId + '\'' +
                ", city='" + city + '\'' +
                ", date='" + date + '\'' +
                ", week='" + week + '\'' +
                ", update_tim='" + update_tim + '\'' +
                ", wea='" + wea + '\'' +
                ", wea_img='" + wea_img + '\'' +
                ", tem='" + tem + '\'' +
                ", tem_day='" + tem_day + '\'' +
                ", tem_night='" + tem_night + '\'' +
                ", win='" + win + '\'' +
                ", win_speed='" + win_speed + '\'' +
                ", win_meter='" + win_meter + '\'' +
                ", air='" + air + '\'' +
                ", pressure='" + pressure + '\'' +
                ", humidity='" + humidity + '\'' +
                '}';
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getUpdate_tim() {
        return update_tim;
    }

    public void setUpdate_tim(String update_tim) {
        this.update_tim = update_tim;
    }

    public String getWea() {
        return wea;
    }

    public void setWea(String wea) {
        this.wea = wea;
    }

    public String getWea_img() {
        return wea_img;
    }

    public void setWea_img(String wea_img) {
        this.wea_img = wea_img;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public String getTem_day() {
        return tem_day;
    }

    public void setTem_day(String tem_day) {
        this.tem_day = tem_day;
    }

    public String getTem_night() {
        return tem_night;
    }

    public void setTem_night(String tem_night) {
        this.tem_night = tem_night;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public String getWin_speed() {
        return win_speed;
    }

    public void setWin_speed(String win_speed) {
        this.win_speed = win_speed;
    }

    public String getWin_meter() {
        return win_meter;
    }

    public void setWin_meter(String win_meter) {
        this.win_meter = win_meter;
    }

    public String getAir() {
        return air;
    }

    public void setAir(String air) {
        this.air = air;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }
}