package com.nbb.service.remote;

import com.nbb.bean.Agent;
import com.nbb.dao.AgentDao;
import com.nbb.itf.AgentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User: steak-yuqi
 * Date: 2017/9/12
 * Time: 15:16
 * Desc:
 */
@Service
public class AgentServiceImpl implements AgentService{
    @Resource
    private AgentDao agentDao;
    /**
     * 根据主键id查询用户
     *
     * @param id
     * @return
     */
    @Override
    public Agent selectAgent(int id) {
        return agentDao.selectAgentById(id);
    }
}
