package _07_duck;

public class Duck {
	
	int numberOfFriends;
	String favoriteFood;
	
	void quack() {
		System.out.println("*quacks*");
	}
	
	void waddle() {
		System.out.println("*waddles*");
	}

	Duck(String favoriteFood, int numberOfFriends) {
	       this.favoriteFood = favoriteFood;
	       this.numberOfFriends = numberOfFriends;
	       System.out.println("Your Duck's favorite food is " + favoriteFood + ", and your Duck has " + numberOfFriends + " friends!" );
	}
}
