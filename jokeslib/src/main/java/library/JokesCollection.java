package library;

import java.util.Random;

/**
 * Created by santosh on 12/28/15.
 */
public class JokesCollection {
    static String[] jokesArray = new String[]{"Q: Why do Farts stink? A: So that Deaf people can enjoy them too.",
            "Q: Why did the Hedgehog cross the road? A: To see his Flat Mate.",
            "Q: What do you call a Fish without an eye? A: A 'Fsh'!Q: Why do Farts stink? A: So that Deaf people can enjoy them too.",
            "Q: Why did the Hedgehog cross the road? A: To see his Flat Mate.",
            "Q: What do you call a Fish without an eye? A: A 'Fsh'!",
            "Q: Why does it take 1 million sperm to fertilize one egg? A: They won't stop to ask directions.",
            "Q: What's the difference between Big Foot and an intelligent man? A: Big Foot's been spotted several times.",
            "Q: What do you call a handcuffed man? A: Trustworthy.",
            "Q: What did the fish say when he hit a concrete wall? A: \"Dam\".",
            "Q: Why is divorce so expensive? A: Because it's worth it.",
            "Q. What is black, white and red all over? A. A skunk with nappy rash.",
            "Q. Why did the man jump out of the window? A. He wanted to catch a butterfly.",
            "Q. Why did the monkey put a piece of steak on his head? A. He thought he was a griller.",
            "Q. What do you call a deer with no eyes? A. No eye deer.",
            "Q. What do you call a deer with no eyes and no legs? A. Still no eye deer.",
            "Q. Why was six afraid of seven? A. Because seven eight nine.",
            "Q. Why did the dinosaur walk across the road? A. Because chickens were not invented yet.",
            "Q. What has four wheels and flies? A. A rubbish truck.",
            "Q. What's brown and sticky? A. A stick.",
            "Q. When were vowels invented? A. When u and i were born.",
            "Q. What's orange and sounds like a parrot? A. A carrot.",
            "Q. What do you call a sheep with no head and legs? A. A fuzz ball.",
            "Q. What do you call a fairy that hasn't bathed in a year? A. Stinkerbell.",
            "Q. When is it a good time to eat a window? A. When it's jammed.",
            "Q.Whats the difference between a tractor and a giraffe? A.One has hydraulics the other has highbollocks.",
            "Q. What kind of band doesn't play music? A. A highbred.",
            "Q. If one is single and two is a couple and three is a crowd, what is four and five? A. 9 (5+4)",
            "Q. What do you get when you cross a parrot and a lion? A. I don't know, but when it talks you'd better listen.",
            "Q. Why do giraffes have long necks? A. Because they have smelly feet."
    };

    public static String getJoke() {

        Random r = new Random();
        int jokesIndex = r.nextInt(jokesArray.length);
        return jokesArray[jokesIndex];

    }
}
