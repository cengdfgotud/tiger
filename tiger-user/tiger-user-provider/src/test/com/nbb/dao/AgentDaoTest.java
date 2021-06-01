package com.nbb.dao;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * User: steak-yuqi
 * Date: 2017/9/12
 * Time: 16:03
 * Desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring.xml")
public class AgentDaoTest {

    @Resource
    private AgentDao agentDao;

    @Test
    public void testSelectMapById() throws Exception {
        System.out.println(JSONObject.toJSONString(agentDao.selectMapById(35)));
        System.out.println("7465");
    }
}