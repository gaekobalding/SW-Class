package inheritance.goodcase;



	public class Student extends Person{
		protected String studentId;
		public	String	getDatails()	{
			return	"이름:	"	+	name	+	"\t나이:	"	+	age	+	"\t학번:	"	+	studentId;
		}
	}


