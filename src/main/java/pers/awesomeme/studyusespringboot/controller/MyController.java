package pers.awesomeme.studyusespringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.awesomeme.commoncode.ApiResp;
import pers.awesomeme.studyusespringboot.service.MyService;

@RestController
public class MyController
{
    @Autowired
    private MyService myService;

    @GetMapping("/my/gct")
    public ApiResp<Long> getCurTimestamp()
    {
        return myService.getCurTimestamp();
    }
}
