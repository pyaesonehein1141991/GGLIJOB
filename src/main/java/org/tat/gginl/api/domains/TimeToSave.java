package org.tat.gginl.api.domains;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.tat.gginl.api.common.TableName;

@Entity
@Table(name = TableName.RUNTIMETABLE)
@Access(value = AccessType.FIELD)
public class TimeToSave implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer id;

  private Date runtime;


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Access(value = AccessType.PROPERTY)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }



  public void setRuntime(Date runtime) {
    this.runtime = runtime;
  }

  public Date getRuntime() {
    return runtime;
  }



}
