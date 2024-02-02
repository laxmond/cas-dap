package com.cas.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.engine.BeetlTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.cas.genrator.CasGeneratorApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;

@SpringBootTest(classes = CasGeneratorApplication.class)
public class CasGeneratorApplicationTest {
    @Test
    public void test() {
        DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig
                .Builder("jdbc:mysql://192.168.1.120:3306/cas_dap?useSSL=false&serverTimezone=UTC", "root", "root123456");
//                .schema("cas_dap_access")
//                .build();

//        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);
//        generator.strategy(strategyConfig().build());
//        generator.global(globalConfig().build());
//        generator.execute();
        String baseDir = "D://mybatis//";
        FastAutoGenerator.create(DATA_SOURCE_CONFIG)
                // 数据库配置
//                .dataSourceConfig((scanner, builder) -> builder.schema(scanner.apply("请输入表名称")))
                // 全局配置
                .globalConfig(builder -> builder.author("wmj").outputDir(baseDir + "java"))
                // 包配置
                .packageConfig(builder -> builder.parent("com.cas").pathInfo(Collections.singletonMap(OutputFile.xml, baseDir + "resources//mapper")))
//                .packageConfig((scanner, builder) -> builder.parent(scanner.apply("请输入包名")))
                // 策略配置
                .strategyConfig(builder -> builder.addInclude("config_access_listen").entityBuilder().enableLombok().enableFileOverride())
//                .strategyConfig((scanner, builder) -> builder.addInclude(scanner.apply("请输入表名，多个表名用,隔开")))

//                    模板引擎配置，默认 Velocity 可选模板引擎 Beetl 或 Freemarker 或 Enjoy
//                   .templateEngine(new BeetlTemplateEngine())
                   .templateEngine(new FreemarkerTemplateEngine())
//                   .templateEngine(new EnjoyTemplateEngine())

                .execute();

    }

    /**
     * 策略配置
     */
    protected static StrategyConfig.Builder strategyConfig() {
        return new StrategyConfig.Builder();
    }

    /**
     * 全局配置
     */
    protected static GlobalConfig.Builder globalConfig() {
        return new GlobalConfig.Builder();
    }
}
