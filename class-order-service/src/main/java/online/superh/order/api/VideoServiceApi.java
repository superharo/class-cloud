package online.superh.order.api;

import online.superh.common.domain.Video;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-10 17:37
 */
@FeignClient(value="class-video-service")
public interface VideoServiceApi {

    @GetMapping("/api/v1/video/find_by_id")
    Video findById(@RequestParam("id") int id);

}
