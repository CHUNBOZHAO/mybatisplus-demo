package test;

import com.baomidou.ant.rsps.ApiService;
import com.baomidou.ant.rsps.entity.JhytBoxInfo;
import com.baomidou.ant.rsps.entity.PageBean;
import com.baomidou.ant.rsps.mapper.JhytBoxInfoMapper;
import com.baomidou.ant.rsps.service.IJhytBoxInfoService;
import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiService.class)
public class SampleTest {

    @Autowired
    private JhytBoxInfoMapper jhytBoxInfoMapper;

    @Autowired
    private IJhytBoxInfoService jhytBoxInfoService;

    @Test
    public void testSelect() {

//        Page page = new Page();
//
//        page.setPages(0);
//        page.setSize(100);
//
//        IPage iPage = jhytBoxInfoService.selectUserPage(page, 0);
//
//
//        System.out.println(iPage.getRecords());

        AbstractWrapper wrapper = new QueryWrapper();


        //  设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(0, 100);

//        List<JhytBoxInfo> allItems = itemMapper.findAll();

        List list = jhytBoxInfoMapper.selectList(wrapper);
        int countNums = jhytBoxInfoMapper.selectCount(wrapper);

        PageBean<JhytBoxInfo> pageData = new PageBean<>();
        pageData.setCurrentPage(0);
        pageData.setPageSize(100);
        pageData.setItems(list);

        System.out.println(pageData);






        list.forEach(System.out::println);


       /* Page page = new Page();

        page.setPages(0);
        page.setSize(100);

        IPage iPage = jhytBoxInfoMapper.selectPageVo(page,0);


        System.out.println(iPage.getSize()+"**"+iPage.getTotal());
        System.out.println(iPage.getRecords());*/

    }


}