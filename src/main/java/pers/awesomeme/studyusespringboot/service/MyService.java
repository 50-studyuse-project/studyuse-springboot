package pers.awesomeme.studyusespringboot.service;

import cn.hutool.core.date.DateUtil;
import org.springframework.stereotype.Service;
import pers.awesomeme.commoncode.ApiResp;

@Service
public class MyService
{
    public ApiResp<Long> getCurTimestamp()
    {
        return ApiResp.successData(DateUtil.date().getTime());
    }
}
