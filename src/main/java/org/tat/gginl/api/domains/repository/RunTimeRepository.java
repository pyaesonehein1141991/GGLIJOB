package org.tat.gginl.api.domains.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tat.gginl.api.domains.TimeToSave;

@Repository
public interface RunTimeRepository extends JpaRepository<TimeToSave, Integer> {

}
