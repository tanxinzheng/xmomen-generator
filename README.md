# 代码生成器
基于freemarker模板引擎开发的代码生成器Maven插件

## 使用指引
``` pom.xml
...
<plugin>
    <groupId>com.xmomen.maven.plugins</groupId>
    <artifactId>xmomen-generator-maven-plugin</artifactId>
    <version>1.1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>com.xmomen.maven.plugins</groupId>
            <artifactId>mybatis-generator</artifactId>
            <version>1.2.0-SNAPSHOT</version>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.31</version>
            <scope>runtime</scope>
        </dependency>
    </dependencies>
    <configuration>
        <configurationFile>src/main/resources/tools/generator-config.json</configurationFile>
    </configuration>
</plugin>
...
```
##  generatorConfig.json 配置说明
``` json
{
  "dataSource":{
    "driver":"com.mysql.jdbc.Driver",
    "url":"jdbc:mysql://localhost:3306/demo?useUnicode=true&amp;characterEncoding=utf8",
    "username":"root",
    "password":"root"
  },
  "tables":[
    {
      "domainName":"dictionary",
      "tableComment":"数据字典",
      "tableName":"xmo_dictionary",
      "targetPackage":"com.xmomen.module.system.entity.mapper",
      "modulePackage":"com.xmomen.module.system",
      "restMapping":"/dictionary"
    }
  ]
}
```

## freemarker模板参数示例
可根据以下模板参数修改或添加模板
```
{
	"columns":[
		{
			"actualColumnName":"ID",
			"columnComment":"主键",
			"columnName":"id",
			"defaultValue":"",
			"fullyJavaType":"java.lang.String",
			"hide":false,
			"javaType":"String",
			"jdbcType":"VARCHAR",
			"length":32,
			"nullable":false,
			"primaryKey":true
		},
		{
			"actualColumnName":"GROUP_NAME",
			"columnComment":"字典组名称",
			"columnName":"groupName",
			"defaultValue":"",
			"fullyJavaType":"java.lang.String",
			"hide":false,
			"javaType":"String",
			"jdbcType":"VARCHAR",
			"length":50,
			"nullable":false,
			"primaryKey":false
		},
		{
			"actualColumnName":"GROUP_CODE",
			"columnComment":"字典组代码",
			"columnName":"groupCode",
			"defaultValue":"",
			"fullyJavaType":"java.lang.String",
			"hide":false,
			"javaType":"String",
			"jdbcType":"VARCHAR",
			"length":50,
			"nullable":false,
			"primaryKey":false
		},
		{
			"actualColumnName":"NAME",
			"columnComment":"名称",
			"columnName":"name",
			"defaultValue":"",
			"fullyJavaType":"java.lang.String",
			"hide":false,
			"javaType":"String",
			"jdbcType":"VARCHAR",
			"length":50,
			"nullable":false,
			"primaryKey":false
		},
		{
			"actualColumnName":"CODE",
			"columnComment":"代码",
			"columnName":"code",
			"defaultValue":"",
			"fullyJavaType":"java.lang.String",
			"hide":false,
			"javaType":"String",
			"jdbcType":"VARCHAR",
			"length":50,
			"nullable":false,
			"primaryKey":false
		},
		{
			"actualColumnName":"SORT",
			"columnComment":"排序",
			"columnName":"sort",
			"fullyJavaType":"java.lang.Integer",
			"hide":false,
			"javaType":"Integer",
			"jdbcType":"INT",
			"length":0,
			"max":"0",
			"min":"0",
			"nullable":false,
			"primaryKey":false,
			"scale":0
		},
		{
			"actualColumnName":"ACTIVE",
			"columnComment":"激活",
			"columnName":"active",
			"defaultValue":"0",
			"fullyJavaType":"java.lang.String",
			"hide":false,
			"javaType":"String",
			"jdbcType":"CHAR",
			"length":1,
			"nullable":false,
			"primaryKey":false
		},
		{
			"actualColumnName":"PARENT_ID",
			"columnComment":"父节点",
			"columnName":"parentId",
			"defaultValue":"",
			"fullyJavaType":"java.lang.String",
			"hide":false,
			"javaType":"String",
			"jdbcType":"VARCHAR",
			"length":32,
			"nullable":true,
			"primaryKey":false
		},
		{
			"actualColumnName":"SHOW",
			"columnComment":"显示",
			"columnName":"show",
			"defaultValue":"0",
			"fullyJavaType":"java.lang.String",
			"hide":false,
			"javaType":"String",
			"jdbcType":"CHAR",
			"length":1,
			"nullable":false,
			"primaryKey":false
		}
	],
	"domainObjectClassName":"Dictionary",
	"domainObjectName":"dictionary",
	"domainObjectUnderlineName":"dictionary",
	"importClassList":{
		"java.lang.Integer":"java.lang.Integer",
		"java.lang.String":"java.lang.String"
	},
	"modulePackage":"com.xmomen.module.system",
	"primaryKeyColumn":{
		"actualColumnName":"ID",
		"columnComment":"主键",
		"columnName":"id",
		"defaultValue":"",
		"fullyJavaType":"java.lang.String",
		"hide":false,
		"javaType":"String",
		"jdbcType":"VARCHAR",
		"length":32,
		"nullable":false,
		"primaryKey":true
	},
	"restMapping":"/dictionary",
	"rootPath":"/Users/jeng/xmomen-repo/framework/xmomen-generator-maven-plugin/",
	"skip":false,
	"tableComment":"数据字典",
	"tableName":"xmo_dictionary",
	"targetPackage":"com.xmomen.module.system.entity.mapper"
}
```