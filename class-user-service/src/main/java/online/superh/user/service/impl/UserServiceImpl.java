package online.superh.user.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import online.superh.common.domain.User;
import online.superh.user.dao.UserMapper;
import online.superh.user.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-09 16:02
 */
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
