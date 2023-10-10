package online.superh.common.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 
* @TableName user
*/
@Data
public class User implements Serializable {

    /**
    * id
    */
    private Integer id;
    /**
    * 
    */
    private String phone;
    /**
    * 
    */
    private String pwd;
    /**
    * 
    */
    private Integer sex;
    /**
    * 
    */
    private String img;
    /**
    * 
    */
    private Date createTime;
    /**
    * 1是普通⽤户，2是管理员
    */
    private Integer role;
    /**
    * 
    */
    private String username;
    /**
    * 
    */
    private String wechat;


}
