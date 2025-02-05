package com.itheima.controller;

import com.itheima.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * 参数请求控制器
 */
@Controller
public class ParamController {
    //普通参数
    @RequestMapping("commonParam")
    @ResponseBody
    public String commonParam(@RequestParam("name") String username, Integer age){
        System.out.println("name:" + username);
        System.out.println("age:" + age);
        return "commonParam";
    }

    /**
     *  pojoParam 类型
     *  开发过程中会有一个需求评审会：一般来说是由后端人员提供接口文档：有哪些接口，访问的路径
     *      访问方式是什么，请求参数是什么，返回参数是什么，都由后端人员定，定好后把文档给前端
     *      人员，这时候接口还没开发好。
     */
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println(user);
        return "commonParam";
    }

    @RequestMapping("pojoContainPojoParam")
    @ResponseBody
    public String pojoContainPojoParam(User user) {
        System.out.println(user);
        return "pojoContainPojoParam";
    }

    /**
     * 数组参数
     * @param
     * @return
     */
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes) {
        System.out.println(Arrays.toString(likes));
        return "arrayParam";
    }

    /**
     * list集合
     * @param likes
     * @return
     */
    @RequestMapping("/ListParam")
    @ResponseBody
    public String ListParam(@RequestParam  List<String> likes) {
        System.out.println(likes);
        return "ListParam";
    }

    /**
     * Map参数
     * @param maps
     * @return
     */
    @RequestMapping("mapParam")
    @ResponseBody
    public String mapParam(@RequestParam Map<String, String> maps) {
        System.out.println(maps);
        return "mapParam";
    }
}
