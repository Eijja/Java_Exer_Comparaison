import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// tranche de la valeur alea
		
		int valeurMinX=1,valeurMaxX=1000,diviseur;

		// VAL ALEATOIRE X
		Random x = new Random();
		int valeurX = valeurMinX + x.nextInt(valeurMaxX - valeurMinX);
		
		
		System.out.println("le nombre alea est le -----> : "+valeurX);
		System.out.println("          ");
		System.out.println("----------");		
		System.out.println("PARTIE 1 :");
		System.out.println("----------");
		System.out.println("          ");		
		
		if (valeurX%2==0){
			System.out.println("          ");
			System.out.println("Il est divisible par 2");
			System.out.println("Car "+valeurX+" = 2 x "+ valeurX/2);
		}


		
		if (valeurX%3==0){
			System.out.println("          ");
			System.out.println("Il est divisible par 3");
			System.out.println("Car "+valeurX+" = 3 x "+ valeurX/3);
		}		

		
		
		if (valeurX%5==0){
			System.out.println("          ");
			System.out.println("Il est divisible par 5");
			System.out.println("Car "+valeurX+" = 5 x "+ valeurX/5);
		}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		System.out.println("          ");		
		System.out.println("----------");			
		System.out.println("PARTIE 2 :");
		System.out.println("----------");
		System.out.println("          ");
		
		
		
		if (valeurX%2==0 & valeurX%5==0){
			System.out.println("          ");
			System.out.println("Il est divisible par 2 ET 5");
			System.out.println("Car "+valeurX+" = 2 x "+ valeurX/2);
			System.out.println("Car "+valeurX+" = 5 x "+ valeurX/5);			
		}
		

		if (valeurX%2==0 & valeurX%3==0){
			System.out.println("          ");
			System.out.println("Il est divisible par 2 ET 3");
			System.out.println("Car "+valeurX+" = 2 x "+ valeurX/2);
			System.out.println("Car "+valeurX+" = 3 x "+ valeurX/3);			
		}
		
		if (valeurX%3==0 & valeurX%5==0){
			System.out.println("          ");
			System.out.println("Il est divisible par 3 ET 5");
			System.out.println("Car "+valeurX+" = 3 x "+ valeurX/3);
			System.out.println("Car "+valeurX+" = 5 x "+ valeurX/5);			
		}		
		
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		System.out.println("          ");		
		System.out.println("----------");			
		System.out.println("PARTIE 3 SWITCH CASE:");
		System.out.println("----------");
		System.out.println("          ");
		
		/// TEST DIVISEUR PAR 2
		
		diviseur = valeurX%2;
		
		switch(diviseur)
			{
		case 0:
			System.out.println("          ");
			System.out.println("Il est divisible par 2");
			System.out.println("Car "+valeurX+" = 2 x "+ valeurX/2);
			break;
					
		default:
			System.out.println("PAS DIVISIBLE PAR 2");
			break;
			}
		
		/// TEST DIVISEUR PAR 3		

		diviseur = valeurX%3;
		switch(diviseur)
		{
	case 0:
		System.out.println("          ");
		System.out.println("Il est divisible par 3");
		System.out.println("Car "+valeurX+" = 3 x "+ valeurX/3);
		break;
				
	default:
		System.out.println("PAS DIVISIBLE PAR 3");
		break;	
		}		
		
		/// TEST DIVISEUR PAR 5		

		diviseur = valeurX%5;
		switch(diviseur)
		{
	case 0:
		System.out.println("          ");
		System.out.println("Il est divisible par 5");
		System.out.println("Car "+valeurX+" = 5 x "+ valeurX/5);
		break;
				
	default:
		System.out.println("PAS DIVISIBLE PAR 5");
		break;		
		}	
	

		
		
	}

				}




/*
 * \\ Module principal
DÉBUT
nbre= 15


ECRIRE "Le nombre random est le nombre ---> :",nbre

SI nbre%2=0 ALORS
    ECRIRE"Il est divisible par 2"

SINON SI nbre%5=0 ALORS
    ECRIRE"Il est divisible par 5"

SINON SI nbre%3=0 ALORS
    ECRIRE"Il est divisible par 3"
FINSI


\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


SI nbre%2=0 ET nbre%5=0 ALORS
    ECRIRE"Il est divisible par 2 ET 5"
    ECRIRE"Car",nbre,"=",2,"X",nbre/2
    ECRIRE"Car",nbre,"=",5,"X",nbre/5
FINSI

SI nbre%2=0 ET nbre%3=0 ALORS
    ECRIRE"Il est divisible par 2 ET 3"
    ECRIRE"Car",nbre,"=",2,"X",nbre/2
    ECRIRE"Car",nbre,"=",5,"X",nbre/5
FINSI


SI nbre%3=0 ET nbre%5=0 ALORS
    ECRIRE"Il est divisible par 3 ET 5"
        ECRIRE"Car",nbre,"=",3,"X",nbre/3
    ECRIRE"Car",nbre,"=",5,"X",nbre/5
FINSI

\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\


ECRIRE"                      " 
ECRIRE"----------------------"
ECRIRE"                      "  
ECRIRE"SWITCH CASE : " 
ECRIRE "Le nombre random est le nombre ---> :",nbre
\\ SWITCH(a)



FIN
 
 * 
 */