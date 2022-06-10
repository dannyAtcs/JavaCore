package InterfaceDemo;

public class Main {
	public static void main(String[] args) {
		
	   
		Engineering ob1 = new ComputerScienceEng();
		Engineering ob2 = new InformationTechnologyEng();
		Engineering ob3 = new CivilEng();
		Engineering ob4 = new MechanicalEng();

		ob1.subjects();
		ob2.subjects();
		ob3.subjects();
		ob4.subjects();
		
		ob1.ExtraCurriculumActivites();
		ob2.ExtraCurriculumActivites();
		ob3.ExtraCurriculumActivites();
		ob4.ExtraCurriculumActivites();
		
		ob1.Projects();
		ob1.grades();
}
}
