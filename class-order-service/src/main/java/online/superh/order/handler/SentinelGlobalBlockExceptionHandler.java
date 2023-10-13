package online.superh.order.handler;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @version: 1.0
 * @author: haro
 * @description: Sentinel 自定定义异常
 * @date: 2023-10-12 16:46
 */
@Component
public class SentinelGlobalBlockExceptionHandler implements BlockExceptionHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws Exception {
            Map<String,Object> backMap=new HashMap<>();
            if (e instanceof FlowException){
                backMap.put("code",-1);
                backMap.put("msg","限流-异常啦");
            }else if (e instanceof DegradeException){
                backMap.put("code",-2);
                backMap.put("msg","降级-异常啦");
            }else if (e instanceof ParamFlowException){
                backMap.put("code",-3);
                backMap.put("msg","热点-异常啦");
            }else if (e instanceof SystemBlockException){
                backMap.put("code",-4);
                backMap.put("msg","系统规则-异常啦");
            }else if (e instanceof AuthorityException){
                backMap.put("code",-5);
                backMap.put("msg","认证-异常啦");
            }
            // 设置返回json数据
            httpServletResponse.setStatus(500);
            httpServletResponse.setHeader("content-Type","application/json;charset=UTF-8");
            httpServletResponse.getWriter().write(JSON.toJSONString(backMap));
        }
}
