package online.superh.user.controller;

import online.superh.common.domain.User;
import online.superh.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-09 16:08
 */
@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("find_by_id")
    public User findById(int id) {
        return userService.getById(id);
    }

}
