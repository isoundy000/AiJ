package com.xiyoufang.aij.platform;

import com.jfinal.server.undertow.UndertowServer;
import com.xiyoufang.aij.core.*;
import com.xiyoufang.aij.platform.config.PlatformConfig;
import org.tio.server.ServerTioConfig;

/**
 * Created by 席有芳 on 2018-12-31.
 *
 * @author 席有芳
 */
public class AiJPlatformStarter extends AiJStarter {
    /**
     * 服务Code
     *
     * @return code
     */
    @Override
    protected int configServiceCode() {
        return 100001;
    }

    /**
     * 配置节点名称
     *
     * @return service name
     */
    @Override
    protected String configNodeName() {
        return "运营平台";
    }

    /**
     * 服务描述
     *
     * @return description
     */
    @Override
    protected String configNodeDescription() {
        return "运营管理平台";
    }

    /**
     * 配置指令路由
     *
     * @param router router
     */
    @Override
    protected void configRouter(Router router) {

    }

    /**
     * 响应路由
     *
     * @param rRouter rRouter
     */
    @Override
    protected void configRRouter(RRouter rRouter) {

    }

    /**
     * 配置 serverTioConfig
     *
     * @param serverTioConfig serverTioConfig
     */
    @Override
    protected void configServerTioConfig(ServerTioConfig serverTioConfig) {

    }

    /**
     * 初始化配置
     *
     * @param config config
     */
    @Override
    protected CoreConfig config(CoreConfig config) {
        PlatformConfig platformConfig = new PlatformConfig(config);
        platformConfig.setServiceType(ServiceType.PLATFORM);
        platformConfig.setDevMode(true);
        platformConfig.setWsPort(8083);
        return platformConfig;
    }

    /**
     * 配置平台数据源
     *
     * @return ds
     */
    @Override
    protected AiJDs configPlatformDs() {
        return createAiJDs(prop.get("db.platform.url"), prop.get("db.platform.username"),
                prop.get("db.platform.password"), prop.get("db.platform.dialect"), prop.get("db.platform.type"));
    }

    /**
     * 配置用户中心数据源
     *
     * @return ds
     */
    @Override
    protected AiJDs configUserCenterDs() {
        return createAiJDs(prop.get("db.users.url"), prop.get("db.users.username"),
                prop.get("db.users.password"), prop.get("db.users.dialect"), prop.get("db.users.type"));
    }

    /**
     * 配置核心数据源
     *
     * @param coreDs coreDs
     * @return coreDs
     */
    @Override
    protected CoreDs configDs(CoreDs coreDs) {
        return coreDs;
    }

    /**
     * 配置注册中
     *
     * @param registryCenter 注册中心
     */
    @Override
    protected void configRegistryCenter(RegistryCenter registryCenter) {
    }

    /**
     * 启动完成后开始回调
     */
    @Override
    protected void onStart() {

    }

    /**
     * 开始，用于初始化
     */
    @Override
    protected void onCreate() {
        loadPropertyFile("platform_config.properties");
    }

    public static void main(String[] args) {
        UndertowServer.create(AiJPlatformConfig.class).configWeb(builder -> {
            builder.addListener("org.apache.shiro.web.env.EnvironmentLoaderListener");
            builder.addFilter("shiro", "org.apache.shiro.web.servlet.ShiroFilter");
            builder.addFilterUrlMapping("shiro", "/*");
        }).start();
    }

}
