package com.wangsong.system.service;

import java.util.List;

import com.wangsong.common.model.GetEasyUIData;
import com.wangsong.common.model.Result;
import com.wangsong.system.model.Resources;
import com.wangsong.system.model.Role;
import com.wangsong.system.model.RoleAddModel;
import com.wangsong.system.model.RolePage;
import com.wangsong.system.model.RoleResources;
import com.wangsong.system.vo.RoleVO;

public interface RoleService {

    void insertRole(RoleAddModel role);

    void updateRole(RoleAddModel role);

    void deleteRole(String[] id);

    GetEasyUIData findTByPage(RolePage role);

    RoleVO selectByPrimaryKey(String id);

    List<Role> selectAll();

    void deleteByT(RoleResources[] r);

    List<Resources> findResourcesByT(Resources resources);

}
