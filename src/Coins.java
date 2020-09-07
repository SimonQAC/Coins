
public class Coins {
	public void changeGetter(float paid, double d) {
		if (paid<d) {
			System.out.println("Not paid enough");
		}
		float dif=(float) (paid-d);
		System.out.println("balance due: £"+dif);
		int £50=0,£20=0,£10=0,£5=0,£2=0,£1=0,fiftyp=0,twentyp=0,tenp=0,fivep=0,twop=0,onep=0;
		
		if(dif>=50) {£50=(int) (dif/50);
		dif=dif-(£50*50);
		}
		if(dif>=20) {£20=(int) (dif/20);
		dif=dif-(£20*20);
		}
		if(dif>=10) {£10=(int) (dif/10);
		dif=dif-(£10*10);
		}
		if(dif>=5) {£5=(int) (dif/5);
		dif=dif-(£5*5);
		}
		if(dif>=2) {£2=(int) (dif/2);
		dif=dif-(£2*2);
		}
		if(dif>=1) {£1=(int) (dif/1);
		dif=dif-(£1*1);
		}
		if(dif>=0.5) {fiftyp=(int) (dif/0.5);
		dif=(float) (dif-(fiftyp*0.5));
		}
		if(dif>=0.2) {twentyp=(int) (dif/0.2);
		dif=(float) (dif-(twentyp*0.2));
		}
		if(dif>=0.1) {tenp=(int) (dif/0.1);
		dif=(float) (dif-(tenp*0.1));
		}
		if(dif>=0.05) {fivep=(int) (dif/0.05);
		dif=(float) (dif-(fivep*0.05));
		}
		if(dif>=0.02) {twop=(int) (dif/0.02);
		dif=(float) (dif-(twop*0.02));
		}
		if(dif>=0.01) {onep=(int) (dif/0.01);
		dif=(float) (dif-(onep*0.01));
		}
		System.out.println("Change required");
		if (£50 !=0) System.out.println("£50: "+£50);
		if (£20 !=0) System.out.println("£20: "+£20);
		if (£10 !=0) System.out.println("£10: "+£10);
		if (£5 !=0) System.out.println("£5: "+£5);
		if (£2 !=0) System.out.println("£2: "+£2);
		if (£1 !=0) System.out.println("£1: "+£1);
		if (fiftyp !=0) System.out.println("50p: "+fiftyp);
		if (twentyp !=0) System.out.println("20p: "+twentyp);
		if (tenp !=0) System.out.println("10p: "+tenp);
		if (fivep !=0) System.out.println("5p: "+fivep);
		if (twop !=0) System.out.println("2p: "+twop);
		if (onep !=0) System.out.println("1p: "+onep);
	}
}
