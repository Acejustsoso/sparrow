package com.sparrow.demo.injection;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AutoInjectionController {

    private final AutoInjection autoInjection;

    @GetMapping("/test/my_injection")
    public Object test(){
        return autoInjection.getName();
    }
}
