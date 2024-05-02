package days3;


		public class Employ implements Comparable<Employ>
		{
			private Integer employId;
			private String employName;
			private int empsal;
			public int getEmpId() {
				return employId;
			}
			public void setEmployId(int empId) {
				this.employId = empId;
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
				return "Employee [empId=" + employId + ", employName=" + employName + ", empsal=" +empsal + "]";
			}
			public Employ(int empId, String empName, int sal) {
				super();
				this.employId = empId;
				this.employName = empName;
				this.empsal = sal;
			}
			public Employ() {
				super();
			}
			
			public int compareTo(Employ o) {
				return this.employId.compareTo(o.employId);
				
			}
			
		

	}


