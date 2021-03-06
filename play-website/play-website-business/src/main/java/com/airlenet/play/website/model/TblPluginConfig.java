package com.airlenet.play.website.model;

import java.io.Serializable;

/**
 * database table tbl_plugin_config
 *
 * @date do_not_delete_during_merge
 */
public class TblPluginConfig implements Serializable {
    private Long id;

    private Boolean disabled;

    private String pluginId;

    private Integer sortNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_plugin_config
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

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId == null ? null : pluginId.trim();
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_plugin_config
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
        TblPluginConfig other = (TblPluginConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getDisabled() == null ? other.getDisabled() == null : this.getDisabled().equals(other.getDisabled()))
                && (this.getPluginId() == null ? other.getPluginId() == null : this.getPluginId().equals(other.getPluginId()))
                && (this.getSortNo() == null ? other.getSortNo() == null : this.getSortNo().equals(other.getSortNo()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_plugin_config
     *
     * @date
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDisabled() == null) ? 0 : getDisabled().hashCode());
        result = prime * result + ((getPluginId() == null) ? 0 : getPluginId().hashCode());
        result = prime * result + ((getSortNo() == null) ? 0 : getSortNo().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_plugin_config
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
        sb.append(", disabled=").append(disabled);
        sb.append(", pluginId=").append(pluginId);
        sb.append(", sortNo=").append(sortNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}