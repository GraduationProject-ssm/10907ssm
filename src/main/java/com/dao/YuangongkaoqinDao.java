package com.dao;

import com.entity.YuangongkaoqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuangongkaoqinVO;
import com.entity.view.YuangongkaoqinView;


/**
 * 员工考勤
 * 
 * @author 
 * @email 
 * @date 2020-12-28 17:10:33
 */
public interface YuangongkaoqinDao extends BaseMapper<YuangongkaoqinEntity> {
	
	List<YuangongkaoqinVO> selectListVO(@Param("ew") Wrapper<YuangongkaoqinEntity> wrapper);
	
	YuangongkaoqinVO selectVO(@Param("ew") Wrapper<YuangongkaoqinEntity> wrapper);
	
	List<YuangongkaoqinView> selectListView(@Param("ew") Wrapper<YuangongkaoqinEntity> wrapper);

	List<YuangongkaoqinView> selectListView(Pagination page,@Param("ew") Wrapper<YuangongkaoqinEntity> wrapper);
	
	YuangongkaoqinView selectView(@Param("ew") Wrapper<YuangongkaoqinEntity> wrapper);
	
}
