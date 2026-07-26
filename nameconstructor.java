class student{
String name;
int age;
student(String studentname,int studentage){
name= studentname;
age= studentage;
}
public static void main(String[] args) {
student s1=new student("Happy",23 );
student s2=new student("Happy",23 );
student s3=new student("Happy",23 );
student s4=new student("Happy",23 );
student s5=new student("Happy",23 );
student s6=new student("Happy",23 );
student s7=new student("Happy",23 );

System.out.println(s1.name+ " "+s1.age );
System.out.println(s2.name+ " "+s2.age );
System.out.println(s3.name+ " "+s3.age );
System.out.println(s4.name+ " "+s4.age );
System.out.println(s5.name+ " "+s5.age );
System.out.println(s6.name+ " "+s6.age );
System.out.println(s7.name+ " "+s7.age );

}
}
