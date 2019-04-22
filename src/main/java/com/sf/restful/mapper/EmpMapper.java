package com.sf.restful.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sf.restful.bean.Employee;


@Mapper
public interface EmpMapper {
	@Select(value="select * from tbl_employee")
	List<Employee> selectAllEmps();
	
	@Select(value="select * from tbl_employee where id =#{id}")
	Employee selectEmpById(Integer id);
	
	@Update(value="update tbl_employee set last_name=#{lastName},email=#{email},gender=#{gender},d_id=#{dId} where id=#{id}")
	Integer updatEmp(Employee employee);
	
	@Insert(value="insert into tbl_employee (last_name, email,  gender, d_id) values(#{lastName},#{email},#{gender},#{dId})")
	Integer insertEmp(Employee employee);
	
	@Delete(value="delete from tbl_employee where id=#{id}")
	Integer deleteEmpById(Integer id);

}
