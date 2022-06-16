import java.util.*;
class OnlineExamination{
	public static void main(String[] args){
		//Login
		Scanner in=new Scanner(System.in);
		String realid="19R21A04K7",realpassword="19R21A04K7";
		while(true){
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Welcome to Login Portal>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.print("Enter LoginId: ");
			String id,password;
			id=in.next();
			System.out.print("Enter Password: ");
			password=in.next();
			if(id.equals(realid) && password.equals(realpassword)){
			//Update Profile and Password
				Integer count=0;
				System.out.println("---------------------------------------------------------------------------------------");
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Welcome to Exam Portal>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("---------------------------------------------------------------------------------------");
			
				while(true){
					System.out.println("1.Exam\n2.Update Profile\n3.Logout");
					System.out.print("Enter Your Choice:");
					Integer n=in.nextInt();
					if(n==1){//Selecting answers for MCQs
						long examstarttime=System.currentTimeMillis();//Timer and auto submit
						long endtime=examstarttime+30*1000;
						while(System.currentTimeMillis()<endtime){
							System.out.println("---------------------------------------------------------------------------------------");
							System.out.println("Your Exam Exactly Starts Now and Your timer was on mode.\nCurrent time:"+System.currentTimeMillis());
							System.out.println("---------------------------------------------------------------------------------------");
							System.out.println("1.pow_r \n1.e 2.a 3.n 4.k 5.m");
							System.out.print("Enter Suitable letter: ");
							String s=in.next();
							if(s.equals("1")){
								count+=1;
							}
							System.out.println("---------------------------------------------------------------------------------------");
							System.out.println("Your Submitted First Question Successfully.\nNow Current time:"+System.currentTimeMillis());
							System.out.println("---------------------------------------------------------------------------------------");
							System.out.println("2._ello \n1.e 2.a 3.n 4.H 5.m");
							System.out.print("Enter Suitable letter: ");
							s=in.next();
							if(s.equals("4")){
								count+=1;
							}
							System.out.println("---------------------------------------------------------------------------------------");
							System.out.println("Your Submitted Second Question Successfully.\nNow Current time:"+System.currentTimeMillis());
							System.out.println("---------------------------------------------------------------------------------------");
							System.out.println("3.C_n \n1.e 2.a 3.n 4.c 5.m");
							System.out.print("Enter Suitable letter: ");
							s=in.next();
							if(s.equals("2")){
								count+=1;
							}
							System.out.println("---------------------------------------------------------------------------------------");
							System.out.println("Your Submitted Third Question Successfully.\nNow Current time:"+System.currentTimeMillis());
							System.out.println("---------------------------------------------------------------------------------------");
							System.out.println("4.pl_y \n1.e 2.a 3.n 4.y 5.m");
							System.out.print("Enter Suitable letter: ");
							s=in.next();
							if(s.equals("2")){
								count+=1;
							}
							System.out.println("---------------------------------------------------------------------------------------");
							System.out.println("Your Submitted Fourth Question Successfully.\nNow Current time:"+System.currentTimeMillis());
							System.out.println("---------------------------------------------------------------------------------------");
							System.out.println("5.Ha_py \n1.e 2.a 3.n 4.m 5.p");
							System.out.print("Enter Suitable letter: ");
							s=in.next();
							if(s.equals("5")){
								count+=1;
							}
							System.out.println("---------------------------------------------------------------------------------------");
							System.out.println("Your Submitted Fifth Question Successfully.\nNow Current time:"+System.currentTimeMillis());
							System.out.println("---------------------------------------------------------------------------------------");
						}
						System.out.println("Your Exam Finishes.\nYou Scored:"+(count*10));
					}
					else if(n==2){
						try{
							System.out.print("Enter Updated Id:");
							realid=in.next();
							System.out.print("Enter Updated Password");
							realpassword=in.next();
							System.out.println("Details Updated Successfully");
						}
						catch(Exception e){
							System.out.println("Failed to Update Details");
						}
						
					}
					else if(n==3){//Closing session and Logout
						System.exit(0); //Closing session and Logout
					}
					else{
						System.out.println("Enter valid choices");
					}
				}
			}
			else{
				System.out.println("Your Entered Details are Invalid.Try Again");
			}
		}
	}
}