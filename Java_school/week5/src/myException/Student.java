package myException;

import java.util.ArrayList;

public class Student {
	//Student 클래스의 멤버 변수
	String studentName; //학생이름
	String studentMajor; //학생전공
	int studentGrade; //학생학년
    int studentID; //학생학번
    ArrayList<Subject> subjectList;

	public Student(String studentName, String studentMajor, int studentGrade, int studentID) {
		this.studentName = studentName;
		this.studentMajor = studentMajor;
		this.studentGrade = studentGrade;
		this.studentID = studentID;
		subjectList = new ArrayList<Subject>(3);
	}
	
	public void showStudentRegistration() {
		for(Subject s : subjectList) {
		System.out.println(studentName+" ,"+s.getSeatNum()+" 학생의 "+s.getSubjectName()+" 과목 수강신청이 성공하였습니다.");
		}
	}
	
	//객체지향프로그래밍 과목 수강신청 메서드 
	public void oopRegistration (String subjectName, String subjectMajor, int studentGrade, int studentID){
		
		//학생이 수강신청한 과목을 subjectList 배열에 하나씩 추가
		Subject subject = new Subject(); //Subject 생성
		subject.setSubjectName(subjectName); //수강신청한 과목이름 추가
		subject.setSubjectGrade(studentGrade); //수강신청한 과목학년 추가	
		subject.setSeatNum(studentID); //수강신청하면 seatNum에 학번 저장	
		subjectList.add(subject); //배열에 저장하기 
		
			
		//수강신청하는 학생이 1학년일 경우 수강신청 거부
			if (studentGrade==1) {
				try {
					lowGrade();
				} catch (RestrictionGrade e) {
					e.printStackTrace();
				}
				subjectList.removeAll(subjectList); //수강대상이 아닐 경우 저장된 배열에서 삭제
				System.out.println("수강신청에 실패하였습니다: 2학년부터 신청가능합니다.");
			}
			
		//수강신청하는 학생이 IT공학전공이 아닌 타 전공일 경우 수강신청 거부
			if (studentMajor!="IT공학전공") {
				try {
					DifferentMajor();
				} catch (RestrictionMajor e) {
					e.printStackTrace();
				}
				subjectList.removeAll(subjectList); //수강대상이 아닐경우 저장된 배열에서 삭제
				System.out.println("수강신청에 실패하였습니다: IT공학전공 학생만 신청가능합니다.");
				}
			}
	
	

	public void lowGrade() throws RestrictionGrade {
		throw new RestrictionGrade();	
	}
	
	
	public void DifferentMajor() throws RestrictionMajor{
		throw new RestrictionMajor();
	}
}
