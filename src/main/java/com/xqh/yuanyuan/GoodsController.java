package com.xqh.yuanyuan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    static Goods[] goodsArr ={
            new Goods(0, "西瓜",12,"甘肃特产西瓜，10斤只需12元，买二送一"),

            new Goods(1, "葡萄",15,"新疆特产，速来抢购，超值优惠"),

            new Goods(2,"蓝月亮洗衣液",35,"厂家直销，价格优惠"),

    };

        @RequestMapping("/get")
        public String aaa(
                @RequestParam("id")  Integer id,
                ModelMap m){
            m.addAttribute("goodsName",goodsArr[id].goodsName);
            m.addAttribute("goodsPrice",goodsArr[id].goodsPrice);
            m.addAttribute("description",goodsArr[id].description);
            return"template_goods";

        }
        @RequestMapping("/list")
        public String bbb(ModelMap m){
            m.addAttribute("goodsS",goodsArr);
            return"template_goods_list";
        }
}
