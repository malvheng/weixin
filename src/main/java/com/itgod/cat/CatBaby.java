package com.itgod.cat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;
import java.util.*;

/**
 * Created by Administrator on 2017/7/3.
 */
@Controller
public class CatBaby {

    @RequestMapping(value="/wash.do",method = {RequestMethod.GET})
    public String washCat(String name, String sts, String type, Model model) throws IOException {
        List<Map<String, String>> list = choiseCat(name, sts, type);
        Baby baby = getBaby(list);
        if(type.equals("fa")){
            type="法宠";
        }else{
            type="攻宠";
        }
        baby.setCatType(type);
        model.addAttribute(baby);
        return "wash";
    }


    public static List<Map<String,String>> choiseCat(String name,String sts,String type){
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> stsMap = new HashMap<>();
        Map<String,String> zizhiMap = new HashMap<>();
        Map<String,String> skillMap = new HashMap<>();

        if(sts.equals("1")) {
            int i = new Random().nextInt(100);
            if (i >= 0 && i < 5) {
                sts = "0";
            }
        }
        stsMap.put("sts",sts);
        if(sts.equals("1")){
            stsMap.put("sts","宝宝");
            stsMap.put("name",name);
            if(type.equals("fa")){
                zizhiMap.put("downG","1100");
                zizhiMap.put("upG","1400");
                zizhiMap.put("downFang","1200");
                zizhiMap.put("upFang","1500");
                zizhiMap.put("downT","1200");
                zizhiMap.put("upT","1500");
                zizhiMap.put("downFa","1300");
                zizhiMap.put("upFa","1650");
                zizhiMap.put("downS","1200");
                zizhiMap.put("upS","1500");
                skillMap.put("skill","水漫金山,灵性,法术连击,防御,");

            }else{
                zizhiMap.put("downG","1200");
                zizhiMap.put("upG","1550");
                zizhiMap.put("downFang","1200");
                zizhiMap.put("upFang","1500");
                zizhiMap.put("downT","1200");
                zizhiMap.put("upT","1500");
                zizhiMap.put("downFa","1200");
                zizhiMap.put("upFa","1500");
                zizhiMap.put("downS","1250");
                zizhiMap.put("upS","1550");
                skillMap.put("skill","必杀,连击,迅捷,高级反击");
            }

            list.add(stsMap);
            list.add(zizhiMap);
            list.add(skillMap);
        }else{
            stsMap.put("sts","变异宝宝");
            stsMap.put("name",name);
            String[] skill = new String[]{"高级法术暴击","高级必杀","高级法术连击","高级强力"};
            int i = new Random().nextInt(4);
            if(type.equals("fa")){
                zizhiMap.put("downG","1200");
                zizhiMap.put("upG","1500");
                zizhiMap.put("downFang","1300");
                zizhiMap.put("upFang","1600");
                zizhiMap.put("downT","1300");
                zizhiMap.put("upT","1600");
                zizhiMap.put("downFa","1400");
                zizhiMap.put("upFa","1750");
                zizhiMap.put("downS","1300");
                zizhiMap.put("upS","1600");
                skillMap.put("skill","水漫金山,灵性,法术连击,防御,"+skill[i]);
            }else{
                zizhiMap.put("downG","1300");
                zizhiMap.put("upG","1650");
                zizhiMap.put("downFang","1300");
                zizhiMap.put("upFang","1600");
                zizhiMap.put("downT","1300");
                zizhiMap.put("upT","1600");
                zizhiMap.put("downFa","1300");
                zizhiMap.put("upFa","1600");
                zizhiMap.put("downS","1350");
                zizhiMap.put("upS","1650");
                skillMap.put("skill","必杀,连击,迅捷,高级反击,"+skill[i]);
            }
            list.add(stsMap);
            list.add(zizhiMap);
            list.add(skillMap);
        }
        return list;
    }







    public static Baby getBaby(List<Map<String, String>> list){
        Baby baby = new Baby();
        Map<String, String> map = list.get(0);//宠物
        String name = map.get("name");
        baby.setCatName(name);
        String sts = map.get("sts");
        baby.setSts(sts);
        Map<String, String> obj = list.get(1);//资质
        int downG = Integer.parseInt(obj.get("downG"));
        int upG = Integer.parseInt(obj.get("upG"));
        int downFang = Integer.parseInt(obj.get("downFang"));
        int upFang = Integer.parseInt(obj.get("upFang"));
        int downT = Integer.parseInt(obj.get("downT"));
        int upT = Integer.parseInt(obj.get("upT"));
        int downFa = Integer.parseInt(obj.get("downFa"));
        int upFa = Integer.parseInt(obj.get("upFa"));
        int downS = Integer.parseInt(obj.get("downS"));
        int upS = Integer.parseInt(obj.get("upS"));
        int gong = new Random().nextInt(upG-downG)+new Random().nextInt(2)+downG;
        int fang = new Random().nextInt(upFang-downFang)+new Random().nextInt(2)+downFang;
        int ti = new Random().nextInt(upT-downT)+new Random().nextInt(2)+downT;
        int fa = new Random().nextInt(upFa-downFa)+new Random().nextInt(2)+downFa;
        int su = new Random().nextInt(upS-downS)+new Random().nextInt(2)+downS;

        baby.setGongUp(gong+(new Random().nextInt(upG-gong))+new Random().nextInt(2));
        baby.setFangUp(fang+(new Random().nextInt(upFang-fang))+new Random().nextInt(2));
        baby.setTiUp(ti+(new Random().nextInt(upT-ti))+new Random().nextInt(2));
        baby.setFaUp(fa+(new Random().nextInt(upFa-fa))+new Random().nextInt(2));
        baby.setSuUp(su+(new Random().nextInt(upS-su))+new Random().nextInt(2));

        baby.setGong(gong);
        baby.setFang(fang);
        baby.setTi(ti);
        baby.setFa(fa);
        baby.setSu(su);
        Map<String, String> map1 = list.get(2);//携带节能
        String skills = map1.get("skill");
        String[] split = skills.split(",");
        String skill = "";
        for(int k=0;k<split.length;k++){
            int ski = new Random().nextInt(10);
            if(ski>=0 && ski<5){
                skill+=split[k]+",";
            }
        }
        baby.setSkill(skill);
        return baby;
    }
}