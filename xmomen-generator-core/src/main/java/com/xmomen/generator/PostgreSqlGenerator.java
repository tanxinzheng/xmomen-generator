package com.xmomen.generator;

import com.xmomen.generator.configuration.GeneratorConfiguration;
import com.xmomen.generator.jdbc.DatabaseType;
import com.xmomen.generator.mapping.TableMapper;
import com.xmomen.generator.model.ColumnInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by tanxinzheng on 2019/2/20.
 */
@Slf4j
public class PostgreSqlGenerator extends SqlGenerator {

    @Override
    public DatabaseType getDatabaseType() {
        return DatabaseType.PGSQL;
    }

    /**
     * 查询字段信息
     *
     * @param sqlSession
     * @param configuration
     * @return
     */
    @Override
    public List<ColumnInfo> selectColumns(SqlSession sqlSession, GeneratorConfiguration configuration) {
        return sqlSession.getMapper(TableMapper.class).getTableInfoByPGSQL(configuration);
    }
}
