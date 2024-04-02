package hr;

import java.util.List;

import hr.emp.EmpDao;
import hr.emp.EmpVo;
import hr.emp.IEmpDao;

public class EmpMain {

	public static void main(String[] args) {
		// UI(CUI) & 제어로직
		IEmpDao dao = new EmpDao();
//		EmpVo emp = new EmpVo(300, "aaaaaa", "sss", "ddddd", "000", null, "IT_PROG",
//								7777, 0, 103, 60);
//	dao.insertEmp(emp);
//	System.out.println("등록 완료");
		
		System.out.println("정보 조회");
		try {
			EmpVo emp = dao.selectEmp(300);
		System.out.println(emp);
	}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
//		모든 정보 조회
//		List<EmpVo> empList = dao.selectAllEmps();
//		for (EmpVo emp: empList) {
//			System.out.println(emp);
//		}
//		
		// 급여 수정
//		EmpVo updateEmp = new EmpVo();
//		updateEmp.setEmployeeId(300);
//		updateEmp.setSalary(138237);
//		dao.updataEmpSalary(updateEmp);
//		
//		try {
//			EmpVo emp = dao.selectEmp(300);
//		System.out.println(emp);
//	}catch(RuntimeException e) {
//			System.out.println(e.getMessage());
//	}
		
		dao.delateEmp(100, "SKING");
		try {
			EmpVo emp = dao.selectEmp(300);
		System.out.println(emp);
	}catch(RuntimeException e) {
			System.out.println(e.getMessage());
	}
		
	}

}
 