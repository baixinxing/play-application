package com.airlenet.play.main.service;

import com.airlenet.repo.jpa.HierarchicalEntityService;
import com.airlenet.play.main.entity.OrganizationEntity;
import org.springframework.stereotype.Service;

@Service
public class OrganizationEntityService extends HierarchicalEntityService<OrganizationEntity, Long> {

}
