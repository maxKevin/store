package com.cy.store;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GeneratorMyBatisXML {

    public static void main(String[] args) {
        //准备相关的基础信息
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        String genCig = "/generatorConfig.xml";
        // 1.读取xml文件
        File configFile = new File(GeneratorMyBatisXML.class.getResource(genCig).getFile());
        // 2.装载config解析文件，并对xml文件进行解析
        ConfigurationParser configurationParser = new ConfigurationParser(warnings);
        Configuration conf = null;
        try {
            conf = configurationParser.parseConfiguration(configFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (XMLParserException e) {
            throw new RuntimeException(e);
        }
        // 3.初始化，MyBatisGenerator生成器，执行xml文件，生成相应的实体类
        DefaultShellCallback defaultShellCallback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = null;

        try {
            myBatisGenerator = new MyBatisGenerator(conf,defaultShellCallback,warnings);
        } catch (InvalidConfigurationException e) {
            throw new RuntimeException(e);
        }
        //生成实体类
        try {
            myBatisGenerator.generate(null);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
