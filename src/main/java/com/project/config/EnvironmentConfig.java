package com.project.config;


import org.aeonbits.owner.Config;
@Config.Sources(value = "file:${user.dir}/src/test/resources/environment/st.properties")
public interface EnvironmentConfig extends Config {
    long timeout();
    String url();
    String browser();
}
