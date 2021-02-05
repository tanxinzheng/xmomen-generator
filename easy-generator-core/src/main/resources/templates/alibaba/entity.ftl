package ${targetPackage};

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.github.tanxinzheng.framework.model.BaseEntity;
import lombok.Builder;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

<#if importClassList?exists>
    <#list importClassList?keys as mykey>
import ${mykey};
    </#list>
</#if>
import java.io.Serializable;

<#include "header.ftl"/>
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName(value = "${tableName}")
public class ${domainObjectClassName}DO extends BaseEntity implements Serializable {

<#if columns?exists>
    <#list columns as field>
    /** ${field['columnComment']} */
    <#if field.primaryKey>
    @TableId(value = "${field.actualColumnName}", type = IdType.UUID)
    <#else>
    @TableField(value = "${field.actualColumnName}")
    </#if>
    private ${field['javaType']} ${field['columnName']};
    </#list>
</#if>


}