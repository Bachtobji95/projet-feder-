import java.io.File;

public class Base {
	static patient[] base = new patient[5]; // base de données des patients
	 static docteur[] base2 = new docteur[5]; // base de données des docteurs
	 static int i = 0;
	

public	 void saisiepatient(String nom, String prenom, String date, String num_tel,  String email, File rapport) {
			
		 patient p = new patient(nom,prenom,date,num_tel,email, rapport);
			
			base[i] = p;
			
			i++;
					
					
			
				}
	
	
	
	
	/*----------------------------------------------------------------------------------*/
public static void saisiemed(String nom, String prenom, String date, String num_tel, String password, String email, String password2) {
	
	docteur d = new docteur(nom,prenom, date, num_tel, password, email, password2);
	if(security.check_mail(d.email)) 
	{
			if(security.confirmpwd(password, password2 )) 
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
	
public	boolean loginmed(String addresse, String pwd) 
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
	
	
	
	
	
	
	
	

}
