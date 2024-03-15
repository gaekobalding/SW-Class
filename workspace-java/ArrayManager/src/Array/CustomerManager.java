package Array;
import java.util.Scanner;


public class CustomerManager {
	
static final int MAX = 100;
	
	static String[] nameList = new String[MAX];
	static char[] genderList = new char[MAX];
	static String[] emailList = new String[MAX];
	static int[] birthYearList = new int[MAX];
	
	static int count = 0;
	static int index = -1;
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(true) {
			System.out.printf("\n고객의 수: %d, 인덱스: %d\n", count, index);
			System.out.println("메뉴를 입력하세요.");
			System.out.println("(I)nsert, (P)revious, (N)ext, (C)urrent, (U)pdate,"
					+ " (D)elete, (Q)uit");
			System.out.print("메뉴 입력:");
			String menu = sc.next();
			menu = menu.toLowerCase();
			switch(menu.charAt(0)) {
			case 'i':
				System.out.println("고객 정보 입력을 시작합니다");
				if(count >= MAX) {
					System.out.println("더 이상 입력할 수 없습니다.");
				}else {
					insertCustomer();
					System.out.println("고객 정보를 입력했습니다.");
				}
				break;
			case 'p':
				System.out.println("이전 데이터를 출력합니다.");
				if(index <= 0) {
					System.out.println("이전 데이터가 없습니다.");
				}else {
					index--;
					printCustomer();
				}
				break;
			case 'n':
				System.out.println("다음 데이터를 출력합니다.");
				if(index >= count-1) {
					System.out.println("다음 데이터가 없습니다.");
				}else {
					index++;
					printCustomer();
				}
				break;
			case 'c':
				System.out.println("현재 데이터를 출력합니다.");
				if( (index>=0) && (index<count) ) {
					printCustomer();
				}else {
					System.out.println("데이터가 선택되지 않았습니다.");
				}
				break;
			case 'u':
				System.out.println("데이터를 수정합니다.");
				if( (index>=0) && (index<count) ) {
					System.out.println(index + "위치 데이터를 수정합니다.");
					updateCustomer();
				}else {
					System.out.println("데이터가 선택되지 않았습니다.");
				}
				break;
			case 'd':
				System.out.println("데이터를 삭제합니다.");
				if( (index>=0) && (index<count) ) {
					System.out.println(index + "위치 데이터를 삭제합니다.");
					deleteCustomer();
				}else {
					System.out.println("데이터가 선택되지 않았습니다.");
				}
				break;
			case 'q':
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
			default:
				System.out.println("메뉴를 잘 못 입력했습니다.");
			}
		}

	}//end main
	private static void insertCustomer() {
		System.out.print("이름:");
		String name = sc.next();
		System.out.print("성별(M/F):");
		char gender = sc.next().charAt(0);
		System.out.print("이메일:");
		String email = sc.next();
		System.out.print("출생 연도:");
		int birthYear = sc.nextInt();
		
		nameList[count] = name;
		genderList[count] = gender;
		emailList[count] = email;
		birthYearList[count] = birthYear;
		count++;
	}
	
	private static void printCustomer() {
		System.out.println("============CUSTOMER INFO==============");
		System.out.println("이름: " + nameList[index]);
		System.out.println("성별: " + genderList[index]);
		System.out.println("이메일: " + emailList[index]);
		System.out.println("출생 연도: " + birthYearList[index]);
	}
	
	private static void updateCustomer() {
		System.out.println("-------------UPDATE CUSTOMER INFO-------------");
		System.out.print("이름(" + nameList[index] + "): ");
		nameList[index] = sc.next();
		System.out.print("성별(" + genderList[index] + "): ");
		genderList[index] = sc.next().charAt(0);
		System.out.print("이메일(" + emailList[index] + "): ");
		emailList[index] = sc.next();
		System.out.print("출생 연도(" + birthYearList[index] + "): ");
		birthYearList[index] = sc.nextInt();
	}
	
	private static void deleteCustomer() {
		for(int i=index; i<count-1; i++) {
			nameList[i] = nameList[i+1];
			genderList[i] = genderList[i+1];
			emailList[i] = emailList[i+1];
			birthYearList[i] = birthYearList[i+1];
		}
		count--;
	}

}


