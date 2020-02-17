package org.tat.gginl.api.domains.services;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tat.gginl.api.domains.TimeToSave;
import org.tat.gginl.api.domains.repository.RunTimeRepository;

@Service
public class RunTimeService {

  @Autowired
  RunTimeRepository runTimeRepository;

  @Transactional
  public TimeToSave findbyId(int id) {
    return runTimeRepository.getOne(id);
  }

  @Transactional
  public void updateTime(TimeToSave runtime) {
    runTimeRepository.saveAndFlush(runtime);
  }

  public Date findRuntime() {
    return runTimeRepository.findRuntime();
  }

}
