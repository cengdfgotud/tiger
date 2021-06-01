package com.nbb.dao;

import com.nbb.bean.Agent;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * User: steak-yuqi
 * Date: 2017/9/12
 * Time: 15:10
 * Desc:
 */
@Repository
public class AgentDao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    public Agent selectAgentById(int id) {
        String sql = " select * from agent where id=? ";
        List<Agent> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Agent.class),id);
        return CollectionUtils.isNotEmpty(list) ? list.get(0) : null;
    }



    public Map<String,Object> selectMapById(int id) {
        String sql = " select * from agent where id=? ";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql,id);
        //List<Map> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper(HashMap.class),id);
        return CollectionUtils.isNotEmpty(list) ? list.get(0) : null;
    }
}
