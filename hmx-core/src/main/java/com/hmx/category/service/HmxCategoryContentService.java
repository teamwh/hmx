package com.hmx.category.service;

import java.util.List;
import java.util.Map;

import com.hmx.category.entity.HmxCategoryContent;
import com.hmx.utils.result.PageBean;
import com.hmx.category.dto.HmxCategoryContentDto;
/**
 *  HmxCategoryContentService interface
 *
 */
public interface HmxCategoryContentService {
	
	/**
	 * @Method: insert 
	 * @Description: 添加
	 * @param hmxCategoryContent 要添加的对象
	 * @return 
	 */
	Boolean insert ( HmxCategoryContent hmxCategoryContent);
	
	/**
	 * @Method: deleteByIdArray 
	 * @Description: 批量删除
	 * @param ids 将要删除的对象主键字符串 例如:1,5,10,12
	 * @return true 删除成功  false 删除失败
	 */
	Boolean deleteByIdArray(String ids);
	
	/**
	 * @Method: update 
	 * @Description: 修改
	 * @param hmxCategoryContent 要修改的对象
	 * @return true 修改成功  false 修改失败
	 */
	Boolean update ( HmxCategoryContent hmxCategoryContent );
	
	/**
	 * @Method: info 
	 * @Description: 根据自增主键查询对象信息
	 * @param hmxCategoryContent 根据自增对象查询信息
	 * @return HmxCategoryContent 查询的对象
	 */
	HmxCategoryContent info (Integer hmxCategoryContentId);
	
	/**
	 * @Method: getPage 
	 * @Description: 分页查询
	 * @param page 分页参数
	 * @param hmxCategoryContentDto 查询条件
	 * @return PageBean<HmxCategoryContent> 查询到的分页值
	 */
	PageBean<HmxCategoryContent> getPage(PageBean<HmxCategoryContent> page,HmxCategoryContentDto hmxCategoryContentDto);
	
	/**
	 * @Method: list 
	 * @Description: 查询某个条件下的所有数据
	 * @param hmxCategoryContentDto 查询参数
	 * @return List<HmxCategoryContent> 符合条件的list集合
	 */
	List<HmxCategoryContent> list( HmxCategoryContentDto hmxCategoryContentDto );
	
	/**
	 * 内容详情添加
	 * @param hmxCategoryContentDto
	 * @return
	 */
	Map<String,Object> categoryContentAdd(HmxCategoryContentDto hmxCategoryContentDto);
	/**
	 * 内容详情编辑
	 * @param hmxCategoryContentDto
	 * @return
	 */
	Map<String,Object> categoryContentUpdate(HmxCategoryContentDto hmxCategoryContentDto);
	/**
     * 查询内容详情
     * @param categoryContentId
     * @return
     */
	HmxCategoryContent selectCategoryContentById(Integer categoryContentId);
    /**
     * 内容列表查询
     * @return
     */
    PageBean<Map<String,Object>> selectCategoryContentTable(PageBean<Map<String,Object>> page,HmxCategoryContentDto hmxCategoryContentDto);
}