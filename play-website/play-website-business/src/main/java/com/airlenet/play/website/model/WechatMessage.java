package com.airlenet.play.website.model;

import java.io.Serializable;
import java.util.Date;

/**
 * database table wechat_message
 *
 * @date do_not_delete_during_merge
 */
public class WechatMessage implements Serializable {
    private Long id;

    private Date create_time;

    private String from_username;

    private String msg_id;

    private String msg_type;

    private Date timestamp;

    private String to_username;

    private Long config_id;

    private Long attention_uid;

    private String detail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wechat_message
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

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getFrom_username() {
        return from_username;
    }

    public void setFrom_username(String from_username) {
        this.from_username = from_username == null ? null : from_username.trim();
    }

    public String getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id == null ? null : msg_id.trim();
    }

    public String getMsg_type() {
        return msg_type;
    }

    public void setMsg_type(String msg_type) {
        this.msg_type = msg_type == null ? null : msg_type.trim();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getTo_username() {
        return to_username;
    }

    public void setTo_username(String to_username) {
        this.to_username = to_username == null ? null : to_username.trim();
    }

    public Long getConfig_id() {
        return config_id;
    }

    public void setConfig_id(Long config_id) {
        this.config_id = config_id;
    }

    public Long getAttention_uid() {
        return attention_uid;
    }

    public void setAttention_uid(Long attention_uid) {
        this.attention_uid = attention_uid;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_message
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
        WechatMessage other = (WechatMessage) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
                && (this.getFrom_username() == null ? other.getFrom_username() == null : this.getFrom_username().equals(other.getFrom_username()))
                && (this.getMsg_id() == null ? other.getMsg_id() == null : this.getMsg_id().equals(other.getMsg_id()))
                && (this.getMsg_type() == null ? other.getMsg_type() == null : this.getMsg_type().equals(other.getMsg_type()))
                && (this.getTimestamp() == null ? other.getTimestamp() == null : this.getTimestamp().equals(other.getTimestamp()))
                && (this.getTo_username() == null ? other.getTo_username() == null : this.getTo_username().equals(other.getTo_username()))
                && (this.getConfig_id() == null ? other.getConfig_id() == null : this.getConfig_id().equals(other.getConfig_id()))
                && (this.getAttention_uid() == null ? other.getAttention_uid() == null : this.getAttention_uid().equals(other.getAttention_uid()))
                && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_message
     *
     * @date
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getFrom_username() == null) ? 0 : getFrom_username().hashCode());
        result = prime * result + ((getMsg_id() == null) ? 0 : getMsg_id().hashCode());
        result = prime * result + ((getMsg_type() == null) ? 0 : getMsg_type().hashCode());
        result = prime * result + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        result = prime * result + ((getTo_username() == null) ? 0 : getTo_username().hashCode());
        result = prime * result + ((getConfig_id() == null) ? 0 : getConfig_id().hashCode());
        result = prime * result + ((getAttention_uid() == null) ? 0 : getAttention_uid().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wechat_message
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
        sb.append(", create_time=").append(create_time);
        sb.append(", from_username=").append(from_username);
        sb.append(", msg_id=").append(msg_id);
        sb.append(", msg_type=").append(msg_type);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", to_username=").append(to_username);
        sb.append(", config_id=").append(config_id);
        sb.append(", attention_uid=").append(attention_uid);
        sb.append(", detail=").append(detail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}