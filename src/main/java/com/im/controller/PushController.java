package com.im.controller;

import com.corundumstudio.socketio.SocketIOClient;
import com.im.cache.ClientCache;
import com.im.pojo.Privatemessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.UUID;

@RestController
@RequestMapping("/push")
public class PushController {
    @Resource
    private ClientCache clientCache;

    @GetMapping("/user/{userId}")
    public String pushTuUser(@PathVariable("userId") String userId){
        HashMap<UUID, SocketIOClient> userClient = clientCache.getUserClient(userId);
        userClient.forEach((uuid, socketIOClient) -> {
            //向客户端推送消息
            socketIOClient.sendEvent("chatevent",new Privatemessage(new Long(1),new Long(2),"向客户段发送的消息"));
        });
        return "success";
    }
}
