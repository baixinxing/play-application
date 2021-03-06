package com.airlenet.play.cms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.airlenet.core.PlayPatterns;
import com.airlenet.repo.jpa.BaseEntity;
import com.airlenet.repo.jpa.DataEntity;

@Entity
@Table(name = "cms_subscribe")
public class SubscribeEntity extends BaseEntity<Long> {

    private static final long serialVersionUID = -7255944286611782276L;

    @NotNull
    @Size(max = 100)
    @Column(length = 100)
    private String name;

    @NotNull
    @Pattern(regexp = PlayPatterns.REGEX_MAIL)
    @Column(length = 100)
    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    private Date createdDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
