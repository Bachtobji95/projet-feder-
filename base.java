import java.util.Scanner;

public class Base {
	patient[] base = new patient[5]; // base de données des patients
	 docteur[] base2 = new docteur[5]; // base de données des docteurs
	 int i = 0;
	

void saisiepatient(String nom, String prenom, String date, String num_tel, String password, String email) {
	
	patient p = new patient(nom,prenom, date, num_tel, password, email);
	if(security.check_mail(p.email)) 
	{
			if(security.confirmpwd(password, email)) 
			{
				base[i] = p;
				i++;
			
			}
			else {System.out.println("confimez votre mdp");
			}
	}
		
	   
	else {System.out.println("verfiez votre email");}
	
}
	
	
	
	
	/*----------------------------------------------------------------------------------*/
void saisiemed(String nom, String prenom, String date, String num_tel, String password, String email) {
	
	docteur d = new docteur(nom,prenom, date, num_tel, password, email);
	if(security.check_mail(d.email)) 
	{
			if(security.confirmpwd(password, email)) 
			{
				base2[i] = d;
				i++;
			
			}
			else {System.out.println("confimez votre mdp");
			}
	}
		
	   
	else {System.out.println("verfiez votre email");
	}
	}
	
	
	
	
	
/*----------------------------------------------------------------------------------*/
	
	

	/*-------------------------------------------------------------------------------------*/
	
	boolean loginmed(String addresse, String pwd) 
	{
		boolean logged = false;
	 
		
			for(int i=0;i<base2.length;i++)
		{
				if(base2[i].email.equals(addresse) ) 
				{
					for(int j =0; j<base2.length ;j++) 
					{
						if(base2[j].password.equals(pwd))
						{
							logged = true;
							break;
						}
						else
						{ 
							break;
						}
					
					}
			}
				else {break;}
					
		
		
		} 
			return logged;
	}
	
	/*----------------------------------------------------------------------------------*/
	
	
	boolean loginpatient(String addresse, String pwd) 
	{
		boolean logged = false;
	 
		
			for(int i=0;i<base.length;i++)
		{
				if(base[i].email.equals(addresse) ) 
				{
					for(int j =0; j<base2.length ;j++) 
					{
						if(base[j].password.equals(pwd))
						{
							logged = true;
							break;
						}
						else
						{ 
							break;
						}
					
					}
			}
				else {break;}
					
		
		
		} 
			return logged;
	}
	
	
	
	
	
	
	

}
