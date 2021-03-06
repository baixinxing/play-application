package com.airlenet.play.website.mapper;

import com.airlenet.play.website.model.WechatMemberCard;
import com.airlenet.play.website.model.WechatMemberCardExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WechatMemberCardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_member_card
     *
     * @date
     */
    long countByExample(WechatMemberCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_member_card
     *
     * @date
     */
    int deleteByExample(WechatMemberCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_member_card
     *
     * @date
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_member_card
     *
     * @date
     */
    int insert(WechatMemberCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_member_card
     *
     * @date
     */
    int insertSelective(WechatMemberCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_member_card
     *
     * @date
     */
    List<WechatMemberCard> selectByExample(WechatMemberCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_member_card
     *
     * @date
     */
    WechatMemberCard selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_member_card
     *
     * @date
     */
    int updateByExampleSelective(@Param("record") WechatMemberCard record, @Param("example") WechatMemberCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_member_card
     *
     * @date
     */
    int updateByExample(@Param("record") WechatMemberCard record, @Param("example") WechatMemberCardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_member_card
     *
     * @date
     */
    int updateByPrimaryKeySelective(WechatMemberCard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_member_card
     *
     * @date
     */
    int updateByPrimaryKey(WechatMemberCard record);
}