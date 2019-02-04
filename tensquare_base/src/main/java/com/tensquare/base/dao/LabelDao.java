package com.tensquare.base.dao;

import com.tensquare.base.pojo.Label;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

/**
 * 标签数据访问接口
 *
 * @author Fredy
 * @version 1.0
 * @description com.tensquare.base.dao
 * @date 2019/2/4
 */

public interface LabelDao extends JpaRepository<Label, String>, JpaSpecificationExecutor<Label> {

}
