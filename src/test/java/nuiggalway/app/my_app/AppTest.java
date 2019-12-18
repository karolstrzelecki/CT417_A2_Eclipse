package nuiggalway.app.my_app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {





    @Test
    void userNameCheck() {
        Student student = new Student("John","Doe",1995, 5, 5);

        String var = student.getUserName();
        assertEquals("JohnDoe24",var);
    }
}
