class Student {
    public int mark;
}

public class Test {

    public static void test(Integer integer) {
        integer += 10;
    }

    static int test(int number) {
        number++;
        return number;
    }

    public static void main(String[] args) {
//        int n = 10;
//
//        n = test(n);
//
//        System.out.println(n);

//        Student st = new Student();
//        st.mark = 6;
//
//        st = test(st);
//        System.out.println(st.mark);
        Integer i = new Integer(10);
        test(i);
        System.out.println(i);

    }


    static Student test(Student student) {
        student = new Student();
        student.mark = 10;
        return student;
    }
}
