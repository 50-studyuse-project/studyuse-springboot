package pers.awesomeme.studyusespringboot.service;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import pers.awesomeme.commoncode.ApiResp;

@Service
@RefreshScope // 在这个bean中开启自动更新
public class MyService
{
    @Value("${my.a}") // 使用 @Value 注解
    private String theVal;

    public ApiResp<Long> getCurTimestamp()
    {
        Console.log("输出数据【{}】", theVal);
        return ApiResp.successData(DateUtil.date().getTime());
    }
}
