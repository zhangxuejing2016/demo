package com.xj.websocket;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

/**
 * webSocket配置处理器
* Created Created by zxj on 2017/9/19 14:10.
*/
@Data
@Configuration
@EnableWebSocket
public class XjWebSocketConfig implements WebSocketConfigurer{

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(myHandler(), "/ws").addInterceptors(new HttpSessionHandshakeInterceptor());
        registry.addHandler(myHandler(), "/ws/sockjs").addInterceptors(new HttpSessionHandshakeInterceptor()).withSockJS();
    }
    @Bean
    public WebsocketHandler myHandler() {
        return new WebsocketHandler();
    }
}
