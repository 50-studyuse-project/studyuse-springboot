package pers.awesomeme.studyusespringboot.service;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Service;
import pers.awesomeme.commoncode.ApiResp;

@Service
public class MyService
{
    @NacosValue(value = "${my.a}", autoRefreshed = true)
    private String theVal;

    public ApiResp<Long> getCurTimestamp()
    {
        Console.log("输出数据【{}】", theVal);
        return ApiResp.successData(DateUtil.date().getTime());
    }
}
