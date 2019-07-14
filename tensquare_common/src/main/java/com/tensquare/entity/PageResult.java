package com.tensquare.entity;

import lombok.Data;

import java.util.List;

/**
 * @author Fredy
 * @version 1.0
 * @description entity
 * @date 2019/2/3
 */
@Data
public class PageResult<T> {

    private Long total;
    private List<T> rows;

    public PageResult(Long total, List<T> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }
}
