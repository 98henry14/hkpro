package cn.qdama.siss.mapper;

import cn.qdama.siss.bean.SysSheetNo;
import cn.qdama.siss.bean.SysSheetNoExample;
import cn.qdama.siss.bean.SysSheetNoKey;
import org.apache.ibatis.annotations.*;

import java.util.List;
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
    List<SysSheetNo> selectByExample(SysSheetNoExample example);

    @Select({
        "select",
        "sheet_id, branch_no, sheet_value, temp_value, last_time, other1",
        "from t_sys_sheetno_flow",
        "where sheet_id = #{sheetId,jdbcType=CHAR}",
          "and branch_no = #{branchNo,jdbcType=CHAR}"
    })
    SysSheetNo selectByPrimaryKey(SysSheetNoKey key);

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