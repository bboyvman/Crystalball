package andriod.artinianv.crystalball;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class VartanBall extends Activity {

    private TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vartan_ball);

        answerText = (TextView) findViewById(R.id.answerText);
        answerText.setText(Predictions.get().getPredictions());
    }

}
