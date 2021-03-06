package com.airlenet.play.main.security;

import com.airlenet.core.SpringContext;
import com.airlenet.play.main.entity.AdminUserEntity;
import com.airlenet.security.CustomUserDetails;
import com.airlenet.play.main.repo.AdminUserEntityRepository;

public class AdminUserDetails extends CustomUserDetails<Long, AdminUserEntity> {
    private static final long serialVersionUID = 8220061317304759492L;

    public AdminUserDetails(Long id, String username, String nickname, String password,
                            String credentialsSalt, boolean enabled,
                            boolean accountNonExpired, boolean credentialsNonExpired,
                            boolean accountNonLocked) {
        super(id, Type.Admin, username, nickname, password, credentialsSalt, enabled,
                accountNonExpired, credentialsNonExpired, accountNonLocked);
    }


    @Override
    public AdminUserEntity getCustomUser() {
        AdminUserEntityRepository userEntityRepository = SpringContext.getBean(AdminUserEntityRepository.class);
        return userEntityRepository.findOne(getId());
    }

    @Override
    public String toString() {
        return "uid="+getId()+";username="+getUsername();
    }
}