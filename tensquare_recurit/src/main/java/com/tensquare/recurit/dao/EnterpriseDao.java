package com.tensquare.recurit.dao;

import com.tensquare.recurit.pojo.Recruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.tensquare.recurit.pojo.Enterprise;

import java.util.List;

/**
 * 数据访问接口
 * @author Administrator
 *
 */
public interface EnterpriseDao extends JpaRepository<Enterprise,String>,JpaSpecificationExecutor<Enterprise>{
    
    /** 根据热门状态获取企业列表  
     * @param ishot  
     * @return  
     */
    public List<Enterprise> findByIshot(String isHot);


}
