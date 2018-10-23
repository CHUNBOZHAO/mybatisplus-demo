package com.baomidou.ant.rsps.controller;


import com.baomidou.ant.rsps.entity.JhytBoxInfo;
import com.baomidou.ant.rsps.entity.PageBean;
import com.baomidou.ant.rsps.service.IJhytBoxInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhaochunbo
 * @since 2018-10-22
 */
@RestController
@RequestMapping("/rsps/jhyt-box-info")
public class JhytBoxInfoController {

    @Autowired
    private IJhytBoxInfoService iJhytBoxInfoService;

    @RequestMapping("/test")
    public PageBean<JhytBoxInfo> test(int pageNum, int pageSize){

        return iJhytBoxInfoService.getAll(pageNum,pageSize);
    }
}
