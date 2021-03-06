package com.airlenet.play.wechat.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.airlenet.play.main.entity.AdminUserEntity;
import com.airlenet.repo.jpa.DataEntity;
import lombok.Getter;
import lombok.Setter;


/**
 * 文本消息
 *
 * @author lig
 */
@Entity
@Table(name = "wechat_text_template")
@Getter
@Setter
public class TextTemplateEntity extends DataEntity<AdminUserEntity, Long> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     * 模板名称
     */
    @Column
    @NotNull
    @Size(min = 1, max = 20)
    private String title;
    /**
     * 模板内容
     *
     * @formtype textarea
     */
    @Column(length = 500)
    @NotNull
    @Size(max = 200)
    private String content;
}
