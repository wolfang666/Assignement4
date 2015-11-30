
public class GetResponse extends AliceServer {

	
	GetResponse(){
		
	}
	
	private String getAddress(){
		
		return "The Address of UVU is 800 W University Pkwy, Orem, UT, 84058.";
	}
	private String GetMyAge(){
		return "There are a lot of ways to answer that question I was born on 11/28/2015 \nI answered my first question correctly on 11/29/2015 \nbut I am not alive so it's not possible for me to say how old i am becuase age is a defined by being alive.";
	}
	private String GetHR(){
		return "The phone number for Human human resources is (801)863-8207";
	}
	private String GetUVUnumber(){
		return "The phone number for UVU is (801)863-4636";
	}
	
	public String respond(String myQuestion){
		String myAnswer = "Sorry, I am not to sure...";
		String question = myQuestion.toLowerCase();
		
		System.out.println(question);
		
		if((question.contains("where") || question.contains("located") || question.contains("location") || question.contains("address")) && (question.contains("uvu") || question.contains("utah valley university"))){
		myAnswer = getAddress();
		}
		
		if((question.contains("age") || question.contains("old") || question.contains("created") || question.contains("when")) && (question.contains("you") || question.contains("Alice"))){
			myAnswer = GetMyAge();
			}
		
		if((question.contains("hr") || question.contains("human resources")) && (question.contains("contact") || question.contains("number") || question.contains("call")) && (question.contains("uvu") || question.contains("utah valley university"))){
			myAnswer = GetHR();
		}
		if((question.contains("uvu") || question.contains("utah valley university")) && (question.contains("contact") || question.contains("number") || question.contains("call")) && !(question.contains("hr") || question.contains("human resources"))){
			myAnswer = GetUVUnumber();
		}
		
		
		return myAnswer;
	}
	
}
