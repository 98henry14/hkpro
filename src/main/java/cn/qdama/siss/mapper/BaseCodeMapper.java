package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.BaseCode;
import cn.qdama.siss.bean.BaseCodeKey;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface BaseCodeMapper {
    @Delete({
        "delete from t_bd_base_code",
        "where type_no = #{typeNo,jdbcType=CHAR}",
          "and code_id = #{codeId,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(BaseCodeKey key);

    @Delete({
            "delete from t_bd_base_code",
            "where type_no = #{typeNo,jdbcType=CHAR}",
            "and code_id <> #{codeId,jdbcType=CHAR}"
    })
    int deleteS1Others(BaseCodeKey key);

    @Insert({
        "insert into t_bd_base_code (type_no, code_id, ",
        "code_name, english_name, ",
        "code_type, memo)",
        "values (#{typeNo,jdbcType=CHAR}, #{codeId,jdbcType=CHAR}, ",
        "#{codeName,jdbcType=VARCHAR}, #{englishName,jdbcType=VARCHAR}, ",
        "#{codeType,jdbcType=VARCHAR}, #{memo,jdbcType=VARCHAR})"
    })
    int insert(BaseCode record);

    @InsertProvider(type=BaseCodeSqlProvider.class, method="insertSelective")
    int insertSelective(BaseCode record);

    @Select({
        "select",
        "type_no, code_id, code_name, english_name, code_type, memo",
        "from t_bd_base_code",
        "where type_no = #{typeNo,jdbcType=CHAR}",
          "and code_id = #{codeId,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="type_no", property="typeNo", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="code_id", property="codeId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="code_name", property="codeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="english_name", property="englishName", jdbcType=JdbcType.VARCHAR),
        @Result(column="code_type", property="codeType", jdbcType=JdbcType.VARCHAR),
        @Result(column="memo", property="memo", jdbcType=JdbcType.VARCHAR)
    })
    BaseCode selectByPrimaryKey(BaseCodeKey key);

    @UpdateProvider(type=BaseCodeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(BaseCode record);

    @Update({
        "update t_bd_base_code",
        "set code_name = #{codeName,jdbcType=VARCHAR},",
          "english_name = #{englishName,jdbcType=VARCHAR},",
          "code_type = #{codeType,jdbcType=VARCHAR},",
          "memo = #{memo,jdbcType=VARCHAR}",
        "where type_no = #{typeNo,jdbcType=CHAR}",
          "and code_id = #{codeId,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(BaseCode record);
}