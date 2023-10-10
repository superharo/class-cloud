package online.superh.order.controller;

import online.superh.common.domain.Video;
import online.superh.common.domain.VideoOrder;
import online.superh.order.service.VideoOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-09 16:08
 */
@RestController
@RequestMapping("api/v1/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private VideoOrderService videoOrderService;
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/save")
    public Object save(int videoId){
        // Video video = restTemplate.getForObject("http://localhost:9200/api/v1/video/find_by_id?id=" + videoId, Video.class);
        //注册中心获取
        // List<ServiceInstance> list = discoveryClient.getInstances("class-video-server");
        // ServiceInstance serviceInstance = list.get(0);
        // Video video = restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+ "/api/v1/video/find_by_id?id="+videoId,Video.class);
        //通过负载均衡实现
        Video video = restTemplate.getForObject("http://class-video-service/api/v1/video/find_by_id?id="+videoId,Video.class);
        VideoOrder videoOrder = new VideoOrder();
        videoOrder.setCreateTime(new Date());
        videoOrder.setVideoId(video.getId());
        videoOrder.setVideoTitle(video.getTitle());
        return videoOrder;
    }

}
