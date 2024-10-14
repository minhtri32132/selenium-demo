package com.project.config;

public final class ConfigFactory {
    public static EnvironmentConfig getConfig()
    {
        return org.aeonbits.owner.ConfigFactory.create(EnvironmentConfig.class);
    }
}
