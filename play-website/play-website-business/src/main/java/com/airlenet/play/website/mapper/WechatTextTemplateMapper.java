package com.airlenet.play.website.mapper;

import com.airlenet.play.website.model.WechatTextTemplate;
import com.airlenet.play.website.model.WechatTextTemplateExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WechatTextTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_text_template
     *
     * @date
     */
    long countByExample(WechatTextTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_text_template
     *
     * @date
     */
    int deleteByExample(WechatTextTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_text_template
     *
     * @date
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_text_template
     *
     * @date
     */
    int insert(WechatTextTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_text_template
     *
     * @date
     */
    int insertSelective(WechatTextTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_text_template
     *
     * @date
     */
    List<WechatTextTemplate> selectByExample(WechatTextTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_text_template
     *
     * @date
     */
    WechatTextTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_text_template
     *
     * @date
     */
    int updateByExampleSelective(@Param("record") WechatTextTemplate record, @Param("example") WechatTextTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_text_template
     *
     * @date
     */
    int updateByExample(@Param("record") WechatTextTemplate record, @Param("example") WechatTextTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_text_template
     *
     * @date
     */
    int updateByPrimaryKeySelective(WechatTextTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_text_template
     *
     * @date
     */
    int updateByPrimaryKey(WechatTextTemplate record);
}