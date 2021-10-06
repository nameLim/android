package Java;

public class JavaStudy extends StudyClub{

    @Override
    public void printTitle() {
        System.out.println("JavaStudy");
    }




    public JavaStudy() {
        super();

        System.out.println("**부모클래스");
    }












    public void present() {
        open = false;
    }

    private String present( int when, String subject ) {
        if( when == 12 ) {
            title = subject;
            open = true;
            return subject;
        }
        return "";
    }
}
