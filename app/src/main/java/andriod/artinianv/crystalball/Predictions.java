package andriod.artinianv.crystalball;

        public class Predictions {

    private static Predictions predictions;
            private String[] answers;

    private Predictions(){
        answers = new String[] {
          "Your wishes will come true.",
          "Your wishes will NEVER come true.",
          "I'm too lazy to answer.",
          "Yea that could happen.",
          "Nooooooooo NEVER."
        };

    }
public static Predictions get() {
    if (predictions == null) {
        predictions = new Predictions();

    }
   return predictions;
 }
            public String getPredictions() {
                return answers[3];
            }
}
