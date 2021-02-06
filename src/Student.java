public class Student {
	
	int id;
	String name;
	int score;
	
	Student(){                       //{ Student(){this(-1,"not intialized",-1)}}
		id=-1;
		name="not inialized";
		score=-1;
	}
	
	Student(int idArg, String nameArg, int scoreArg){
		id=idArg;
	    name=nameArg;
	    score=scoreArg;
	}
	
	int getId() {
		return id;
	}
	
	void setId(int id) {
		this.id=id;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	int getScore() {
		return score;
	}
	
	void setScore(int score) {
		this.score=score;
	}
	
}
