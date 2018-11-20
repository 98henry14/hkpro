package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.SysSheetNo;
import cn.qdama.siss.bean.SysSheetNoExample;
import cn.qdama.siss.bean.SysSheetNoKey;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface SysSheetNoMapper {
    @Delete({
        "delete from t_sys_sheetno_flow",
        "where sheet_id = #{sheetId,jdbcType=CHAR}",
          "and branch_no = #{branchNo,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(SysSheetNoKey key);

    @Insert({
        "insert into t_sys_sheetno_flow (sheet_id, branch_no, ",
        "sheet_value, temp_value, ",
        "last_time, other1)",
        "values (#{sheetId,jdbcType=CHAR}, #{branchNo,jdbcType=CHAR}, ",
        "#{sheetValue,jdbcType=NUMERIC}, #{tempValue,jdbcType=NUMERIC}, ",
        "#{lastTime,jdbcType=TIMESTAMP}, #{other1,jdbcType=VARCHAR})"
    })
    int insert(SysSheetNo record);

    @InsertProvider(type=SysSheetNoSqlProvider.class, method="insertSelective")
    int insertSelective(SysSheetNo record);

    @SelectProvider(type=SysSheetNoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="sheet_id", property="sheetId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="branch_no", property="branchNo", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="sheet_value", property="sheetValue", jdbcType=JdbcType.NUMERIC),
        @Result(column="temp_value", property="tempValue", jdbcType=JdbcType.NUMERIC),
        @Result(column="last_time", property="lastTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="other1", property="other1", jdbcType=JdbcType.VARCHAR)
    })
    List<SysSheetNo> selectByExample(SysSheetNoExample example);

    @Select({
        "select",
        "sheet_id, branch_no, sheet_value, temp_value, last_time, other1",
        "from t_sys_sheetno_flow",
        "where sheet_id = #{sheetId,jdbcType=CHAR}",
          "and branch_no = #{branchNo,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="sheet_id", property="sheetId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="branch_no", property="branchNo", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="sheet_value", property="sheetValue", jdbcType=JdbcType.NUMERIC),
        @Result(column="temp_value", property="tempValue", jdbcType=JdbcType.NUMERIC),
        @Result(column="last_time", property="lastTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="other1", property="other1", jdbcType=JdbcType.VARCHAR)
    })
    SysSheetNo selectByPrimaryKey(SysSheetNoKey key);

    @UpdateProvider(type=SysSheetNoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SysSheetNo record, @Param("example") SysSheetNoExample example);

    @UpdateProvider(type=SysSheetNoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SysSheetNo record, @Param("example") SysSheetNoExample example);

    @UpdateProvider(type=SysSheetNoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SysSheetNo record);

    @Update({
        "update t_sys_sheetno_flow",
        "set sheet_value = #{sheetValue,jdbcType=NUMERIC},",
          "temp_value = #{tempValue,jdbcType=NUMERIC},",
          "last_time = #{lastTime,jdbcType=TIMESTAMP},",
          "other1 = #{other1,jdbcType=VARCHAR}",
        "where sheet_id = #{sheetId,jdbcType=CHAR}",
          "and branch_no = #{branchNo,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(SysSheetNo record);
}