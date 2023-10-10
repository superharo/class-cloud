package online.superh.video.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import online.superh.common.domain.Video;
import online.superh.video.dao.VideoMapper;
import online.superh.video.service.VideoService;
import org.springframework.stereotype.Service;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-09 15:44
 */
@Slf4j
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements VideoService {

}
