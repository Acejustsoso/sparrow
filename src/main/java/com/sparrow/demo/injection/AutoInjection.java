package com.sparrow.demo.injection;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix="my")
public class AutoInjection {
    public String name;
}
