package com.airlenet.play.website.model;

import java.io.Serializable;
import java.util.Date;

/**
 * database table cms_ad_position
 *
 * @date do_not_delete_during_merge
 */
public class CmsAdPosition implements Serializable {
    private Long id;

    private Date createdDate;

    private Date lastModifiedDate;

    private String code;

    private String description;

    private Integer height;

    private String name;

    private Integer width;

    private Long createdBy_id;

    private Long lastModifiedBy_id;

    private String template;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cms_ad_position
     *
     * @date
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Long getCreatedBy_id() {
        return createdBy_id;
    }

    public void setCreatedBy_id(Long createdBy_id) {
        this.createdBy_id = createdBy_id;
    }

    public Long getLastModifiedBy_id() {
        return lastModifiedBy_id;
    }

    public void setLastModifiedBy_id(Long lastModifiedBy_id) {
        this.lastModifiedBy_id = lastModifiedBy_id;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_ad_position
     *
     * @date
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CmsAdPosition other = (CmsAdPosition) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCreatedDate() == null ? other.getCreatedDate() == null : this.getCreatedDate().equals(other.getCreatedDate()))
                && (this.getLastModifiedDate() == null ? other.getLastModifiedDate() == null : this.getLastModifiedDate().equals(other.getLastModifiedDate()))
                && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
                && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
                && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
                && (this.getCreatedBy_id() == null ? other.getCreatedBy_id() == null : this.getCreatedBy_id().equals(other.getCreatedBy_id()))
                && (this.getLastModifiedBy_id() == null ? other.getLastModifiedBy_id() == null : this.getLastModifiedBy_id().equals(other.getLastModifiedBy_id()))
                && (this.getTemplate() == null ? other.getTemplate() == null : this.getTemplate().equals(other.getTemplate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_ad_position
     *
     * @date
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        result = prime * result + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getCreatedBy_id() == null) ? 0 : getCreatedBy_id().hashCode());
        result = prime * result + ((getLastModifiedBy_id() == null) ? 0 : getLastModifiedBy_id().hashCode());
        result = prime * result + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_ad_position
     *
     * @date
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", lastModifiedDate=").append(lastModifiedDate);
        sb.append(", code=").append(code);
        sb.append(", description=").append(description);
        sb.append(", height=").append(height);
        sb.append(", name=").append(name);
        sb.append(", width=").append(width);
        sb.append(", createdBy_id=").append(createdBy_id);
        sb.append(", lastModifiedBy_id=").append(lastModifiedBy_id);
        sb.append(", template=").append(template);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}