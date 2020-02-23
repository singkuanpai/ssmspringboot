# ssmspringboot

## 项目架构
spring + springmvc + mybatis + spring boot

## 安装插件
spring assitant
mybatis log plugin

## 创建项目
IntelliJ idea  -> new -> project -> spring assitant -> default

## 项目配置
spring.datasource.url=jdbc:mysql://localhost:3306/mytest
spring.datasource.username=mytest
spring.datasource.password=mytest
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.database = mysql

// Mybatis扫描
mybatis.mapper-locations = classpath*:mapper/*.xml
// 起别名。可省略写mybatis的xml中的resultType的全路径
mybatis.type-aliases-package = com.grant.ssmdbdemo.entity

mybatis.configuration.log-impl = org.apache.ibatis.logging.stdout.StdOutImpl



## Email
email: singkuanpai@gmail.com
