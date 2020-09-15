package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Display the given score for Team A
     * @param score is the value of the score to be displayed
     */
    public void displayTeamAScore(int score){
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }
    public void displayTeamBScore(int score){
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }

    /**
     * adds three points to the teamA score
     *
     */
    public void addThreePoints(View view){
        scoreTeamA += 3;
        displayTeamAScore(scoreTeamA);
    }
    /**
     * adds three points to the teamB score
     *
     */
    public void addThreePointsToB(View view){
        scoreTeamB += 3;
        displayTeamBScore(scoreTeamB);
    }
    /**
     * adds two points to the team score
     *
     */
    public void addTwoPoints(View view){
        scoreTeamA +=2;
        displayTeamAScore(scoreTeamA);
    }

    /**
     * adds two points to the teamB score
     *
     */
    public void addTwoPointsToB(View view){
        scoreTeamB +=2;
        displayTeamBScore(scoreTeamB);
    }
    /**
     * adds one point to the team score
     *
     */
     public void addPoint(View view){
        scoreTeamA +=1;
        displayTeamAScore(scoreTeamA);
     }
    /**
     * adds one point to the teamB score
     *
     */
    public void addPointToB(View view){
        scoreTeamB +=1;
        displayTeamBScore(scoreTeamB);
    }
    /**
     * resets the score to zero
     *
     */
     public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamAScore(scoreTeamA);
        displayTeamBScore(scoreTeamB);
     }

}