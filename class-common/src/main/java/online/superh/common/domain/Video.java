package online.superh.common.domain;





import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 
* @TableName video
*/
@Data
public class Video implements Serializable {

    /**
    * id
    */
    private Integer id;
    /**
    * 视频标题
    */
    private String title;
    /**
    * 概述
    */
    private String summary;
    /**
    * 封面图
    */
    private String coverImg;
    /**
    * 价格,分
    */
    private Integer price;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 默认8.7,最高10分
    */
    private Double point;

}
