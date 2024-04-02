package hr.emp;

import java.util.List;

public interface IEmpDao {

	// 기능 - CRUD
	// 사원 정보 입력 수정 삭제 조회 전체 조회
	// 기능 구현을 위한 메서드 정의
	void insertEmp(EmpVo emp);
	void updataEmpSalary(EmpVo emp);
//	void updataEmpSalary(int employeeId, double salary);
	void delateEmp(int employeeId, String email);
	EmpVo selectEmp(int employeesId);
	List<EmpVo> selectAllEmps();
}
