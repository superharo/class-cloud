package online.superh.common.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 
* @TableName video_order
*/
@Data
public class VideoOrder implements Serializable {

    /**
    * id
    */
    private Integer id;
    /**
    * 订单唯⼀标识
    */
    private String outTradeNo;
    /**
    * 0表示未⽀付，1表示已⽀付
    */

    private Integer state;
    /**
    * 订单⽣成时间
    */
    private Date createTime;
    /**
    * ⽀付⾦额，单位分
    */
    private Integer totalFee;

    /**
    * 视频主键
    */
    private Integer videoId;
    /**
    * 视频标题
    */
    private String videoTitle;
    /**
    * 视频图⽚
    */
    private String videoImg;
    /**
    * ⽤户id
    */
    private Integer userId;


}
