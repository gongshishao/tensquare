package com.tensquare.base.pojo;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Fredy
 * @version 1.0
 * @description com.tensquare.base.pojo
 * @date 2019/2/3
 */
@Entity
@Table(name="tb_label")
@Data
public class Label {
    
    @Id
    private   String   id;//
    private   String   labelname;//标签名
    private   String   state;//状态
    private   Long   count;//使用数量
    private   Long   fans;//关注数
    private   String   recommend;//是否推荐

}
