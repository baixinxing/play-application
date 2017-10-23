package com.airlenet.play.website.model;

import java.io.Serializable;

/**
 * database table sys_user_to_role
 *
 * @date do_not_delete_during_merge
 */
public class SysUserToRoleKey implements Serializable {
    private Long users_id;

    private Long roles_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user_to_role
     *
     * @date
     */
    private static final long serialVersionUID = 1L;

    public Long getUsers_id() {
        return users_id;
    }

    public void setUsers_id(Long users_id) {
        this.users_id = users_id;
    }

    public Long getRoles_id() {
        return roles_id;
    }

    public void setRoles_id(Long roles_id) {
        this.roles_id = roles_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_to_role
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
        SysUserToRoleKey other = (SysUserToRoleKey) that;
        return (this.getUsers_id() == null ? other.getUsers_id() == null : this.getUsers_id().equals(other.getUsers_id()))
                && (this.getRoles_id() == null ? other.getRoles_id() == null : this.getRoles_id().equals(other.getRoles_id()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_to_role
     *
     * @date
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUsers_id() == null) ? 0 : getUsers_id().hashCode());
        result = prime * result + ((getRoles_id() == null) ? 0 : getRoles_id().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_to_role
     *
     * @date
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", users_id=").append(users_id);
        sb.append(", roles_id=").append(roles_id);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}