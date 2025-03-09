package io.github.juanalenca.arquiteturaspring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app.config")
public class AppProperties {
    private String var;
    private Integer value1;

    public String getVar() {
        return var;
    }

    public void setVar1(String var) {
        this.var = var;
    }

    public Integer getValue1() {
        return value1;
    }

    public void setValue1(Integer value1) {
        this.value1 = value1;
    }
}
