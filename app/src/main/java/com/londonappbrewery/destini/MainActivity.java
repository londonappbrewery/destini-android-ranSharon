package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mStoryTextView;
    Button mTopButoon;
    Button mBottomButoon;
    int mStoryIndex;


    private StorySteps[] storyBank = new StorySteps[] {
            new StorySteps(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new StorySteps(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new StorySteps(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButoon = (Button) findViewById(R.id.buttonTop);
        mBottomButoon = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 0){
                    displayNextStep(storyBank[2]);
                    mStoryIndex = 2;
                }
                else if(mStoryIndex == 1){
                    displayNextStep(storyBank[2]);
                    mStoryIndex = 2;
                }
                else if (mStoryIndex == 2){
                    mStoryTextView.setText(R.string.T6_End);
                    mTopButoon.setVisibility(View.GONE);
                    mBottomButoon.setVisibility(View.GONE);
                }

            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBottomButoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex == 0){
                    displayNextStep(storyBank[1]);
                    mStoryIndex = 1;
                }
                else if(mStoryIndex == 1){
                    mStoryTextView.setText(R.string.T4_End);
                    mTopButoon.setVisibility(View.GONE);
                    mBottomButoon.setVisibility(View.GONE);
                }
                else if (mStoryIndex == 2){
                    mStoryTextView.setText(R.string.T5_End);
                    mTopButoon.setVisibility(View.GONE);
                    mBottomButoon.setVisibility(View.GONE);
                }

            }
        });
    }
    public void displayNextStep(StorySteps nextStory){
        mStoryTextView.setText(nextStory.getStoryID());
        mTopButoon.setText(nextStory.getAnswer1ID());
        mBottomButoon.setText(nextStory.getAnswer2ID());
    }
}
