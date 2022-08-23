import com.alibaba.fastjson.JSON;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;

public class Pusher {

    public static void main(String[] args) {
        push();
    }
    public static String airT(String air){
        int airI = Integer.parseInt(air);
        if (airI<50){
            return "优"+" "+"今天空气质量很好呢";
        }
        if (50<airI&&airI<100){
            return "良"+" "+"今天空气质量也不错哦";
        }
        if (100<airI&&airI<200){
            return "轻度污染"+" "+"今天空气质量不太好";
        }
        if (200<airI){
            return "中度污染"+" "+"今天空气质量有点坏";
        }
        if (300<airI){
            return "严重污染"+" "+"不要出门啦";
        }
        return "数据出错了";
    }
    public static String weatherT(String wea){
        if (wea.contains("雨")){
            return "不要忘记带伞哦";
        }else {
            return "冲冲冲";
        }
    }
    public static String winT(String tem) {
        int tem1 = Integer.parseInt(tem);
        if (tem1>=19&&tem1<26){
            return "好巴适的温度";
        }
        if (tem1<19){
            return "记得加衣服";

        }else {
            return "记得穿凉快点";
        }
    }

    //自己的
    private static String appId = "xx";
    private static String secret = "xx";



    public static void push(){
        //1，配置
        WxMpInMemoryConfigStorage wxStorage = new WxMpInMemoryConfigStorage();
        wxStorage.setAppId(appId);
        wxStorage.setSecret(secret);
        WxMpService wxMpService = new WxMpServiceImpl();
        wxMpService.setWxMpConfigStorage(wxStorage);
        //2,推送消息
        WxMpTemplateMessage templateMessage = WxMpTemplateMessage.builder()
                .toUser("xxx") //接受者ID
                .templateId("xxx") //使用的模板ID
                .build();
//        Weather weather = WeatherUtils.getWeather();
//        Map<String, String> map = CaiHongPiUtils.getEnsentence();
        ToInterface toInterface = new ToInterface();
        //调用API
        String str = toInterface.interfaceUtil("https://www.yiketianqi.com/free/day?appid=44337813&appsecret=bXdB8AaT&unescape=1&cityid=101120101");
        weather weather= JSON.parseObject(str,weather.class);

        templateMessage.addData(new WxMpTemplateData("city",weather.getCity() + ""+"\n","#173177"));
        templateMessage.addData(new WxMpTemplateData("riqi",weather.getDate() + "  "+ weather.getWeek(),"#00BFFF"));
        templateMessage.addData(new WxMpTemplateData("tianqi",weather.getWea()+" "+weatherT(weather.getWea())+"\n","#00FFFF"));
        templateMessage.addData(new WxMpTemplateData("wendu",weather.getTem() + "℃ "+winT(weather.getTem())+"\n","#EE212D"));
        templateMessage.addData(new WxMpTemplateData("fengxiang",weather.getWin_speed()+ ""+"\n","#FF6347" ));
        templateMessage.addData(new WxMpTemplateData("fengli",weather.getWin_meter()+ ""+"\n","#42B857" ));
        templateMessage.addData(new WxMpTemplateData("air",airT(weather.getAir())+ ""+"\n","#B95EA3" ));
        templateMessage.addData(new WxMpTemplateData("shidu",weather.getHumidity()+"\n","#FF69B4"));
        String beizhu = "❤"+"\n";
        templateMessage.addData(new WxMpTemplateData("beizhu",beizhu,"#FF0000"));
        try {
            System.out.println(templateMessage.toJson());
            System.out.println(wxMpService.getTemplateMsgService().sendTemplateMsg(templateMessage));
        } catch (Exception e) {
            System.out.println("推送失败：" + e.getMessage());
            e.printStackTrace();
        }
    }


}
