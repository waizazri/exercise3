package programming2;
public class cgpa {
    double cgpa1 = 3.5;
    double gpa[]= {3.62,3.4,3.5,3.9};
    double sum=0;
    double finalcgpa =0;
public void printCGPA() {
	System.out.println("CGPA from method is"+ cgpa1);
}
public void printGPA() {

	System.out.println("Sem 1: " + gpa[0]+" Sem 2: " + gpa[1]+" Sem 3: " + gpa[2]+" Sem 4: " + gpa[3]);
	for(int i=0; i<gpa.length; i++) {
	System.out.println("Sem "+ (i+1) +" "+ gpa[i]);
	}
	
}
public double calculateCGPA() {
	for(int i=0; i<gpa.length; i++) {
		sum+=gpa[i];
	}
	 finalcgpa = sum/gpa.length;
	 return finalcgpa;
}
}
