package com.airlenet.play.website.mapper;

import com.airlenet.play.website.model.BusinessMemberExample;
import com.airlenet.play.website.model.BusinessMember;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BusinessMemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member
     *
     * @date
     */
    long countByExample(BusinessMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member
     *
     * @date
     */
    int deleteByExample(BusinessMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member
     *
     * @date
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member
     *
     * @date
     */
    int insert(BusinessMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member
     *
     * @date
     */
    int insertSelective(BusinessMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member
     *
     * @date
     */
    List<BusinessMember> selectByExample(BusinessMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member
     *
     * @date
     */
    BusinessMember selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member
     *
     * @date
     */
    int updateByExampleSelective(@Param("record") BusinessMember record, @Param("example") BusinessMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member
     *
     * @date
     */
    int updateByExample(@Param("record") BusinessMember record, @Param("example") BusinessMemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member
     *
     * @date
     */
    int updateByPrimaryKeySelective(BusinessMember record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table business_member
     *
     * @date
     */
    int updateByPrimaryKey(BusinessMember record);
}