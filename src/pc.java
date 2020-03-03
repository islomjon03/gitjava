import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class pc {


 public static void main(String[] args) {

  rabotnik Javohir = new rabotnik();
  Javohir.name = "Javohir";
  Javohir.age = 25;
  Javohir.job = "doctor";
  Javohir.salaryFor30days = 2000;
  Javohir.workedDays = 2000 / 30 * 18;
  System.out.println("name - " + Javohir.name);
  System.out.println("age - " + Javohir.age);
  System.out.println("job - " + Javohir.job);
  System.out.println("salary - " + Javohir.salaryFor30days);
  System.out.println("worked days - " + Javohir.workedDays);

  rabotnik Sardor = new rabotnik();
  Sardor.name = "Sardor";
  Sardor.age = 23;
  Sardor.job = "businessman";
  Sardor.salaryFor30days = 3000;
  Sardor.workedDays = 3000 / 30 * 29;

  System.out.println("name - " + Sardor.name);
  System.out.println("age - " + Sardor.age);
  System.out.println("job - " + Sardor.job);
  System.out.println("salary - " + Sardor.salaryFor30days);
  System.out.println("worked days - " + Sardor.workedDays);

  rabotnik Akbar = new rabotnik();
  Akbar.name = "Akbar";
  Akbar.age = 28;
  Akbar.job = "teacher";
  Akbar.salaryFor30days = 1500;
  Akbar.workedDays = 1500 / 30 * 23;

  System.out.println("name - " + Akbar.name);
  System.out.println("age - " + Akbar.age);
  System.out.println("job - " + Akbar.job);
  System.out.println("salary - " + Akbar.salaryFor30days);
  System.out.println("worked days - " + Akbar.workedDays);

  rabotnik Anvar = new rabotnik();

  Anvar.name = "Anvar";
  Anvar.age = 25;
  Anvar.job = "manager";
  Anvar.salaryFor30days = 2200;
  Anvar.workedDays = 2200 / 30 * 21;

  System.out.println("name - " + Anvar.name);
  System.out.println("age - " + Anvar.age);
  System.out.println("job - " + Anvar.job);
  System.out.println("salary - " + Anvar.salaryFor30days);
  System.out.println("worked days - " + Anvar.workedDays);

  rabotnik Andrey = new rabotnik();

  Andrey.name = "Andrey";
  Andrey.age = 24;
  Andrey.job = "coach";
  Andrey.salaryFor30days = 2500;
  Andrey.workedDays= 2500 / 30 * 27;

  System.out.println("name - " + Andrey.name);
  System.out.println("age - " + Andrey.age);
  System.out.println("job - " + Andrey.job);
  System.out.println("salary - " + Andrey.salaryFor30days);
  System.out.println("worked days - " + Andrey.workedDays);


  rabotnik[] f = {Javohir, Sardor, Akbar, Anvar, Andrey};
  for (int i = 0; i <f.length; i++) {

  }

 }


}










































