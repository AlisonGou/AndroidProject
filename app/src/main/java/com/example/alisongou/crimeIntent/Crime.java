package com.example.alisongou.crimeIntent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by alisongou on 12/19/18.
 */

public class Crime {
    private UUID mId;
    private String mTitile;
    private Date mDate;
    private boolean mSolved;

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public Crime(){

        //generate unique identifier
        mId=UUID.randomUUID();
        mDate=new Date();

    }

    public UUID getmId() {
        return mId;
    }



    public String getmTitile() {
        return mTitile;
    }

    public void setmTitile(String mTitile) {
        this.mTitile = mTitile;
    }
}
