package com.airlenet.play.website.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.airlenet.repo.jpa.DataEntity;
import lombok.Getter;
import lombok.Setter;

import com.airlenet.play.main.entity.AdminUserEntity;

/**
 * 网站配置
 *
 * @author lig
 */
@Entity
@Table(name = "website_config")
@Getter
@Setter
public class WebsiteConfigEntity extends DataEntity<AdminUserEntity, Long> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 页面标题
     */
    @Column(length = 200)
    private String seoTitle;

    /**
     * 页面关键词
     */
    @Column(length = 200)
    private String seoKeywords;

    /**
     * 页面描述
     */
    @Column(length = 200)
    private String seoDescription;

}
