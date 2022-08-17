package com.kfit.test.web;


import com.kfit.test.bean.demo.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 测试
 * @author Honor
 *
 */

@RestController
@RequestMapping("/demo")

public class DemoController {

    /**
     *
     *返回demo数据
     *请求地址：http://127.0.0.1:8080/demo/getDemo
     * @return
     *
     */

@RequestMapping("/getDemo")
public Demo getDemo(){
    Demo demo=new Demo();
    demo.setId(1);
    demo.setName("老六");
    return demo;
}

    /**
     * 全局异常测试
     * @return
     */

@RequestMapping("/zeroException")
public int zeroException(){


    return 100/0;
}

}
