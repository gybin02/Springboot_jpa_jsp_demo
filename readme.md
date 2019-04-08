## Spring Jpa Jsp Demo
测试 Spring Jpa 使用


## 问题记录

####  1. 编译失败
```$xslt

The bean 'userDao', defined in null, could not be registered. A bean with that name has already been defined in file [/Users/tony/Documents/jsp-demo/target/classes/com/example/jspdemo/dao/UserDao.class] and overriding is disabled.

Action:

Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true

```
Fixed:

去掉UserDao 上面的@Mapping. 使用Jpa 后不需要配置

#### 
```$xslt
Caused by: java.sql.SQLSyntaxErrorException: Unknown column 'user0_.birthday' in 'field list'
```
需要把数据库没有字段去掉，例子中需要去掉 birthday
#### 测试AddUser方法失败
```$xslt
Caused by: java.sql.SQLSyntaxErrorException: Table 'spring.hibernate_sequence' doesn't exist
```
fix: 需要把主键的 @GeneratedValue 替换成 @GeneratedValue(strategy = GenerationType.IDENTITY)。 
