package com.sagarsoft.setrifugov1.Dao;

import com.sagarsoft.setrifugov1.model.ProjectModel;
import com.sagarsoft.setrifugov1.model.SkillsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface Skillsdao extends JpaRepository<SkillsModel, Integer> {

}
