public class StarPatternEx extends Thread{
	public void run()
	{
		try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
		for(int i=0;i<6;i++)//HHH
		{
			for(int j=0;j<5;j++)
			{
				if((i==0 || i==1 || i==4 || i==5) && (j>0 && j<4))
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
		System.out.println();
		for(int i=0;i<6;i++)//AAA
		{
			for(int j=0;j<5;j++)
			{
				if((i==0 && j==2)||(i==1 && (j==1 || j==3)) || (i==2 && (j==0 || j==4))||(i==3)||((i==4 || i==5)&&(j==0 || j==4)))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
		System.out.println();
		for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==1&& j<5||i==2&&j<=1||i==2&&j>=5||i==3&&j<=1||i==3&&j>=5||i==4&&j<5||i==5&&j<=1||i==6&&j<=1)
                    System.out.print("* ");
                else
                     System.out.print("  ");
            }
            System.out.println();
        }
		try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
		System.out.println();
		for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==1&& j<5||i==2&&j<=1||i==2&&j>=5||i==3&&j<=1||i==3&&j>=5||i==4&&j<5||i==5&&j<=1||i==6&&j<=1)
                    System.out.print("* ");
                else
                     System.out.print("  ");
            }
            System.out.println();
        }
		try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
		System.out.println();
		for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if((i==1 && (j==1 || j==5))||(i==2 && (j==2 || j==4))||(i==3 || i==4 || i ==5) &&(j==3))
                    System.out.print("* ");
                else
                     System.out.print("  ");
            }
            System.out.println();
        }
		try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
		System.out.println();
		for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==1&& j<5||i==2&&j<=1||i==2&&j>=5||i==3&&j==1||i==3&&j>=5||i==4&&j<5||i==4&&j>5||i==5&&j==1||i==5&&j>=5||i==6&&j==1||i==6&&j>=5||i==7&&j<5)
                    System.out.print("* ");
                else
                     System.out.print("  ");
            }
            System.out.println();
        }
		try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
		System.out.println();
    for(int i=1;i<=7;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i==1&& j<=5||i==2&&j==5||i==3&&j==5||i==4&&j==5||i==5&&j==5||i==6&&j==5||i==7&&j<=5)
                System.out.print("* ");
            else
                 System.out.print(" ");
        }
        System.out.println();
    }
    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
    System.out.println();
            for(int i=1;i<=7;i++)
            {
                for(int j=1;j<=5;j++)
                {
                    if(i==1&& j<5||i==2&&j<=1||i==2&&j>=5||i==3&&j==1||i==3&&j>=5||i==4&&j<5||i==4&&j>5||i==5&&j==1||i==5&&j==3||i==6&&j==1||i==6&&j==4||i==7&&j==1||i==7&&j==5)
                        System.out.print("* ");
                    else
                         System.out.print("  ");
                }
                System.out.println();
            }
            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
    		System.out.println();
    for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==1&& j<=5||i==2&&j==5||i==3&&j==5||i==4&&j==5||i==5&&j==5||i==6&&j==5||i==7&&j==5)
                    System.out.print("* ");
                else
                     System.out.print(" ");
            }
            System.out.println();
        }
    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
    System.out.println();
    for(int i=1;i<=7;i++)
    {
        for(int j=1;j<=5;j++)
        {
            if(i==1&& j==1||i==1&&j==5||i==2&&j==1||i==2&&j==5||i==3&& j==1||i==3&&j==5||i==4&&j<=5||i==5&&j==1||i==5&&j==5||i==6&&j==1||i==6&&j==5||i==7&&j==1||i==7&&j==5)
                System.out.print("* ");
            else
                 System.out.print("  ");
        }
        System.out.println();
    }
    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
    System.out.println();
    //d
    for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i==1&& j<5||i==2&&j==1||i==2&&j>=5||i==3&&j==1||i==3&&j>=5||i==4&&j==1||i==4&&j>=5||i==5&&j==1||i==5&&j>=5||i==6&&j==1||i==6&&j>=5||i==7&&j<5)
                    System.out.print("* ");
                else
                     System.out.print("  ");
            }
            System.out.println();
        }
    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
    	System.out.println();
    //a
    for(int i=1;i<=7;i++)
    {
        for(int j=1;j<=5;j++)
        {
        	
            if(i==1&& j==2||i==1&&j==3||i==1&&j==4||i==2&&j<=1||i==2&&j>=5||i==3&&j==1||i==3&&j>=5||i==4&&j<=5||i==5&&j==1||i==5&&j>=5||i==6&&j==1||i==6&&j>=5||i==7&&j==1||i==7&&j>=5)
                System.out.print("* ");
            else
                 System.out.print("  ");
        }
        System.out.println();
    }
    try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
    System.out.println();
	for(int i=1;i<=6;i++)
    {
        for(int j=1;j<=5;j++)
        {
        	try{Thread.sleep(10);}catch(InterruptedException e){System.out.println(e);}
            if((i==1 && (j==1 || j==5))||(i==2 && (j==2 || j==4))||(i==3 || i==4 || i ==5) &&(j==3))
                System.out.print("* ");
            else
                 System.out.print("  ");
        }
        System.out.println();
    }
	try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
    System.out.println();
		for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=30;j++)
            {
            	try{Thread.sleep(10);}catch(InterruptedException e){System.out.println(e);}
                if((i==1 && (j==1 || (j>=6 && j<=9)||(j==13 || j==17 || j==18)||(j>=22 && j<=25)||(j>=27 && j<=29))||(i==2 &&(j==1 ||j==6 || j==12 || j==14 || j==17 || j==19 || j==22 || j==27 || j==30))||(i==3 &&(j==1 ||(j>=6 && j<=9)|| j==11 || j==15 || j==17 || j==20||(j>=22 && j<=25)||j==27 || j==29))||(i==4 && (j==1 || (j>=6 && j<=9)||(j>=11 && j<=15)||j==17||j==20||(j>=22 && j<=25)||j==27||j==28))||(i==5 && (j==1 || j==6||j==11||j==15||j==17||j==19||j==22||j==27||j==29))||(i==6 && ((j>=1 && j<5)||(j>=6 && j<=9)||j==11||j==15||j==17||j==18||(j>=22 && j<=25)||j==27||j==30))))
                    System.out.print("* ");
                else
                     System.out.print("  ");
            }
            System.out.println();
        }
	
	}
	public static void main(String[] args) {
		StarPatternEx s =new StarPatternEx();
		s.start();
	}
}
