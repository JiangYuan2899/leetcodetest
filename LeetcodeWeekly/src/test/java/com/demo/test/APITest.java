package com.demo.test;

import com.demo.util.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.ArrayList;

import static com.demo.util.HttpUtil.FormartJson;
import static com.demo.util.HttpUtil.PrettyPrintJson;

@Slf4j
@SpringBootTest
public class APITest {
    @org.junit.jupiter.api.Test
    void test() throws ParseException {
        java.util.List<String> list=new ArrayList<>();
        list.add("上海嘉峥机械有限公司");
//        list.add("大众汽车自动变速器（天津）有限公司");
//        list.add("长沙长泰智能装备有限公司");
//        list.add("云南省恩洪煤矿");
//        list.add("卓轮（天津）机械有限公司");
//        list.add("大连连城数控机器股份有限公司");
//        list.add("欧文斯科宁（天津）建筑材料有限公司");
//        list.add("上海鼎阳寰宁机电设备有限公司");
//        list.add("许昌市建安区嘉恒工业装备有限公司");
//        list.add("重庆望江工业有限公司");
//        list.add("东风汽车传动轴有限公司");
//        list.add("唐山港陆钢铁有限公司");
//        list.add("西安中车永电捷力风能有限公司贵阳分公司");
//        list.add("鞍钢国贸攀枝花有限公司");
//        list.add("毅联实业无锡有限公司");
//        list.add("靖江宇泰纺织机械有限公司");
//        list.add("烟台沃尔姆真空技术有限公司");
//        list.add("山东孚日电机有限公司");
//        list.add("江阴市艾格赛伦精密机械制造有限公司");
//        list.add("帕普精密机械科技（昆山）有限公司");
//        list.add("BPW（梅州）车轴有限公司");
//        list.add("琵乐风机科技（太仓）有限公司");
//        list.add("青岛约克运输设备有限公司");
//        list.add("抚顺特殊钢股份有限公司");
//        list.add("长春广通腾达经贸有限公司");
//        list.add("五矿营口中板有限责任公司");
//        list.add("SEW-电机（苏州）有限公司");
//        list.add("河北津西钢铁集团股份有限公司");
//        list.add("一重集团大连工程技术有限公司");
//        list.add("达涅利冶金设备（中国）有限公司");
//        list.add("国机重型装备集团股份有限公司");
//        list.add("德燃（浙江）动力科技有限公司");
//        list.add("徐州中良设备工程股份有限公司");
//        list.add("力喜冷冻设备（苏州）有限公司");
//        list.add("南京汇众汽车底盘系统有限公司");
//        list.add("久益环球（天津）装备制造有限公司");
//        list.add("江苏振江新能源装备股份有限公司");
//        list.add("成都市正品优配汽配有限公司");
//        list.add("广东怡丰智能车库有限公司");
//        list.add("英格索兰（常州）工具有限公司");
//        list.add("新乐市捷瑞机械配件有限公司");
//        list.add("珠海市康信精密机械有限公司");
//        list.add("北京宇航推进科技有限公司");
//        list.add("安徽皖南新维电机有限公司");
//        list.add("龙口中宇机械有限公司");
//        list.add("江苏中车电机有限公司福清分公司");
//        list.add("茂名市顺达五金机械设备有限公司");
//        list.add("伊顿液压系统（济宁）有限公司");
//        list.add("西马克国际贸易（北京）有限公司");
//        list.add("唐山新洛轴轴承销售有限公司");
//        list.add("福建雪人股份有限公司");
//        list.add("中实洛阳重型机械有限公司");
//        list.add("百威投资（中国）有限公司");
//        list.add("米切尔机械工程（南京）有限公司");
//        list.add("山东国风风电设备有限公司");
//        list.add("六安江淮电机有限公司");
//        list.add("中国长江三峡集团有限公司流域枢纽运行管理中心");
//        list.add("天津港保税区半球机械制造有限公司");
//        list.add("深圳市凯瑞传动技术有限公司");
//        list.add("宝钢工程技术集团有限公司");
//        list.add("重庆望鼎机电设备有限公司");
//        list.add("湖南天一科技股份有限公司奥星泵业分公司");
//        list.add("现代坦迪斯自动变速箱（山东）有限公司");
//        list.add("浙江朗迪集团股份有限公司");
//        list.add("天津市科睿思奇智控技术有限公司");
//        list.add("智沪铁路设备有限公司");
//        list.add("博戈橡胶金属（上海）有限公司");
//        list.add("山东上汽汽车变速器有限公司");
//        list.add("上海阳燊机械设备有限公司");
//        list.add("中粮工程装备（张家口）有限公司");
//        list.add("浙江恒逸集团有限公司");
//        list.add("山特维克矿山工程机械贸易（上海）有限公司");
//        list.add("汉江丹江口铝业有限责任公司");
//        list.add("大众一汽平台零部件有限公司天津分公司");
//        list.add("山西焦煤集团国际发展股份有限公司");
//        list.add("佛山市南海珠江减速机有限公司");
//        list.add("邵阳纺织机械有限责任公司");
//        list.add("奥展实业有限公司");
//        list.add("湖南耐普泵业股份有限公司");
//        list.add("乌鲁木齐柳泰克机械设备有限公司");
//        list.add("中材天山（云浮）水泥有限公司");
//        list.add("安徽鹏睿智能科技有限公司");
//        list.add("苏州市恒升机械有限公司");
//        list.add("枣庄华润纸业有限公司");
//        list.add("无锡市聚英机械制造有限公司");
//        list.add("肇庆市珊瑚食品机械有限公司");
//        list.add("山西华瑞德传动设备有限公司");
//        list.add("武汉重型机床集团有限公司");
//        list.add("上海龙钰电梯配件有限公司");
//        list.add("青岛四方庞巴迪铁路运输设备有限公司");
//        list.add("大众一汽平台零部件有限公司成都分公司");
//        list.add("中国石油四川石化有限责任公司");
//        list.add("中国石油天然气股份有限公司大连石化分公司");
//        list.add("中山复盛机械有限公司");
//        list.add("新余钢铁集团有限公司");
//        list.add("唐山百川智能机器股份有限公司");
//        list.add("惠尔信机械（泰兴）有限公司");
//        list.add("精进新能源技术（余姚）有限公司");
//        list.add("精诚工科汽车系统有限公司保定徐水精工底盘分公司");
//        list.add("广汽菲亚特克莱斯勒汽车有限公司");
        for(int i=0;i<list.size();i++){
            String url = "http://open.api.tianyancha.com/services/v3/open/investtree?flag=2&dir=down&keyword=北京百度网讯科技有限公司";
            System.out.println(executeGet(url));
        }

    }
    protected static String executeGet(String url) {
        BasicHttpParams httpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(httpParams, 1000);
        HttpConnectionParams.setSoTimeout(httpParams, 1000);
        HttpClient httpClient = new DefaultHttpClient(httpParams);
        String result = null;
        try {
            HttpGet get = new HttpGet(url);
            // 设置header
            get.setHeader("Authorization","1f8842e0-b3b7-4e21-a0ea-4c30e1cdcc30");
            // 设置类型
            HttpResponse response = httpClient.execute(get);
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString(entity, "utf-8");
            String status = FormartJson(result, "Status");
            if (!HttpUtil.HttpCodeRegex.isAbnornalRequest(status)) {
                String indented = PrettyPrintJson(result);
                jsonObject = JSONObject.parseObject(indented);
                JSONArray jsonArray = jsonObject.getJSONArray("Result");
                if (jsonArray == null) {
                    return null;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            httpClient.getConnectionManager().shutdown();
        }
        return result;
    }
}
