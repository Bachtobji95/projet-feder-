
public class security {
	
	
	
public static boolean check(String addresse , patient[] tab) {
		boolean flag = true;
		for(int i=0;i<tab.length;i++) {
			if(tab[i].email.equals(addresse)) {
				flag = false;
				break;
			}
			
			
		}
		return flag;
		
		
	}



public static boolean check_mail(String mail) {
	boolean a = false;
	for (int i = 0; i<mail.length();i++) {
		if(mail.charAt(i)== '@') {
			a= true;
			break;
			
		}
			}
	return a;
	
	
}



public static boolean confirmpwd(String pwd, String pwd2) {
	boolean flag = false;
	
		if(pwd.equals(pwd2)) 
		{
			flag = true;
		}
	return flag;
}
	
	
public static void  changepwd(String pwd, String newpwd, docteur d) {

	if(confirmpwd(pwd, d.password )) {
		pwd = newpwd;
		
	}
	else {System.out.println("confirmez votre mdp");}
		
		
}
	
	
	


}


