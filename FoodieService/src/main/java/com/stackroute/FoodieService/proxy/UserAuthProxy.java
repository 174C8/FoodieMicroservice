package com.stackroute.FoodieService.proxy;


import com.stackroute.FoodieService.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "user-auth-proxy",url = "http://localhost:9000")
public interface UserAuthProxy {
    @PostMapping("api/v3/register")
    public ResponseEntity saveUser(@RequestBody User user);
}
