package Java;

import java.time.LocalDateTime;

public class JavaStudy extends StudyClub implements  Person{

    LocalDateTime date;
    String personName;
    int memberCnt;

    @Override
    public boolean isAdult(int age) {
        return age >= Person.LIMIT_AGE; //제한연령
    }

    @Override
    public void setMemberCnt(int memberCnt) {
        this.memberCnt = ++memberCnt;
    }

    public void join(String personName, int age, int memberCnt) {
        this.date = LocalDateTime.now();
        this.personName = personName;
        setMemberCnt(memberCnt);
        if(!isAdult(age))
            throw new IllegalArgumentException("성인만 스터디 신청이 가능합니다.");
    }




    @Override
    public void printTitle() {
        System.out.println("JavaStudy");
    }
}
