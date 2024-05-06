package days4;


		public class Employe
		{
			private Integer employeId;
			private String employName;
			private int empsal;
			
			public int getEmpId() {
				return employeId;
			}
			public void setEmployId(int empId) {
				this.employeId = empId;
			}
			public String getEmployName() {
				return employName;
			}
			public void setEmployName(String empName) {
				this.employName = empName;
			}
			public int getSal() {
				return empsal;
			}
			public void setSal(Double sal) {
				this.empsal = empsal;
			}
			@Override
			public String toString() {
				return "Employe [empId=" + employeId + ", employName=" + employName + ", empsal=" +empsal + "]";
			}
			public Employe(int empId, String empName, int sal) {
				super();
				this.employeId = empId;
				this.employName = empName;
				this.empsal = sal;
			}
			public Employe() {
				super();
			}
			


	}


