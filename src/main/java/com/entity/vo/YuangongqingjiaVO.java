package com.entity.vo;

import com.entity.YuangongqingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 员工请假
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2020-12-28 17:10:33
 */
public class YuangongqingjiaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 请假标题
	 */
	
	private String qingjiabiaoti;
		
	/**
	 * 请假内容
	 */
	
	private String qingjianeirong;
		
	/**
	 * 请假时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qingjiashijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 请假附件
	 */
	
	private String qingjiafujian;
		
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 职位
	 */
	
	private String zhiwei;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：请假标题
	 */
	 
	public void setQingjiabiaoti(String qingjiabiaoti) {
		this.qingjiabiaoti = qingjiabiaoti;
	}
	
	/**
	 * 获取：请假标题
	 */
	public String getQingjiabiaoti() {
		return qingjiabiaoti;
	}
				
	
	/**
	 * 设置：请假内容
	 */
	 
	public void setQingjianeirong(String qingjianeirong) {
		this.qingjianeirong = qingjianeirong;
	}
	
	/**
	 * 获取：请假内容
	 */
	public String getQingjianeirong() {
		return qingjianeirong;
	}
				
	
	/**
	 * 设置：请假时间
	 */
	 
	public void setQingjiashijian(Date qingjiashijian) {
		this.qingjiashijian = qingjiashijian;
	}
	
	/**
	 * 获取：请假时间
	 */
	public Date getQingjiashijian() {
		return qingjiashijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：请假附件
	 */
	 
	public void setQingjiafujian(String qingjiafujian) {
		this.qingjiafujian = qingjiafujian;
	}
	
	/**
	 * 获取：请假附件
	 */
	public String getQingjiafujian() {
		return qingjiafujian;
	}
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：职位
	 */
	 
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}