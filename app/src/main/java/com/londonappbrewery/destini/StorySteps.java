package com.londonappbrewery.destini;

/**
 * Created by Ran on 25/11/2017.
 */

public class StorySteps {

    private int mStoryID;
    private int mAnswer1ID;
    private int mAnswer2ID;

    public StorySteps(int story, int answer1, int answer2){
        mStoryID = story;
        mAnswer1ID = answer1;
        mAnswer2ID = answer2;
    }

    public int getStoryID() {
        return mStoryID;
    }

    public void setStoryID(int storyID) {
        mStoryID = storyID;
    }

    public int getAnswer1ID() {
        return mAnswer1ID;
    }

    public void setAnswer1ID(int answer1ID) {
        mAnswer1ID = answer1ID;
    }

    public int getAnswer2ID() {
        return mAnswer2ID;
    }

    public void setAnswer2ID(int answer2ID) {
        mAnswer2ID = answer2ID;
    }
}
