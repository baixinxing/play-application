package com.airlenet.play.main.service;

import com.airlenet.play.main.entity.AdminUserEntity;
import com.airlenet.play.main.entity.RoleEntity;
import com.airlenet.play.main.repo.RoleEntityRepository;
import com.airlenet.repo.jpa.EntityService;
import com.airlenet.play.main.entity.QAdminUserEntity;
import com.airlenet.play.main.repo.AdminUserEntityRepository;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
public class RoleEntityService extends EntityService<RoleEntity, Long> {

    @Autowired
    private RoleEntityRepository roleEntityRepository;

    @Autowired
    EntityManager entityManager;
    @Autowired
    private AdminUserEntityRepository userEntityRepository;

    @Transactional(readOnly = true,value = "transactionManager")
    public Page<AdminUserEntity> findUserPageByRoleId(Predicate predicate, Long roleId, Pageable pageable) {
        return userEntityRepository.findAll(
                QAdminUserEntity.adminUserEntity.roles.any().id.eq(roleId).and(predicate), pageable);
    }

    @Transactional(readOnly = true,value = "transactionManager")
    public Page<AdminUserEntity> findUnExistUserPageByRoleId(Long roleId,
                                                             Predicate predicate, Pageable pageable) {
        Page<AdminUserEntity> result = userEntityRepository.findAll(
                QAdminUserEntity.adminUserEntity.roles.any().id.eq(roleId).not().and(predicate), pageable);
        return result;
    }

    // public void deleteAuthoritiesByRoleIdAndMenuId(Long roleid,Long menuId){
    // // roleEntityRepository.deleteByEgId(roleid, menuId);
    // JPAQueryFactory jpaQueryFactory = new JPAQueryFactory(entityManager);
    // new PathBuilderFactory().create(RoleEntity.class);
    // jpaQueryFactory.delete(QRoleEntity.roleEntity.authorities.any()).where(QRoleEntity.roleEntity.id.eq(20L)).execute();
    // }
}
