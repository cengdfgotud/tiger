package com.nbb.check;

import com.alibaba.dubbo.common.utils.NetUtils;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.ProtocolConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * @author Administrator
 * @title: wolf-api
 * @package com.hefan.common.check
 * @copyright: Copyright (c) 2017
 * @date 2017/6/28 0028 11:26
 */
@Component
public class DynamicDubboPortReaderImpl implements ApplicationContextAware {

  @Autowired
  private ApplicationContext applicationContext;
  private int port = 20880;

  @Value("${environment}")
  private String environment;

  @Value("${dubbo.rest.port}")
  private String restPort;



  private Logger logger = LoggerFactory.getLogger(DynamicDubboPortReaderImpl.class);

  @PostConstruct
  public void init() {
    //非生产环境
    if (!StringUtils.isBlank(environment) && !environment.equals("online")) {
      Map<String, ProtocolConfig> beansOfType = applicationContext.getBeansOfType(ProtocolConfig.class);
      for (Map.Entry<String, ProtocolConfig> item : beansOfType.entrySet()) {
        //过滤rest
        if (item.getKey().equals("rest")) {
          logger.info("#####################{}环境，dubbo rest端口号{}#####################", environment, restPort);
          item.getValue().setPort(Integer.parseInt(StringUtils.isBlank(restPort) ? "8055" : restPort));
          continue;
        }
        port = NetUtils.getAvailablePort(50000);
        logger.info("#####################{}环境，dubbo端口号{}#####################", environment, port);
        item.getValue().setPort(port);
      }
    }
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = (ConfigurableApplicationContext) applicationContext;
  }
}