public class Hello {
    public static void main(String[] args) {
        int v = 10;
          String name = "Atikur";
          int position = calculateHighScorePosition(v);
          displayHighScorePosition( position,name);


    }

    public static void displayHighScorePosition(int position,String name)
    {
        System.out.println(name+ " managed to get into position"+ position +"on high score list");
    }


    public static int calculateHighScorePosition(int score)
    {
        int value = 4;
        if(score >=1000)
        {
            value = 1;
        }
        else if(score >=500 && (score < 1000))
        {
            value =2;
        }
        else if(score >= 100 && (score < 500))
        {
            value =3;
        }
        else return value;

        return value;

    }
}
