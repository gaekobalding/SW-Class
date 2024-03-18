package inheritance.goodcase;

public	class	Teacher	extends	Person{
	protected	String	subject;
	public	String	getDatails()	{
		return	"이름:	"+name+"\t나이:	"+age+"\t과목:	"+subject;
}
}