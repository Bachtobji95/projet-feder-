
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



public static boolean confirmpwd(String pwd , String oldpwd) {
	boolean flag = false;
	for(int i=0; i<pwd.length();i++) {
		if(pwd.equals(oldpwd)) {
			flag = true;
			break;
			
		}
			
		
	}
	return flag;
}
	
	

}
