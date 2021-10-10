package com.sagarsoft.setrifugov1.Dao;

import com.sagarsoft.setrifugov1.model.ExitProcedureModel;
import com.sagarsoft.setrifugov1.model.usermodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ExitProceduresdao extends JpaRepository<ExitProcedureModel, Integer> {
    ExitProcedureModel findById(int id);
}
