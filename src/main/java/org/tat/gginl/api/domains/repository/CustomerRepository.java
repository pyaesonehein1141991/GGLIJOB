package org.tat.gginl.api.domains.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.tat.gginl.api.domains.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
	
	//List<Customer> findByRecorderCreatedDateBetweenOrRecorderUpdatedDateBetween(Date createdDate,Date updatedDate,Date createdDate1,Date updatedDate1);
	
	String query= "SELECT Rtrim(ID) as ID,Rtrim(INITIALID) as INITIALID,Rtrim(FIRSTNAME) as FIRSTNAME,Rtrim(MIDDLENAME) as MIDDLENAME,Rtrim(LASTNAME) as LASTNAME,Rtrim(FATHERNAME) as FATHERNAME,Rtrim(IDNO) as IDNO,Rtrim(IDTYPE) as IDTYPE,Rtrim(LABOURNO) as LABOURNO,Rtrim(DATEOFBIRTH) as DATEOFBIRTH,Rtrim(GENDER) as GENDER,Rtrim(BRANCHID) as BRANCHID,Rtrim(NATIONALITYID) as NATIONALITYID,Rtrim(MARITALSTATUS) as MARITALSTATUS,Rtrim(BIRTHMARK) as BIRTHMARK,Rtrim(QUALIFICATIONID) as QUALIFICATIONID,Rtrim(RELIGIONID) as RELIGIONID,Rtrim(RESIDENTADDRESS) as RESIDENTADDRESS,Rtrim(RESIDENTTOWNSHIPID) as RESIDENTTOWNSHIPID,Rtrim(PHONE) as PHONE,Rtrim(FAX) as FAX,Rtrim(EMAIL) as EMAIL,Rtrim(MOBILE) as MOBILE,Rtrim(PERMANENTADDRESS) as PERMANENTADDRESS,Rtrim(PERMANENTTOWNSHIPID) as PERMANENTTOWNSHIPID,Rtrim(OCCUPATIONID) as OCCUPATIONID,Rtrim(INDURSTRYID) as INDURSTRYID,Rtrim(OFFICEADDRESS) as OFFICEADDRESS,Rtrim(OFFICETOWNSHIPID) as OFFICETOWNSHIPID,Rtrim(SALARY) as SALARY,Rtrim(BANKACCOUNTNO) as BANKACCOUNTNO,Rtrim(BANKBRANCHID) as BANKBRANCHID,Rtrim(CLOSEDPOLICY) as CLOSEDPOLICY,Rtrim(ACTIVEPOLICY) as ACTIVEPOLICY,Rtrim(CREATEDUSERID) as CREATEDUSERID,Rtrim(CREATEDDATE) as CREATEDDATE,Rtrim(UPDATEDUSERID) as UPDATEDUSERID,Rtrim(UPDATEDDATE) as UPDATEDDATE,Rtrim(VERSION) as VERSION,Rtrim(ACTIVEDDATE) as ACTIVEDDATE,Rtrim(PLACEOFBIRTH) as PLACEOFBIRTH,Rtrim(HEIGHT) as HEIGHT,Rtrim(WEIGHT) as WEIGHT,Rtrim(FULLIDNO) as FULLIDNO,Rtrim(STATECODEID) as STATECODEID,Rtrim(TOWNSHIPCODEID) as TOWNSHIPCODEID,Rtrim(IDCONDITIONTYPE) as IDCONDITIONTYPE,Rtrim(PASSPORTTYPE) as PASSPORTTYPE,Rtrim(MAPKEY) as MAPKEY,Rtrim(REFERENCEMOBILEUSERID) as REFERENCEMOBILEUSERID " + 
			",Rtrim(SALEPOINTID) as SALEPOINTID FROM CUSTOMER WHERE CREATEDDATE BETWEEN ?1 AND ?2 OR UPDATEDDATE BETWEEN ?3 AND ?4";
	@Query(value = query,nativeQuery = true)
	List<Object[]> findAllNativeObject(@Param("date1") Date createdDate,@Param("date2")Date updatedDate,@Param("date3")Date createddate1,@Param("date4")Date updatedDate1);
	
	@Query(value = "SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = 'CUSTOMER'",nativeQuery = true)
	List<Object> findAllColumnName();

	

}
