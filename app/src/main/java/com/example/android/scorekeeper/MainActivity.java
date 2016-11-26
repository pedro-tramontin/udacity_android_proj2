package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int foulsTeamA = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsTeamA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsTeamB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(fouls));
    }

    public void goalTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
    }

    public void foulTeamA(View view) {
        foulsTeamA = foulsTeamA + 1;
        displayFoulsTeamA(foulsTeamA);
    }

    public void goalTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
    }

    public void foulTeamB(View view) {
        foulsTeamB = foulsTeamB + 1;
        displayFoulsTeamB(foulsTeamB);
    }

    public void resetAll(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        foulsTeamA = 0;
        foulsTeamB = 0;

        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);

        displayFoulsTeamA(foulsTeamA);
        displayFoulsTeamB(foulsTeamB);
    }
}
