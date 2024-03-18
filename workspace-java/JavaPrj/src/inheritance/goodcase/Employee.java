package inheritance.goodcase;

public	class	Employee	extends	Person{
	protected	String	department;
    public	String	getDatails()	{
    	return	"이름:	"	+	name	+	"\t나이:	"	+	age	+	"\t부서:	"	+	department;
    	
    }
}