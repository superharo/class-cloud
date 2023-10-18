package online.superh.order.api.callback;

import online.superh.common.domain.Video;
import online.superh.order.api.VideoServiceApi;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-13 13:46
 */
@Component
public class VideoServiceApiCallback implements VideoServiceApi {
    @Override
    public Video findById(int id) {
        Video video = new Video();
        video.setId(0);
        video.setTitle("兜底数据");
        video.setSummary("");
        video.setCoverImg("");
        video.setPrice(0);
        video.setCreateTime(new Date());
        video.setPoint(0.0D);
        return video;
    }
}
