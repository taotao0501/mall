package com.imooc.reader.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.imooc.reader.entity.Test2;
import com.imooc.reader.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MyBatisPlus {
    @Resource
    private TestMapper testMapper;

    @Test
    public void testInsert(){
        Test2 test2 = new Test2();
        test2.setContent("MyBatisPlus 测试");
        testMapper.insert(test2);
    }

    @Test
    public void testUpdate(){
        Test2 test2= testMapper.selectById(32);

        test2.setContent("MyBatisPlus 测试 修改");
        testMapper.updateById(test2);
    }

    @Test
    public void testDelete(){
        testMapper.deleteById(32);
    }

    @Test
    public void testSelect(){
        QueryWrapper<Test2> queryWrapper = new QueryWrapper<Test2>();
        queryWrapper.eq("id", 27);
        //queryWrapper.gt("id", 28);
        List<Test2> list = testMapper.selectList(queryWrapper);
        System.out.println(list.get(0));
    }
}
