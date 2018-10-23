package com.baomidou.ant.rsps.service.impl;

import com.baomidou.ant.rsps.entity.JhytBoxInfo;
import com.baomidou.ant.rsps.entity.PageBean;
import com.baomidou.ant.rsps.mapper.JhytBoxInfoMapper;
import com.baomidou.ant.rsps.service.IJhytBoxInfoService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaochunbo
 * @since 2018-10-22
 */
@Service
public class JhytBoxInfoServiceImpl extends ServiceImpl<JhytBoxInfoMapper, JhytBoxInfo> implements IJhytBoxInfoService {

    @Autowired
    private JhytBoxInfoMapper mapper;

    @Override
    public IPage<JhytBoxInfo> selectUserPage(Page<JhytBoxInfo> page, Integer state) {
        return mapper.selectPageVo(page,state);
    }

    @Override
    public PageBean<JhytBoxInfo> getAll(Integer pageNum, Integer pageSize) {

        PageBean pageBean = new PageBean();

        //使用分页插件,核心代码就这一行
        PageHelper.startPage(pageNum, pageSize);
        // 获取
        List<JhytBoxInfo> list = mapper.getAll();

        pageBean.setItems(list);
        return pageBean;
    }
}
