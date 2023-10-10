package online.superh.video.controller;

import online.superh.common.domain.Video;
import online.superh.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-09 15:42
 */
@RestController
@RequestMapping("api/v1/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("find_by_id")
    public Video findById(int id) {
        return videoService.getById(id);
    }

}
