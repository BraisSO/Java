package com.unit_testproject6.app;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)   
class TestStudentCourse {
    @Mock
    Student stu;  

 @Test
    public void course_certificatetest(){
    Mockito.when(stu.getCoursename()).thenReturn("Java Programming");
    Course course1=new Course(stu);
    assertEquals("Student got certified in: Java Programming", course1.certificate());
}
}
