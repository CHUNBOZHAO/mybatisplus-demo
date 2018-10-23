package com.baomidou.ant.rsps.service;

import com.baomidou.ant.rsps.entity.JhytBoxInfo;
import com.baomidou.ant.rsps.entity.PageBean;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhaochunbo
 * @since 2018-10-22
 */
public interface IJhytBoxInfoService extends IService<JhytBoxInfo> {

    IPage<JhytBoxInfo> selectUserPage(Page<JhytBoxInfo> page, Integer state);

    PageBean<JhytBoxInfo> getAll(Integer pageNum, Integer pageSize);
}
