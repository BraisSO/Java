package com.unit_testproject6.app;
class Course { 
 public Student stu;
 public Course(Student stu) {
     this.stu = stu;
 }
 public String certificate() {
     return "Student got certified in: " + stu.getCoursename();
 }
}
